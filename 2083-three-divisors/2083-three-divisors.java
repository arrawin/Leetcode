class Solution {
    public boolean isThree(int n) {
        int num = (int)Math.sqrt(n);
        if(num<2 || num*num!=n ){ return false;}
        for(int i = 2 ; i*i <= num ; i++){
            if(num%i==0){
                return false;
            }
        }
        return true;
    }
}