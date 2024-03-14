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
    /*
        Example 3:
        Input: a = "1111", b = "1111"
        Output: "11110"
     */
    @Test
    void example3(){
        String a = "1111", b = "1111";
        AddBinary test = new AddBinary();
        assertEquals("11110", test.addBinary(a, b));
    }
    /*
        Example 4:
        Input:  a = "100", b = "110010"
        Output: "110110"
     */
    @Test
    void example4(){
        String a = "100", b = "110010";
        AddBinary test = new AddBinary();
        assertEquals("110110", test.addBinary(a, b));
    }
    /*
        Example 5:
        Input:  a = "1010", b = "1011"
        Output: "10101"
     */
    @Test
    void example5(){
        String a = "1010", b = "1011";
        AddBinary test = new AddBinary();
        assertEquals("10101", test.addBinary(a, b));
    }
    /*
        Example 6:
        Input:  a = "1", b = "111"
        Output: "100"
     */
    @Test
    void example6(){
        String a = "1", b = "111";
        AddBinary test = new AddBinary();
        assertEquals("1000", test.addBinary(a, b));
    }
}
