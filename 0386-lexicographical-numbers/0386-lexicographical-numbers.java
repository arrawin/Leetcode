class Solution {
    private List<Integer> count;
    public List<Integer> lexCount(int n) {
        int currNum = 1;
         for(int i = 0 ; i < n ; i++){
            count.add(currNum);
            if(currNum*10 <= n){
                currNum*=10;
            }
            else{
                while(currNum%10==9 || currNum>=n){
                    currNum = currNum/10;
                }
                currNum++;

            }
         }
         return count;
    }
    public List<Integer> lexicalOrder(int n) {
        count = new LinkedList<>();
        return lexCount(n);
    }
}