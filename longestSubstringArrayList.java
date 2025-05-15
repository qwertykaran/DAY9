package DAY9;

import java.util.ArrayList;

public class longestSubstringArrayList {
    public static int longest_substring(String s) {
        int maxlen = 0;
        ArrayList<Character> list = new ArrayList<>();
        int start = 0, end = 0;
        while (end < s.length()) {
            if (!list.contains(s.charAt(end))) {
                list.add(s.charAt(end));
                end++;
                maxlen = Math.max(maxlen, list.size());
            } else {
                list.remove(Character.valueOf(s.charAt(start)));
                start++;
            }

        }
        return maxlen;
    }

    public static void main(String[] args) {
        String s = "abcabcab";
        System.out.println("Length of longest substring is :" + longest_substring(s));

    }
}