package 승지니어.day7;

import java.util.Arrays;

/*
다음 내용 확인해서 기록할 것
1. sudoku
-스도쿠는 숫자 퍼즐로 가로 9칸, 세로 9칸으로 이루어져 있는 표
-1부터 9까지 숫자를 채워 넣는 퍼즐
-숫자는 한번씩만 쓸 수 있다
-규칙:
    3x3의 작은 격자 또한 1에서 9까지의 숫자가 겹치지 않게 들어가야 한다
    9 가로줄에 숫자가 1부터 9까지 하나씩만 들어가야 한다
    9 세로줄에 숫자가 1부터 9까지 하나씩만 들어가야 한다

2. Arrays 패키지

3. Character 패키지
 */
public class Solution2 {
    public boolean isValidSudoku(char[][] board) {
        boolean[] b = new boolean[9];
        //룰의 종류, 가로, 세로, 섭그리드
        for(int i = 0; i < 3; i++) {
            //한줄의 규칙
            for(int j = 0; j < 9; j++) {
                Arrays.fill(b, false);//b 배열의 값을 모두 false로 초기화한다.
                for(int k = 0; k < 9; k++) {
                    char cur = '.';
                    if(i == 0) {
                        //가로
                        cur = board[j][k];
                    } else if(i == 1) {
                        //세로
                        cur = board[k][j];
                    } else {
                        //섭그리드
                        cur = board[j/3*3+k/3][j%3*3+k%3];
                    }
                    if(cur == '.') continue;
                    int val = Character.getNumericValue(cur);//unicode 문자를 정수로 반환한다.
                    if(b[val - 1]) return false;
                    b[val - 1] = true;
                }
            }
        }
        return true;
    }
}
