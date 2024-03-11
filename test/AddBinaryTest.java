import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class AddBinaryTest {
    /*
        Example 1:
        Input: a = "11", b = "1"
        Output: "100"
     */
    @Test
    void example1(){
        String a = "11", b = "1";
        AddBinary test = new AddBinary();
        assertEquals("100", test.addBinary(a, b));
    }
    /*
        Example 2:
        Input: a = "1010", b = "1011"
        Output: "10101"
     */
    @Test
    void example2(){
        String a = "1010", b = "1011";
        AddBinary test = new AddBinary();
        assertEquals("10101", test.addBinary(a, b));
    }
}
