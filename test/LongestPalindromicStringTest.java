import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class LongestPalindromicStringTest {
    /*
        Example 1:

        Input: s = "babad"
        Output: "bab"
        Explanation: "aba" is also a valid answer.
     */
    @Test
    void example1() {
        String s = "babad";
        LongestPalindromicString test = new LongestPalindromicString();
        String output = test.longestPalindrome(s);
        assertEquals("bab", output);
    }

    /*
        Example 2:

        Input: s = "cbbd"
        Output: "bb"
     */

    @Test
    void example2(){
        String s = "cbbd";
        LongestPalindromicString test = new LongestPalindromicString();
        String output = test.longestPalindrome(s);
        assertEquals("bb", output);
    }
}
