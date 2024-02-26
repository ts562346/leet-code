import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class PalindromeNumberTest {
    /*
        Example 1:

        Input: x = 121
        Output: true
        Explanation: 121 reads as 121 from left to right and from right to left.
    */
    @Test
    void example1(){
        int x = 121;
        PalindromeNumber test = new PalindromeNumber();
        assertTrue(test.isPalindrome(x));
    }

    /*
        Example 2:

        Input: x = -121
        Output: false
        Explanation: From left to right, it reads -121. From right to left, it becomes 121-.
        Therefore, it is not a palindrome.
     */
    @Test
    void example2(){
        int x = -121;
        PalindromeNumber test = new PalindromeNumber();
        assertFalse(test.isPalindrome(x));
    }

    /*
        Example 3:

        Input: x = 10
        Output: false
        Explanation: Reads 01 from right to left. Therefore, it is not a palindrome.
     */
    @Test
    void example3(){
        int x = 10;
        PalindromeNumber test = new PalindromeNumber();
        assertFalse(test.isPalindrome(x));
    }


}
