import java.util.*;

class Solution {

    // Function to determine if a word can be formed by concatenating other words in the set
    public boolean is(String word, Set<String> map,Map<String,Boolean> memo) {
        // If the word is already checked, return the memoized result
        if (memo.containsKey(word)) {
            return memo.get(word);
        }

        // Loop through the word, trying to split it into prefix and suffix
        for (int i = 0; i < word.length(); i++) {
            // Prefix is the part from the beginning to the current index
            String prefix = word.substring(0, i + 1);
            // Suffix is the part from the current index to the end
            String suffix = word.substring(i + 1);

            // Check if:
            // 1. Both the prefix and suffix are in the set (both are valid words)
            // 2. The prefix is in the set, and the suffix can be formed recursively
            if ((map.contains(prefix) && map.contains(suffix)) || (map.contains(prefix) && is(suffix, map,memo))) {
                // Memoize the result for this word as true (it can be formed by concatenation)
                memo.put(word, true);
                return true;
            }
        }

        // If no valid prefix and suffix found, memoize the result as false
        memo.put(word, false);
        return false;
    }

    // Function to find all concatenated words in a dictionary
    public List<String> findAllConcatenatedWordsInADict(String[] words) {
        // Initialize the memoization map
       HashMap<String,Boolean> memo = new HashMap<>();
        // Set to store all words for quick lookup
        HashSet<String> map = new HashSet<>();
        // List to store the final result
        ArrayList<String> result = new ArrayList<>();

        // Add all words to the set for easy lookup
        for (String word : words) {
            map.add(word);
        }

        // Iterate through each word in the dictionary
        for (String word1 : words) {
            // Check if the word can be formed by concatenation
            if (is(word1, map,memo)) {
                // If it can, add it to the result list
                result.add(word1);
            }
        }

        // Return the list of concatenated words
        return result;
    }
}

        