/*

28. Find the Index of the First Occurrence in a String - Easy

Given two strings needle and haystack, return the index of the first occurrence of
needle in haystack, or -1 if needle is not part of haystack.

 */
public class FindIndexFirstOccurrenceString {
    public int strStr(String haystack, String needle) {

        if(needle.equals(haystack))
            return 0;

        for (int i = 0; i < haystack.length()-needle.length()+1; i++){
            if (haystack.substring(i, i+needle.length()).equals(needle))
                return i;

        }
        return -1;

//        return haystack.indexOf(needle);
    }
}
