import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class LengthLastWordTest {
    /*
        Example 1:

        Input: s = "Hello World"
        Output: 5
        Explanation: The last word is "World" with length 5.
     */
    @Test
    void example1(){
        String s = "Hello World";
        LengthLastWord test = new LengthLastWord();
        assertEquals(5, test.lengthOfLastWord(s));
    }
    /*
        Example 2:

        Input: s = "   fly me   to   the moon  "
        Output: 4
        Explanation: The last word is "moon" with length 4.
     */
    @Test
    void example2(){
        String s = "   fly me   to   the moon  ";
        LengthLastWord test = new LengthLastWord();
        assertEquals(4, test.lengthOfLastWord(s));
    }
    /*
        Example 3:

        Input: s = "luffy is still joyboy"
        Output: 6
        Explanation: The last word is "joyboy" with length 6.
     */
    @Test
    void example3(){
        String s = "luffy is still joyboy";
        LengthLastWord test = new LengthLastWord();
        assertEquals(6, test.lengthOfLastWord(s));
    }
}
