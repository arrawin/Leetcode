class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
       boolean[] exists = new boolean[nums.length+1];

        for(int i: nums) {
            exists[i] = true;
        }

        List<Integer> res = new ArrayList<>();

        for(int i=1; i < nums.length + 1; i++){
            if(!exists[i]){
                res.add(i);
            }
        }

        return res;
    }
}