import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;


public class ValidParenthesesTest {
    /*
        Example 1:
        Input: s = "()"
        Output: true
    */
    @Test
    void example1(){
        String input = "()";
        ValidParentheses test = new ValidParentheses();
        assertTrue(test.isValid(input));
    }
    /*
        Example 2:
        Input: s = "()[]{}"
        Output: true
    */
    @Test
    void example2(){
        String input = "()[]{}";
        ValidParentheses test = new ValidParentheses();
        assertTrue(test.isValid(input));
    }
    /*
        Example 3:
        Input: s = "()[]{}"
        Output: true
    */
    @Test
    void example3(){
        String input = "(]";
        ValidParentheses test = new ValidParentheses();
        assertFalse(test.isValid(input));
    }
    /*
        Example 4:
        Input: s = "()[]{}"
        Output: true
    */
    @Test
    void example4(){
        String input = "[";
        ValidParentheses test = new ValidParentheses();
        assertFalse(test.isValid(input));
    }
    /*
        Example 5:
        Input: s = "(("
        Output: true
    */
    @Test
    void example5(){
        String input = "[";
        ValidParentheses test = new ValidParentheses();
        assertFalse(test.isValid(input));
    }
    /*
        Example 6:
        Input: s = "){"
        Output: true
    */
    @Test
    void example6(){
        String input = "[";
        ValidParentheses test = new ValidParentheses();
        assertFalse(test.isValid(input));
    }
}
