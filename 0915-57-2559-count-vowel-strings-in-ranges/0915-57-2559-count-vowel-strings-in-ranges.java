class Solution {
    public int[] vowelStrings(String[] words, int[][] queries) {
        int[] prefixSum = new int[words.length+1];  
        int[] result = new int[queries.length];   
        for(int i = 0 ; i<words.length ; i++){
            String str = words[i];
            int len = str.length();
            if("aeiouAEIOU".indexOf(str.charAt(0)) != -1 && "aeiouAEIOU".indexOf(str.charAt(len - 1)) != -1){
                 prefixSum[i+1]=prefixSum[i]+1;
            }
            else{
                 prefixSum[i+1]=prefixSum[i];
            }
        }
    
        for(int i=0;i<queries.length;i++){
            int start = queries[i][0];
            int end = queries[i][1];
            result[i]=prefixSum[end+1]-prefixSum[start];
    }
return result;
          

        }
        
    }