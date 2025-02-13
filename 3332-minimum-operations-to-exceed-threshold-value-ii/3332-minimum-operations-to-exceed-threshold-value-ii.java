class Solution {
    public int minOperations(int[] nums, int k) {
        PriorityQueue<Long> minheap = new PriorityQueue<Long>();
        for(int num:nums){
            minheap.add((long)num);
        }
        int count=0;
        while(minheap.peek()<k){
            long x=minheap.poll();
            long y=minheap.poll();
            minheap.add(Math.min(x,y)*2+Math.max(x,y));
            count++;
        }
        return count;
    }
}