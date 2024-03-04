/*

6. ZigZag Conversion - Medium

The string "PAYPALISHIRING" is written in a zigzag pattern on a given number of rows like this:
(you may want to display this pattern in a fixed font for better legibility)

P   A   H   N
A P L S I I G
Y   I   R
And then read line by line: "PAHNAPLSIIGYIR"

Write the code that will take a string and make this conversion given a number of rows.

 */

public class ZigzagConversion {
    public String convert(String s, int numRows) {

        int cycle = numRows + numRows - 2;
        int partial_cycle_chars = s.length() % cycle;
        int numColumns = s.length() * (numRows - 2);
        if (partial_cycle_chars > 0)
            numColumns += 1;
        if (partial_cycle_chars > numRows)
            numColumns += partial_cycle_chars - numRows;


        System.out.println(numColumns);
        char [][] matrix = new char[numRows][numColumns];
//        for (int i = 0; i < s.length(); i++){
//
//        }
        return s;
    }

}
