/*

67. Add Binary - Easy

Given two binary strings a and b, return their sum as a binary string.

 */
public class AddBinary {
    public String addBinary(String a, String b) {
        int size = Math.min(a.length(), b.length());

        int sizeA = a.length()-1;
        int sizeB = b.length()-1;

        StringBuilder sum = new StringBuilder();
        boolean carry = false;

        int i;
        for (i = 0; i < size; i++){
            if(a.charAt(sizeA-i)=='1' && b.charAt(sizeB-i)=='1' && carry){
                sum.append("1");
            } else if (a.charAt(sizeA-i)=='1' && b.charAt(sizeB-i)=='1') {
                sum.append("0");
                carry = true;
            }else if (a.charAt(sizeA-i)=='0' && b.charAt(sizeB-i)=='0'){
                if (carry){
                    sum.append("1");
                } else {
                    sum.append("0");
                }
                carry = false;
            } else {
                if (carry){
                    sum.append("0");
                } else {
                    sum.append("1");
                }
            }
        }

        String rem = "";
        if (sizeA > sizeB){
            rem = a.substring(0, sizeA+1-i);
        } else if (sizeB > sizeA) {
            rem = b.substring(0, sizeB+1-i);
        }

        for (i = rem.length()-1; i >= 0; i--){
            if(rem.charAt(i) == '1' && carry){
                sum.append("0");
            } else if (rem.charAt(i) == '0' && carry){
                sum.append("1");
                carry = false;
            } else {
                sum.append(rem.charAt(i));
            }
        }

        if (carry){
            sum.append('1');
        }

        return sum.reverse().toString();
    }
}
