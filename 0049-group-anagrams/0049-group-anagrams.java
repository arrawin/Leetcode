class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
     HashMap <String , List<String>> freqMap = new HashMap<>();
     for(String str : strs){
        char[] charArray = str.toCharArray(); 
        Arrays.sort(charArray);
        String sorted = new String(charArray);
        freqMap.putIfAbsent(sorted, new ArrayList<>());
        freqMap.get(sorted).add(str);
        }
      return new ArrayList<>(freqMap.values());
        
    }
}