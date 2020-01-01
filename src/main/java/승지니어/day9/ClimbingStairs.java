package 승지니어.day9;

/*
1 2 3 5 8: 피보나치 수열
f(n) = f(n-1)+f(n2)
f(5) = f(4)+f(3)
f(4) = f(3)+f(2)
그냥 재귀구현을 하면: 공간 복잡도 O(1), 시간 복잡도 O(2^n)
만약 중간 결과를 따로 저장한다면:
f(2) = 2
f(3) = 3
다이나믹 프로그래밍 -> 공간 복잡도 O(n), 시간 복잡도 O(n)

=> 점화식을 찾아야 한다.
 */
public class ClimbingStairs {
    public int climbstairs(int n) {
        if(n <= 0) return 0;
        if(n == 1) return 1;

        int[] d = new int[n+1];//바로 계산하기 위해 +1해줌
        d[1] = 1;
        d[2] = 2;
        for(int i = 3; i <= n; i++) {
           d[i] = d[i-1] + d[i-2];
        }
        return d[n];
    }
}
