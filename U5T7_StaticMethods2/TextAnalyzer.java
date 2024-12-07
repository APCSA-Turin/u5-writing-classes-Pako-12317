public class TextAnalyzer {

    // Instance variable
    private String text;

    // Constructor
    public TextAnalyzer(String text) {
        this.text = text; // Set the text
    }

    // Instance method 1: Get the reversed version of the text
    public String getReversedText() {
        //B Using instance variable 'text'
        return StringUtils.reverseString(this.text); //E Calling utility class method
    }

    // Instance method 2: Get the count of vowels in the text
    public int getVowelCount() {
        //B Using instance variable 'text'
        return StringUtils.countVowels(this.text); //E Calling utility class method
    }

    // Private helper method: Checks if the text has vowels
    @SuppressWarnings("unused")
    private boolean hasVowels() {
        return getVowelCount() > 0; //C Calling another instance method
    }

    // Public static method: Displays a message about the text
    public static String getInfo(String text) {
        TextAnalyzer analyzer = new TextAnalyzer(text);
        return "Text Analysis: " + analyzer.getReversedText() + ", Vowels: " + analyzer.getVowelCount();
    }
}