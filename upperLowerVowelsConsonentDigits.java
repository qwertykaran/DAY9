package DAY9;

public class upperLowerVowelsConsonentDigits {
    public static void upperLowerCount(String s1) {
        int upperCase = 0;
        int lowerCase = 0;
        for (int i = 0; i < s1.length(); i++) {
            char ch = s1.charAt(i);
            if (Character.isLowerCase(ch)) {
                lowerCase += 1;
            } else if (Character.isUpperCase(ch)) {
                upperCase += 1;
            }
        }
        System.out.println("Upper case letters:" + upperCase);
        System.out.println("Lower case letters:" + lowerCase);
    }

    public static void digitSpecialCount(String s1) {
        int count = 0;
        int speacial = 0;
        for (int i = 0; i < s1.length(); i++) {
            char ch = s1.charAt(i);
            if (Character.isDigit(ch)) {
                count += 1;
            }
            if (!Character.isLetterOrDigit(ch)) {
                speacial += 1;
            }
        }
        System.out.println("Digits:" + count);
        System.out.println("Special Charaters:" + speacial);
    }

    public static void vowelConsonentCount(String s1) {
        int vowelC = 0;
        int consonentC = 0;
        String vowels = "AEIOUaeiou";
        for (int i = 0; i < s1.length(); i++) {
            char ch = s1.charAt(i);
            if (vowels.indexOf(ch) != -1) {
                vowelC += 1;
            } else if (Character.isLetter(ch)) { // If it's a letter and not a vowel, it's a consonant
                consonentC += 1;
            }

        }
        System.out.println("Vowels:" + vowelC);
        System.out.println("Consonents" + consonentC);
    }

    public static void main(String[] args) {
        String s1 = "Artificial InTeLLiGencE 123";
        upperLowerCount(s1);
        digitSpecialCount(s1);
        vowelConsonentCount(s1);
    }
}
