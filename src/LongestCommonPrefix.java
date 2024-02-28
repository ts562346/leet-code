/*

14. Longest Common Prefix - Easy

Write a function to find the longest common prefix string amongst an array of strings.
If there is no common prefix, return an empty string "".

 */
public class LongestCommonPrefix {
    public String longestCommonPrefix(String[] strs) {
        if (strs == null || strs.length == 0) return "";

        String prefix = strs[0];
        for (int i = 1; i < strs.length; i++) {
            while (strs[i].indexOf(prefix) != 0) { // If prefix is not found within strs[i], indexOf returns -1
                prefix = prefix.substring(0, prefix.length() - 1); // removes last char from prefix
                if (prefix.isEmpty()) return "";
            }
        }
        return prefix;
    }
}
