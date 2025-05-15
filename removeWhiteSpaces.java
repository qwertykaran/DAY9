package DAY9;

public class removeWhiteSpaces {
    public static void removeSpaces(String s1) {
        String s2 = "";
        for (int i = 0; i < s1.length(); i++) {
            char ch = s1.charAt(i);
            if (!Character.isWhitespace(ch)) {
                s2 += ch;
            }
        }
        System.out.println("Updated String:" + s2);
    }

    public static void main(String[] args) {
        String s1 = "Artificial InTeLLiGencE";
        removeSpaces(s1);
    }
}
