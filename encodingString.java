package DAY9;

public class encodingString {
    public static void encoded(String s) {
        String newString = "";
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (s.charAt(i) == 'X' || s.charAt(i) == 'Y' || s.charAt(i) == 'Z' || s.charAt(i) == 'x'
                    || s.charAt(i) == 'y' || s.charAt(i) == 'z') {
                ch -= 26;
            }
            ch += 3;
            newString += ch;
        }
        System.out.println(newString);
    }

    public static void main(String[] args) {
        String s = "XYZ";
        encoded(s);
    }
}
