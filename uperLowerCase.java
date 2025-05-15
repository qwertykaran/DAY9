package DAY9;

public class uperLowerCase {
    public static void uperLowerCaseConcatenation(String s1) {
        String upperCase = "";
        String lowerCase = "";
        for (int i = 0; i < s1.length(); i++) {
            char ch = s1.charAt(i);
            if (Character.isLowerCase(ch)) {
                lowerCase += ch;
            } else if (Character.isUpperCase(ch)) {
                upperCase += ch;
            }
        }
        System.out.println("Upper case letters:" + upperCase);
        System.out.println("Lower case letters:" + lowerCase);
    }

    public static void main(String[] args) {
        String s1 = "Artificial InTeLLiGencE";
        uperLowerCaseConcatenation(s1);
    }
}
