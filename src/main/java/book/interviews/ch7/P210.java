package book.interviews.ch7;

public class P210 {
    public static void removeChars(StringBuilder str, String remove) {
        boolean[] flags = new boolean[128]; //ASCII로 가정한다.
        int src, dst = 0;

        //삭제할 문자 플래그를 설정한다.
        for(char c: remove.toCharArray()) {
            flags[c] = true;
        }

        //모든 문자에 대해서 순환문을 돌리면서
        //플래그가 설정되지 않은 경우에만 복사한다.
        for(src = 0; src < str.length(); ++src) {
            char c = str.charAt(src);
            if(!flags[c]) {
                str.setCharAt(dst++, c);
            }
        }
        str.setLength(dst);
        return;
    }
    public static void main(String arg[]) {
        StringBuilder sb = new StringBuilder();
        sb.append("abcd");
        P210.removeChars(sb, "c");
        System.out.println(sb.toString());
    }
}
