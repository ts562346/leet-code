import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
@SuppressWarnings("ALL")
public class LongestCommonPrefixTest {
    /*
        Example 1:

        Input: strs = ["flower","flow","flight"]
        Output: "fl"
     */
    @Test
    void example1(){
        String[] input = {"flower", "flow", "flight"};

        LongestCommonPrefix test = new LongestCommonPrefix();
        assertEquals("fl", test.longestCommonPrefix(input));
    }
    /*
        Example 2:

        Input: strs = ["dog","racecar","car"]
        Output: ""
        Explanation: There is no common prefix among the input strings.
     */
    @Test
    void example2(){
        String[] input = {"dog","racecar","car"};

        LongestCommonPrefix test = new LongestCommonPrefix();
        assertEquals("", test.longestCommonPrefix(input));
    }
    /*
        Example 3:

        Input: strs = ["abab","aba",""]
        Output: ""
     */
    @Test
    void example3(){
        String[] input = {"abab","aba",""};

        LongestCommonPrefix test = new LongestCommonPrefix();
        assertEquals("", test.longestCommonPrefix(input));
    }
    /*
        Example 4:

        Input: strs = ["baab","bacb","b","cbc"]
        Output: ""
    */
    @Test
    void example4(){
        String[] input = {"baab","bacb","b","cbc"};

        LongestCommonPrefix test = new LongestCommonPrefix();
        assertEquals("", test.longestCommonPrefix(input));
    }
    /*
        Example 5:

        Input: strs = ["ac","ac","a","a"]
        Output: ""
    */
    @Test
    void example5(){
        String[] input = {"ac","ac","a","a"};

        LongestCommonPrefix test = new LongestCommonPrefix();
        assertEquals("a", test.longestCommonPrefix(input));
    }

}
