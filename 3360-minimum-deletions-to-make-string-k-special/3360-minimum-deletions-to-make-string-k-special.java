import java.util.*;

class Solution {
    public int minimumDeletions(String word, int k) {
        HashMap<Character, Integer> freqMap = new HashMap<>();
        for (char ch : word.toCharArray()) {
            freqMap.put(ch, freqMap.getOrDefault(ch, 0) + 1);
        }

        ArrayList<Integer> freqs = new ArrayList<>(freqMap.values());
        Collections.sort(freqs);

        int minDel = Integer.MAX_VALUE;

        for (int i = 0; i < freqs.size(); i++) {
            int base = freqs.get(i);
            int deletions = 0;

            for (int freq : freqs) {
                if (freq > base + k) {
                    deletions += freq - (base + k);
                }
                else if(freq<base){
                    deletions += freq;

                }
            }

            minDel = Math.min(minDel, deletions);
        }

        return minDel;
    }
}