package book.algo.ch6;

public class QuadTree {
    static int c = 0;
    char[][] decompressed = {
            {'x', 'x'},
            {'x', 'x'}
    };
    void decompress(char[] it, int y, int x, int size) {
        //한 글자를 검사할 때마다 반복자를 한 칸 앞으로 옮긴다.
        char head = it[c++];
        //기저 사례: 첫 글자가 b또는 w인 경우
        if(head == 'b' || head == 'w') {
            for(int dy = 0; dy < size; ++dy)
                for(int dx = 0; dx < size; ++dx)
                    decompressed[y+dy][x+dx] = head;
        }
        else {
            //네 부분을 각각 순서대로 압축 해제한다.
            int half = size/2;
            decompress(it, y, x, half);
            decompress(it, y, x+half, half);
            decompress(it, y+half, x, half);
            decompress(it, y+half, x+half, half);
        }
    }
    static int c1 = 0;
    String reverse(char[] it) {
        char head = it[c1++];
        if(head == 'b' || head == 'w')
            return String.valueOf(head);
        String upperLeft = reverse(it);
        String upperRight = reverse(it);
        String lowerLeft = reverse(it);
        String lowerRight = reverse(it);
        return "x" + lowerLeft + lowerRight + upperLeft + upperRight;
    }
    public static void main(String str[]) {
        QuadTree d = new QuadTree();

        char[] it = {'x', 'b', 'w', 'w', 'b'};
        d.decompress(it, 0, 0, 2);
        String res = d.reverse(it);
    }
}
