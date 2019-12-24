package book.algo.ch6;

public class Fence {
    //solve 1
    int bruteForce(final int[] h) {
        int ret = 0;
        final int N = h.length;
        //가능한 모든 left, right 조합을 순회한다.
        for(int left = 0; left < N; ++left) {
            int minHeight = h[left];
            for(int right = left; right < N; ++right) {
                minHeight = Math.min(minHeight, h[right]);
                ret = Math.max(ret, (right - left + 1) * minHeight);
            }
        }
        return ret;
    }

    //solve 2
    //각 판자의 높이를 저장하는 배열
    int[] h= {7, 1, 5, 9, 6, 7, 3};
    //h[left...right] 구간에서 찾아낼 수 있는 가장 큰 사각형의 넓이를 반환한다.
    int solve(int left, int right) {
        //기저 시례: 판자가 하나밖에 없는 경우
        if(left == right) return h[left];
        //[left, mid], [mid + 1, right]의 두 구간으로 문제를 분할한다.
        int mid = (left + right) / 2;
        //분할한 문제를 각개격파
        int ret = Math.max(solve(left, mid), solve(mid+1, right));
        //부분 문제 3: 두 부분에 모두 걸치는 사각형 중 가장 큰 것을 찾는다.
        int lo = mid, hi = mid+1;
        int height = Math.min(h[lo], h[hi]);
        //[min, min + 1]만 포함하는 너비 2인 사각형을 고려한다.
        ret = Math.max(ret, height * 2);
        //사각형이 입력 전체를 덮을 때까지 확장해 나간다.
        while(left < lo || hi < right) {
            //항상 높이가 더 높은 쪽으로 확장한다.
            if(hi < right && (lo == left || h[lo-1] < h[hi+1])) {
                ++hi;
                height = Math.min(height, h[hi]);
            }
            else {
                --lo;
                height = Math.min(height, h[lo]);
            }
            //확장한 후 사각형의 넓이
            ret = Math.max(ret, height * (hi - lo + 1));
        }
        return ret;
    }
    public static void main(String str[]) {
        Fence f = new Fence();
        int[] h = {7, 1, 5, 9, 6, 7, 3};
        int res = f.bruteForce(h);

        int res1 = f.solve(0, 6);
    }
}
