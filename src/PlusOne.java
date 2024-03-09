/*

66. Plus One - Easy

You are given a large integer represented as an integer array digits, where each
digits[i] is the ith digit of the integer. The digits are ordered from most significant
to the least significant in left-to-right order. The large integer does not contain any
leading 0's.

Increment the large integer by one and return the resulting array of digits.

 */
public class PlusOne {
    public int[] plusOne(int[] digits) {
        if (digits.length == 1 && digits[digits.length-1] == 9){
            digits[digits.length-1] += 1;
            int [] newArray = new int[digits.length+1];

            System.arraycopy(digits, 0, newArray, 0, digits.length);

            newArray[newArray.length-1] = 0;

            return newArray;
        }
        if(digits[digits.length-1] < 9){
            digits[digits.length-1]++;
            return digits;
        } else {
            
        }
    }
}
