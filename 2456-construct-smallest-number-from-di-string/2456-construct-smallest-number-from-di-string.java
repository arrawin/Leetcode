class Solution {
    public String smallestNumber(String pattern) {
        int n = pattern.length();
        Stack<Integer> stack = new Stack<>();
       Stack<Integer> res = new Stack<>();
        for (int i=0; i<=n; i++){
            stack.push(i+1);
            while(!stack.isEmpty() && (i==pattern.length() || pattern.charAt(i) == 'I')){
                res.push(stack.pop());
            }
        }
        StringBuilder sb = new StringBuilder();
        for (int num : res) {
            sb.append(num);
        }

        String result = sb.toString();
        return result;
       
        }
    }
    