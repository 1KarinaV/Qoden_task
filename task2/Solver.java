import java.util.*;

public class Solver {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        String[] words = input.split(" ");

        Map<String, Integer> wordCounts = new HashMap<>();
        for (String word : words) {
            wordCounts.put(word, wordCounts.getOrDefault(word, 0) + 1);
        }

        List<Map.Entry<String, Integer>> sortedEntries = new ArrayList<>(wordCounts.entrySet());
        sortedEntries.sort(Map.Entry.comparingByValue());

        int maxCount = sortedEntries.get(sortedEntries.size() - 1).getValue();

        int maxWordLength = getMaxWordLength(sortedEntries);

        for (Map.Entry<String, Integer> entry : sortedEntries) {
            String word = entry.getKey();
            int count = entry.getValue();
            int barLength = Math.round((float) count / maxCount * 10);

            String paddedWord = padWord(word, maxWordLength);
            String bar = generateBar(barLength);

            System.out.println(paddedWord + " " + bar);
        }
    }

    private static int getMaxWordLength(List<Map.Entry<String, Integer>> entries) {
        int maxWordLength = 0;
        for (Map.Entry<String, Integer> entry : entries) {
            String word = entry.getKey();
            maxWordLength = Math.max(maxWordLength, word.length());
        }
        return maxWordLength;
    }

    private static String padWord(String word, int maxLength) {
        if (word.length() < maxLength) {
            int numUnderscores = maxLength - word.length();
            StringBuilder paddedWord = new StringBuilder();
            for (int i = 0; i < numUnderscores; i++) {
                paddedWord.append("_");
            }
            paddedWord.append(word);
            return paddedWord.toString();
        }
        return word;
    }

    private static String generateBar(int barLength) {
        StringBuilder bar = new StringBuilder();
        for (int i = 0; i < barLength; i++) {
            bar.append(".");
        }
        return bar.toString();
    }
}
