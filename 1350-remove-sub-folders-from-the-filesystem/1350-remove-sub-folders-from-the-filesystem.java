class Solution {
    public List<String> removeSubfolders(String[] folder) {
        int n = folder.length;
        Arrays.sort(folder);
        HashSet<String> set = new HashSet<>();
        List<String> li = new ArrayList<>();
        set.add(folder[0]);
        li.add(folder[0]);
        for(int i=1;i<n;i++){
            String s = folder[i];
            int j = s.length()-1;
            while(j>=0){
                if(s.charAt(j) == '/'){
                    String a = s.substring(0,j);
                    if(!set.isEmpty() && set.contains(a)){
                        break;
                    }
                }
                j--;
            }
            if(j<0){
                set.add(s);
                li.add(s);
            }
        }
        return li;
    }
}