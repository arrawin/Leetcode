class Solution {
    public int maxDivisible(int n, int cf) {
        while (n % cf == 0) {
            n /= cf;
        }
        return n;
    }

    public boolean isUgly(int n) {
        if (n <= 0) return false; 

        n = maxDivisible(n, 2);
        n = maxDivisible(n, 3);
        n = maxDivisible(n, 5);

        return n == 1;
    }
}