class Solution {
    public int sumOfTheDigitsOfHarshadNumber(int x) {
        int digit;
        int sum_of_digits = 0;
        int temp = x;
        while( temp != 0 )
        {
            digit = temp % 10;
            sum_of_digits += digit;
            temp/=10;
        }
        return (x % sum_of_digits == 0 ) ? sum_of_digits : -1;
    }
}