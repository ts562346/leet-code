/*
Given a string s, find the length of the longest substring
without repeating characters.

Example 1:

Input: s = "abcabcbb"
Output: 3
Explanation: The answer is "abc", with the length of 3.
Example 2:

Input: s = "bbbbb"
Output: 1
Explanation: The answer is "b", with the length of 1.
Example 3:

Input: s = "pwwkew"
Output: 3
Explanation: The answer is "wke", with the length of 3.
Notice that the answer must be a substring, "pwke" is a subsequence and not a substring.
 */

public class LongestSubstringWORepeating {
    public static int lengthOfLongestSubstring(String s) {
        int n = s.length();
        int res = 0;

        for (int i = 0; i < n; i++){
            boolean [] visited = new boolean[256];

            for (int j = i; j < n; j++){
                if(visited[s.charAt(j)]){
                    break;
                } else {
                    res = Math.max(res, j-i+1);
                    visited[s.charAt(j)] = true;
                }
            }
            visited[s.charAt(i)] = false;
        }
        return res;
    }

    public static void main(String[] args) {
        String s = "pwwkew";
        System.out.println(lengthOfLongestSubstring(s));
    }
}