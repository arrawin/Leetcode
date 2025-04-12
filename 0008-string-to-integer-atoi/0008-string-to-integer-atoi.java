class Solution {
    public int myAtoi(String s) {
        s=s.trim();
        long a=0;
        int count=0;
        char[] ch=s.toCharArray();
        boolean flag =false;
        for(int i=0;i<ch.length;i++){
            if(ch[i]=='-'&&i==0){
                flag=true;
                continue;
            }
            if(ch[i]=='+'&&i==0){
                flag=false;
            }
            else if(Character.isDigit(ch[i])){
                a=a*10+(int)(ch[i]-'0');
                if(a!=0)
                count++;
            }
            else{
                break;
            }
        }
        if(a<Math.pow(-2,31)||a>Math.pow(2,31)-1||count>10){
            if(flag){
                return Integer.MIN_VALUE;
            }else return Integer.MAX_VALUE;
        }

        if(flag) {
            a*=-1;
        return (int)a;
        } 
        return (int)a;
    }
    }