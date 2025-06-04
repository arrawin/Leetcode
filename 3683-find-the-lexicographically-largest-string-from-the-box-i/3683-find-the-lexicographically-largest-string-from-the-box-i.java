class Solution {
    public String answerString(String word, int numFriends) {
        int n=word.length();
        char ch='\0';
        int L=n-numFriends+1;
        if(numFriends==1){
            return word;
        }
        List<Integer> ls=new ArrayList<>();
        for(char cs:word.toCharArray()){
            if(cs>ch){
                ch=cs;
            }
        }
        for(int i=0;i<n;i++){
            if(word.charAt(i)==ch){
                ls.add(i);
            }
        }
        String largest="";
        for(int N:ls){
            String subString=(N+L)<=n?word.substring(N,N+L):word.substring(N);
            if(subString.compareTo(largest)>0){
                largest=subString;
            }
        }
        return largest;

    }
}