package book.interviews.ch7;

import java.util.HashMap;

public class P206 {
    public static String firstNonRepeated(String str) {
        HashMap<Integer, Object> charHash = new HashMap<>();
        Object seenOnce = new Object();
        Object seenmultiple = new Object();
        Object seen;
        int i;
        final int length = str.length();
        //str을 훑으면서 해시 테이블을 만든다.
        for(i = 0; i < length; ) { //i++ 코드는 일부러 뺐음
            final int cp = str.codePointAt(i);
            i += Character.charCount(cp);//코드 포인트 기준으로 이동
            seen = charHash.get(cp);
            if(seen == null) {
                charHash.put(cp, seenOnce);
            } else {
                if(seen == seenOnce) {
                    charHash.put(cp,seenmultiple);
                }
            }
        }
        //str에 있는 문자를 해시 테이블에서 검색
        for(i = 0; i < length; ) {
            final int cp = str.codePointAt(i);
            i += Character.charCount(cp);
            if(charHash.get(cp) == seenOnce) {
                return new String(Character.toChars(cp));
            }
        }
        return null;
    }
    public static void main(String arg[]) {
        String res = P206.firstNonRepeated("apple");


    }
}
