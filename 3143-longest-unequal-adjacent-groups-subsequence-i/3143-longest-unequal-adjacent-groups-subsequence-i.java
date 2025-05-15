import java.util.*;

class Solution {
    public List<String> getLongestSubsequence(String[] words, int[] groups) {
        List<String> endWith0 = new ArrayList<>();
        List<String> endWith1 = new ArrayList<>();

        for (int i = 0; i < words.length; i++) {
            String word = words[i];
            int group = groups[i];

            if (group == 0) {
                if (endWith1.size() + 1 > endWith0.size()) {
                    endWith0 = new ArrayList<>(endWith1);
                    endWith0.add(word);
                }
            } else {
                if (endWith0.size() + 1 > endWith1.size()) {
                    endWith1 = new ArrayList<>(endWith0);
                    endWith1.add(word);
                }
            }
        }

        return (endWith0.size() > endWith1.size()) ? endWith0 : endWith1;
    }
}