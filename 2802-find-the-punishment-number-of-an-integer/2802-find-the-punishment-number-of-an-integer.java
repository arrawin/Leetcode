class Solution {
    static Map<Integer,Boolean> memo = new HashMap<>();
    public int punishmentNumber(int n) {
        int sum = 0;
        for(int i=1; i<=n; ++i){
            int num = i*i;
            if(!memo.containsKey(num)){
                memo.put(num, check(num, i));
            }
            if(memo.get(num)) sum += num;
        }
        return sum;
    }

    boolean check(int n, int sum) {
        if(sum == n) return true;
        if(n <= 0 || sum <= 0) return false;
        int i=1;
        int temp = n;
        while(n > 0) {
            // Split into 2 parts
            int last = temp % (int)(Math.pow(10,i++));
            int first = n / 10;
            n /= 10;
            if(check(first, sum - last)) return true;
        }
        return false;
    }
}