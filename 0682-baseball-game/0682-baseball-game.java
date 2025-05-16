class Solution {
    public int calPoints(String[] operations) {
        Stack<Integer> st = new Stack<>();
        String s;
        for(int ind = 0 ; ind < operations.length ; ind++){
            s = operations[ind];
            if(s.equals("C")){
                if(!st.isEmpty()){
                    st.pop();
                }
            }
            else if(s.equals("D")){
                if(!st.isEmpty()){
                    int ele = st.peek();
                    st.push(ele*2);
                }
            }
            else if(s.equals("+")){
                if(!st.isEmpty()){
                    int top = st.pop();
                    int second_top = st.peek();
                    st.push(top);
                    st.push(second_top + top);
                }
            }
            else{
                  st.push(Integer.parseInt(s));
            }
        }
        int ans = 0;
        if(st.isEmpty()) return ans;
        for(int n : st){
            ans += n;
        }
        return ans;
        
    }
}