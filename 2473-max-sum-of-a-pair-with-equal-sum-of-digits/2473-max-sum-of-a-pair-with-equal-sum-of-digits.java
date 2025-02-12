class Solution {
    public int maximumSum(int[] nums) {
        int max_value = Integer.MIN_VALUE;
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int num : nums) {
            int digitSum = 0 , temp = num;
            while (temp > 0) {
            digitSum += temp % 10; 
            temp /= 10;      
             }
            if (map.containsKey(digitSum)) {
                max_value = Math.max(max_value, map.get(digitSum) + num);
            }
            map.put(digitSum, Math.max(map.getOrDefault(digitSum, 0), num));
        }

        return max_value>1? max_value:-1;   
    }
}