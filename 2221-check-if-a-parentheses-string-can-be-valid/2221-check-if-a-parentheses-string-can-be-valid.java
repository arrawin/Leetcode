class Solution {
    public boolean canBeValid(String s, String locked) {
        int n = s.length();
        // If the length of the string is odd, it cannot be valid
        if (n % 2 != 0) return false;

        // First pass: Check for sufficient opening brackets
        int openCount = 0; // Tracks open parentheses
        int flexibleCount = 0; // Tracks flexible positions

        for (int i = 0; i < n; i++) {
            if (locked.charAt(i) == '0') {
                flexibleCount++; // Flexible position can be either '(' or ')'
            } else {
                openCount += (s.charAt(i) == '(' ? 1 : -1);
            }

            // Ensure the total open parentheses count never goes negative
            if (openCount + flexibleCount < 0) {
                return false;
            }
        }

        // Second pass: Check for sufficient closing brackets
        int closeCount = 0;
        flexibleCount = 0;

        for (int i = n - 1; i >= 0; i--) {
            if (locked.charAt(i) == '0') {
                flexibleCount++; // Flexible position can be either '(' or ')'
            } else {
                closeCount += (s.charAt(i) == ')' ? 1 : -1);
            }

            // Ensure the total close parentheses count never goes negative
            if (closeCount + flexibleCount < 0) {
                return false;
            }
        }

        return true;
    }
}