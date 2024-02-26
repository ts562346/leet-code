/*

9. Palindrome Number - Easy

Given an integer x, return true if x is a palindrome, and false otherwise.

 */
public class PalindromeNumber {
    public boolean isPalindrome(int x) {
        return x == reverse(x);
    }

    public int reverse (int x){
        int reverse = 0;

        if(x<0){
            return 0;
        }

        while(x != 0) {

            // get last digit from num
            int digit = x % 10;
            reverse = reverse * 10 + digit;

            // remove the last digit from num
            x /= 10;
        }
        return reverse;
    }
}
