class Solution {
    public boolean isPalindrome(int x) {
        if (x==0  ) return true; 
        if (x < 0 || x %10==0) return false; // Negative numbers are not palindromes and any number ending with 0 (except 0 itself) cannot be a palindrome.
        // Zero is a palindrome
        if (x < 10) return true; // Single digit numbers are palindromes
        int reversed = 0;
        while (x>reversed){
                int lastDigit = x % 10;
                reversed = reversed * 10 + lastDigit;
                x = x / 10;
        }

        return (x==reversed || x==reversed/10);
    }
}