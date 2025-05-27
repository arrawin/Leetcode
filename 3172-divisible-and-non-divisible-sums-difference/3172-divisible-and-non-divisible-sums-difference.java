class Solution {
    public int differenceOfSums(int n, int m) {
        int sumindiv=0;
        int sumdiv=0;
        for(int i=1;i<=n;i++){
            if(i%m!=0){
                 sumindiv+=i;
            }
            else{
                sumdiv+=i;
            }
        }
    
        return sumindiv-sumdiv;
}
}