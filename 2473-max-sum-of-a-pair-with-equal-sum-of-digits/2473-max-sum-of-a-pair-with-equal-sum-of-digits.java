class Solution {
     public int sumOfDigits(int num) {
         int sum = 0;
        while (num > 0) {
            sum += num % 10; 
            num /= 10;      
        }
        return sum;
    }

    public int maximumSum(int[] nums) {
        int max_value = Integer.MIN_VALUE;
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int num : nums) {
            int digitSum = sumOfDigits(num);
            if (map.containsKey(digitSum)) {
                max_value = Math.max(max_value, map.get(digitSum) + num);
            }
            map.put(digitSum, Math.max(map.getOrDefault(digitSum, 0), num));
        }

        return max_value>1? max_value:-1;   
    }
}