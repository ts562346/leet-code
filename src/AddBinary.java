/*

67. Add Binary - Easy

Given two binary strings a and b, return their sum as a binary string.

 */
public class AddBinary {
    public String addBinary(String a, String b) {
        int size = Math.min(a.length(), b.length());
        int sizeA = a.length()-1;
        int sizeB = b.length()-1;
        String c, d;
        StringBuilder sum = new StringBuilder();
        boolean carry = false;

        for (int i = 0; i < size; i++){
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

        c = a.substring(size-1, a.length()-1);
        d = b.substring(size-1, b.length()-1);

        String rem = "";
        if (!c.isEmpty()){
            rem = c;
        } else if (!d.isEmpty()){
            rem = d;
        }

        for (int i = rem.length()-1; i >= 0; i--){
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
