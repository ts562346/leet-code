import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class LongestSubstringWORepeatingTest {
    /*
        Example 1:

        Input: s = "abcabcbb"
        Output: 3
        Explanation: The answer is "abc", with the length of 3.
    */
    @Test
    void example1() {
        String s = "abcabcbb";
        LongestSubstringWORepeating lenSubstr = new LongestSubstringWORepeating();
        assertEquals(3, lenSubstr.lengthOfLongestSubstring(s));
    }
    /*
        Example 2:

        Input: s = "bbbbb"
        Output: 1
        Explanation: The answer is "b", with the length of 1.
    */
    @Test
    void example2() {
        String s = "bbbbb";
        LongestSubstringWORepeating lenSubstr = new LongestSubstringWORepeating();
        assertEquals(1, lenSubstr.lengthOfLongestSubstring(s));
    }
    /*
       Example 3:

        Input: s = "pwwkew"
        Output: 3
        Explanation: The answer is "wke", with the length of 3.
        Notice that the answer must be a substring, "pwke" is a subsequence and not a substring.
    */
    @Test
    void example3() {
        String s = "pwwkew";
        LongestSubstringWORepeating lenSubstr = new LongestSubstringWORepeating();
        assertEquals(3, lenSubstr.lengthOfLongestSubstring(s));
    }
}