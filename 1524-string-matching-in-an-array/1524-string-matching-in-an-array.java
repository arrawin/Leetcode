class Solution {
    public List<String> stringMatching(String[] words) {
        ArrayList<String> list = new ArrayList<>();
        for(int i = 0 ; i < words.length ; i++){
            for(int j = 0 ; j < words.length ; j++){
            if(i!=j && !list.contains(words[i]) && words[j].indexOf(words[i])!=-1){
                list.add(words[i]);
            }
            }
        }
        return list;
    }
}