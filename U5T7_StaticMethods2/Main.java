public class Main {
    public static void main(String[] args) {
        // Test instance methods using a sample text
        TextAnalyzer analyzer = new TextAnalyzer("Hello World");

        // Test getReversedText method
        System.out.println("Reversed Text: " + analyzer.getReversedText());

        // Test getVowelCount method
        System.out.println("Vowel Count: " + analyzer.getVowelCount());

        // Test static method getInfo
        System.out.println(TextAnalyzer.getInfo("Test Text"));
        
        // Test reverseString method
        String input = "Hello";
        System.out.println("Reversed: " + StringUtils.reverseString(input));
 
        // Test countVowels method
        System.out.println("Number of vowels: " + StringUtils.countVowels(input));
    }
}
