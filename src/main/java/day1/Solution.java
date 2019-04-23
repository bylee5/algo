package day1;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Solution {
    public static void main(String[] args) throws Exception {

        String[] phone_book = {"119", "97674223", "1195524421"};
        System.out.println(solution1(phone_book));

        String[] phone_book1 = {"123","456","789"};
        System.out.println(solution1(phone_book1));

        //way 2
        System.out.println(solution2(phone_book));
        System.out.println(solution2(phone_book1));
    }

    public static boolean solution1(String[] phone_book) throws Exception {
        boolean answer = true;
        //1. 0번째와 나머지 번째를 비교한다.
        String pattern = "^"+phone_book[0];
        Pattern p = Pattern.compile(pattern);

        if(phone_book.length > 1000000 || phone_book[0].length() < 0 || phone_book[0].length() > 20)
           throw new Exception();

        for (int i = 1; i < phone_book.length; i++){
            if(phone_book[i].length() < 0 || phone_book[i].length() > 20)
                return false;
            Matcher m = p.matcher(phone_book[i]);
            if(m.find())
                return false;
        }
        return answer;
    }

    public static boolean solution2(String[] phone_book) {
        boolean answer = true;

        // 1. 첫 대상 추출

        // 2. 비교
        for (int i = 1; i < phone_book.length; i++){
            if(phone_book[0].equals(phone_book[i].substring(0, phone_book[0].length())))
                return false;
        }

        return answer;
    }
}
