public class StringUtils {

    // Private constructor to prevent instantiation
    private StringUtils() {}

    // Public static method 1: Reverses the input string
    public static String reverseString(String input) {
        //A Call to helper method
        return reverseHelper(input);
    }

    // Public static method 2: Counts vowels in the input string
    public static int countVowels(String input) {
        int count = 0;
        for (int i = 0; i < input.length(); i++) {
            if (isVowel(input.charAt(i))) {
                count++;
            }
        }
        return count;
    }

    // Private static helper method: Reverse string logic
    private static String reverseHelper(String input) {
        StringBuilder reversed = new StringBuilder(input);
        return reversed.reverse().toString();
    }

    // Private static helper method: Checks if the character is a vowel
    private static boolean isVowel(char c) {
        char lower = Character.toLowerCase(c);
        return lower == 'a' || lower == 'e' || lower == 'i' || lower == 'o' || lower == 'u';
    }
}