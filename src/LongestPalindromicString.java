/*

5. Longest Palindromic Substring - Medium

Given a string s, return the longest palindromic substring in s.

 */
public class LongestPalindromicString {
    public static String longestPalindrome (String s){
        String longestP = "";

        if (s.length()==1){
            return s;
        }

        int maxLen = 1;
        String maxStr = s.substring(0, 1);

        for (int i = 0; i < s.length(); i++) {
            for (int j = i + maxLen; j <= s.length(); j++) {
                if (j - i > maxLen && isPalindrome(s.substring(i, j))) {
                    maxLen = j - i;
                    maxStr = s.substring(i, j);
                }
            }
        }

        return maxStr;

        // for (int i = 0; i < s.length(); i++){
        //     for (int j = s.length()-1; j >= i; j--){
        //         String substr = s.substring(i,j+1);
        //         if(s.charAt(i)==s.charAt(j)) {
        //             if (isPalindrome(substr)) {
        //                 return substr;
        //             }
        //         }
        //     }
        // }

        // return longestP;
    }

    public static boolean isPalindrome(String str) {
        int left = 0;
        int right = str.length() - 1;

        while (left < right) {
            if (str.charAt(left) != str.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }

        return true;
    }

    // public static boolean isPalindrome(String str){
    //     StringBuffer sb = new StringBuffer(str);
    //     return str.equals(sb.reverse().toString());
    // }
}
