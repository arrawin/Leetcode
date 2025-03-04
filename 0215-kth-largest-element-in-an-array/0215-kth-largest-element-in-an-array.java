class Solution {
    public int findKthLargest(int[] nums, int k) {
        PriorityQueue<Integer> maxHeap = new PriorityQueue<>((a,b)->b-a);
        for(int num : nums){
            maxHeap.add(num);
        }
        int pos = k-1;
        while(pos>0){
            maxHeap.remove();
            pos--;
        }
        return maxHeap.peek();
        
    }
}