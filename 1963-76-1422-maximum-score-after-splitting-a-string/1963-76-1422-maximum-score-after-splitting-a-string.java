class Solution {
    public int maxScore(String s) {
    int zeroVal = 0 , onesVal = 0 , maxVal = Integer.MIN_VALUE;
    for(int i = 0 ; i < s.length() ; i++){
        if(s.charAt(i)-'0'==1){
            onesVal++;   // we are getting values of 1 first 
        }
    }
    for(int i = 0 ; i < s.length()-1 ; i++){ // s.length()-1 because if it is s.length() then there will be no right substring
        if(s.charAt(i)-'0'==0){
            zeroVal++;  //if 0 means add it to zeroVal
        }
        else{
            onesVal--; //because if it is one means it is getting added to left substring(does not add in zeroVal) but it is removed from right substring , hence onesVal--
        }
        maxVal = Math.max(maxVal,(onesVal+zeroVal));
    }
    return maxVal;
            }
        
    }
