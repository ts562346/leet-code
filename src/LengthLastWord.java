/*

58. Length of Last Word - Easy

Given a string s consisting of words and spaces, return the length
of the last word in the string.

A word is a maximal substring consisting of non-space characters only.

 */
public class LengthLastWord {
    public int lengthOfLastWord(String s) {
        String[] words = s.split(" ");
        return words[words.length-1].length();
    }
}
