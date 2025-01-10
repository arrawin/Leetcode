class Solution {
    public List<String> wordSubsets(String[] words1, String[] words2) {
        int[] maxFreq = new int[26];  // Stores max frequency of each letter required by words2

        // Build the frequency requirements for the universal condition from words2
        for (String word : words2) {
            int[] freq = new int[26];
            for (char ch : word.toCharArray()) {
                freq[ch - 'a']++;
                maxFreq[ch - 'a'] = Math.max(maxFreq[ch - 'a'], freq[ch - 'a']);
            }
        }

        List<String> result = new ArrayList<>();

        // Check each word in words1 against the max frequency requirement
        for (String word : words1) {
            int[] freq = new int[26];
            for (char ch : word.toCharArray()) {
                freq[ch - 'a']++;
            }

            // Verify if word satisfies the universal condition
            boolean isUniversal = true;
            for (int i = 0; i < 26; i++) {
                if (freq[i] < maxFreq[i]) {
                    isUniversal = false;
                    break;
                }
            }

            if (isUniversal) {
                result.add(word);
            }
        }

        return result;
    }
}