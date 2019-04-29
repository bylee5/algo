package kakao;

public class P3 {
    public static long findRange(int num) {
        // Write your code here
        long res = 0;
        String s = Integer.toString(num);
        res = Long.parseLong(s);

        String s1 = "";
        String s2 = "";
        for(int i = 0; i < s.length(); i++){
            if(!"9".equals(s.charAt(i)+"")){
                s1 = s.replaceAll(s.charAt(i)+"", "9");
                break;
            }
        }

        for(int i = 1; i < s.length(); i++){
            if(!"1".equals(s.charAt(0)+"")){
                s2 = s.replaceAll(s.charAt(0)+"", "1");
                break;
            }
            if(!"0".equals(s.charAt(i)+"")){
                s2 = s.replaceAll(s.charAt(i)+"", "0");
                break;
            }
        }

        if(s.length() > 1) {
            res = Long.parseLong(s1) - Long.parseLong(s2);

        }
        return res;
    }
}
