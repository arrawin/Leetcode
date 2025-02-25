class Solution {
    public boolean hasSameDigits(String s) {
        while(s.length()>2){
            String temp="";
            for(int i=0;i<s.length()-1;i++){
                   String sub=s.substring(i , i+2);
                    int n =Integer.parseInt(sub);
                    int neww=n%10;
                    n/=10;
                    neww+=n;
                    neww%=10;
                    String str=Integer.toString(neww);
                    temp+=str;
            }
            s=temp;
        }
        return s.charAt(0)==s.charAt(1);
    }
}