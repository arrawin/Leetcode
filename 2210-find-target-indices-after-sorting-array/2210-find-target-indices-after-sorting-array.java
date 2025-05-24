class Solution {
    public List<Integer> targetIndices(int[] nums, int target) {
        List<Integer> list = new ArrayList<>();
        int pos = 0;
        int numThere = 0;
        for(int num : nums){
            if(num < target){
                pos++;     // since we need to find the position of the element we are finding the values lesser than that so we can know which is the position of the target
            }
            else if(num == target){
                numThere++;
            }
        }
        while(numThere!=0){
            list.add(pos);
            pos++;
            numThere--;
        }
        return list;
    }
}