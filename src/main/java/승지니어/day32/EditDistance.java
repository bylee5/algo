package 승지니어.day32;

public class EditDistance {
    public int minDistance(String word1, String word2) {
        int len1 = word1.length();
        int len2 = word2.length();
        //d[i][j]
        //word1의 i까지의 부분문자열을 word2의 j까지의 부분문자열로 교체하기 위한 최소 작업 수
        //abc, def d[1][1]: a->b 1
        int[][] d = new int[len1+1][len2+1];
        //초기화
        //i: word1의 부분문자열
        //j: ""
        for(int i = 0; i <= len1; i++) {
            d[i][0] = i;
        }
        for(int j = 0; j <= len2; j++) {
            d[0][j] = j;
        }

        //루프
        for(int i = 1; i <= len1; i++) {
            for(int j = 1; j <= len2; j++) {
                if(word1.charAt(i -1) == word2.charAt(j - 1)) {
                    d[i][j] = d[i-1][j-1];
                } else {
                    d[i][j] = Math.min(d[i-1][j-1], Math.min(d[i-1][j],d[i][j-1]))+1;
                }
            }
        }
        //리턴
        return d[len1][len2];
    }
}
