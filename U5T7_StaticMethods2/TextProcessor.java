import java.util.List;

public class TextProcessor {

    // Method to process a list of strings
    public void analyzeTexts(List<String> texts) {
        for (String text : texts) {
            TextAnalyzer analyzer = new TextAnalyzer(text);
            System.out.println("Original Text: " + text);
            System.out.println("Reversed Text: " + analyzer.getReversedText());
            System.out.println("Vowel Count: " + analyzer.getVowelCount());
            System.out.println();
        }
    }

    // Method to summarize analysis for a list of strings
    public void summarizeAnalysis(List<String> texts) {
        int totalVowels = 0;
        System.out.println("=== Summary of Text Analysis ===");
        for (String text : texts) {
            int vowels = StringUtils.countVowels(text); // Calling the utility class directly
            totalVowels += vowels;
            System.out.println("Text: \"" + text + "\" has " + vowels + " vowels.");
        }
        System.out.println("Total Vowels Across All Texts: " + totalVowels);
    }

    // Start method to launch the program
    public void start() {
        List<String> sampleTexts = List.of("Hello", "World", "Java Programming", "Utility Classes");
        System.out.println("=== Analyzing Texts ===");
        analyzeTexts(sampleTexts);
        summarizeAnalysis(sampleTexts);
    }
}