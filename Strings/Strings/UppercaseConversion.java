package Strings;

public class UppercaseConversion {

    // Helper method to check if a word is entirely uppercase letters
    public static boolean isAllUpperCase(String word) {
        boolean hasLetter = false;
        for (int i = 0; i < word.length(); i++) {
            char c = word.charAt(i);
            if (Character.isLetter(c)) {
                hasLetter = true;
                if (!Character.isUpperCase(c)) {
                    return false; // Found a lowercase letter
                }
            }
        }
        return hasLetter;
    }

    public static String toTitleCase(String sentence) {
        if (sentence == null || sentence.isEmpty()) {
            return sentence;
        }

        // Split the sentence into words using spaces as delimiters
        String[] words = sentence.split("\\s+");
        StringBuilder result = new StringBuilder();

        for (String word : words) {
            if (!word.isEmpty()) {
                // Capitalize the first letter
                char firstChar = Character.toUpperCase(word.charAt(0));
                String restOfWord;

                // If the word is already all uppercase, keep it as is.
                // Otherwise, convert the rest of the letters to lowercase.
                if (isAllUpperCase(word)) {
                    restOfWord = word.substring(1);
                } else {
                    restOfWord = word.substring(1).toLowerCase();
                }

                // Append the full word and a space to our result
                result.append(firstChar).append(restOfWord).append(" ");
            }
        }

        // .trim() removes the extra space added at the very end
        return result.toString().trim();
    }

    public static void main(String[] args) {
        String text = "hello WORLD from JAVA programming";
        System.out.println("Original: " + text);
        System.out.println("Capitalized: " + toTitleCase(text));
        // Output: Hello WORLD From JAVA Programming
    }
}