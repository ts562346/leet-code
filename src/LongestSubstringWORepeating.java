/*

3. Longest Substring Without Repeating Characters - Medium

Given a string s, find the length of the longest substring
without repeating characters.

 */

public class LongestSubstringWORepeating {
    public int lengthOfLongestSubstring(String s) {
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
}