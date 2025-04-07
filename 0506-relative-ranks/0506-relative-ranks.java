class Solution {
    public String[] findRelativeRanks(int[] score) {
        String[] str = new String[score.length];
        PriorityQueue<int[]> maxHeap = new PriorityQueue<>((a, b) -> b[0] - a[0]);
        for(int i = 0 ; i < score.length ; i++)
        {
            maxHeap.add(new int[]{score[i], i});
        }
        int count = 0;
        while (!maxHeap.isEmpty()) {
            int[] top = maxHeap.poll();
            if(count==0){
                str[top[1]] = "Gold Medal";
                count++;
            }
            else if(count==1){
                str[top[1]] = "Silver Medal";
                count++;
            }
            else if(count==2){
                str[top[1]] = "Bronze Medal";
                count++;
            }
            else{
                String s = String.valueOf(count+1);
                str[top[1]] = s;
                count++;
            }
            
        }
      return str;
    }
}