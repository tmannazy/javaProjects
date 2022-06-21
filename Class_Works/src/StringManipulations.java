package src;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class StringManipulations {
    public static void main(String[] args) {
        String s = "abcdabcdabca";

        char[] arr = s.toCharArray();
        int count = 0;
        System.out.println(countOfChars(s, count));

        System.out.println("SemicolonAfrica".regionMatches(0, "SemiColon", 0, 9));
        System.out.println("SemicolonAfrica".regionMatches(true,0, "SemiColon", 0, 5));

    }

    private static int countOfChars(String s, int count) {
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == 'a')
                count++;
        }
        return count;
    }
}
