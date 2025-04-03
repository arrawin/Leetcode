class Solution {
    public String clearDigits(String s) {
       Stack<Character> stack = new Stack<>();
       int len = 0;
       for(int i = 0 ; i < s.length() ; i++)
       {
        if(s.charAt(i)>=97 && s.charAt(i)<=122){
            stack.push(s.charAt(i));
            len++;
        }
        else{
            stack.pop();
            len--;
        }
       }
       StringBuilder str = new StringBuilder(len);
       for(char ch : stack){
              str.append(ch);
       }
       return str.toString();
       }
    
    }