/*

67. Add Binary - Easy

Given two binary strings a and b, return their sum as a binary string.

 */
public class AddBinary {
    public String addBinary(String a, String b) {
        int size = Math.min(a.length(), b.length());
        String c = a, d = b;
        StringBuilder sum = new StringBuilder();
        boolean carry = false;

        for (int i = size-1; i >= 0; i--){
            if(a.charAt(i)=='1' && b.charAt(i)=='1'){
                sum.append("0");
                carry = true;
            } else if (a.charAt(i)=='0' && b.charAt(i)=='0'){
                if (carry){
                    sum.append("1");
                    carry = false;
                } else {
                    sum.append("0");
                }
            } else {
                if (carry){
                    sum.append("0");
                } else {
                    sum.append("1");
                }
            }
            // store in c and d, char's that have not been iterated
            c = a.substring(0, i);
            d = b.substring(0, i);
        }

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
