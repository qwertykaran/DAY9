package DAY9;

import java.util.ArrayList;

public class longestSubstring {
    public static void longestUniqueSubstring(String s) {
        ArrayList<Character> window = new ArrayList<>();
        int maxLen = 0;
        String longest = "";

        for (char c : s.toCharArray()) {
            if (window.contains(c)) {
                int index = window.indexOf(c);
                // Remove characters up to and including the duplicate
                for (int i = 0; i <= index; i++) {
                    window.remove(0);
                }
            }
            window.add(c);

            if (window.size() > maxLen) {
                maxLen = window.size();
                StringBuilder sb = new StringBuilder();
                for (char ch : window) {
                    sb.append(ch);
                }
                longest = sb.toString();
            }
        }

        System.out.println(longest);
        System.out.println(maxLen);
    }

    public static void main(String[] args) {
        longestUniqueSubstring("pwwkew");
    }
}
