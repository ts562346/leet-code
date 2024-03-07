import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


public class FindIndexFirstOccurenceStringTest {
    /*
        Example 1:

        Input: haystack = "sadbutsad", needle = "sad"
        Output: 0
        Explanation: "sad" occurs at index 0 and 6.
        The first occurrence is at index 0, so we return 0.
     */
    @Test
    void example1(){
        String haystack = "sadbutsad";
        String needle = "sad";
        FindIndexFirstOccurrenceString test = new FindIndexFirstOccurrenceString();
        assert 0 == test.strStr(haystack, needle);
    }

    /*
         Example 2:

         Input: haystack = "leetcode", needle = "leeto"
         Output: -1
      */
    @Test
    void example2(){
        String haystack = "leetcode";
        String needle = "leeto";
        FindIndexFirstOccurrenceString test = new FindIndexFirstOccurrenceString();
        assert -1 == test.strStr(haystack, needle);
    }

    /*
         Example 3:

         Input: haystack = "hello" needle = "ll"
         Output: 2
      */
    @Test
    void example3(){
        String haystack = "hello";
        String needle = "ll";
        FindIndexFirstOccurrenceString test = new FindIndexFirstOccurrenceString();
        assert 2 == test.strStr(haystack, needle);
    }

    /*
         Example 4:

         Input: haystack = "a" needle = "a"
         Output: 0
      */
    @Test
    void example4(){
        String haystack = "a";
        String needle = "a";
        FindIndexFirstOccurrenceString test = new FindIndexFirstOccurrenceString();
        assert 0 == test.strStr(haystack, needle);
    }

    /*
         Example 5:

         Input: haystack = "a" needle = "a"
         Output: 0
      */
    @Test
    void example5(){
        String haystack = "abc";
        String needle = "c";
        FindIndexFirstOccurrenceString test = new FindIndexFirstOccurrenceString();
        assert 2 == test.strStr(haystack, needle);
    }


}
