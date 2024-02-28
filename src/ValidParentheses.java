/*

20. Valid Parentheses - Easy

Given a string s containing just the characters '(', ')', '{', '}', '[' and ']',
determine if the input string is valid.

An input string is valid if:

Open brackets must be closed by the same type of brackets.
Open brackets must be closed in the correct order.
Every close bracket has a corresponding open bracket of the same type.

 */
public class ValidParentheses {
    public boolean isValid(String s) {
        StringBuilder openBrackets = new StringBuilder();
        for (int i = 0; i < s.length(); i++){
            if (s.charAt(i) == '(' || s.charAt(i) == '{' || s.charAt(i) == '['){
                openBrackets.append(s.charAt(i));
            } else {
                if(openBrackets.length()!=0) {
                    char lastOpenBracket = openBrackets.charAt(openBrackets.length() - 1);
                    if (s.charAt(i) != match(lastOpenBracket))
                        return false;
                    else {
                        openBrackets = new StringBuilder(openBrackets.substring(0, openBrackets.length() - 1));
                    }
                } else {
                    return false;
                }
            }
        }

        return openBrackets.length() <= 0;
    }

    public char match(char c){
        return switch (c) {
            case '(' -> ')';
            case '[' -> ']';
            case '{' -> '}';
            default -> 'z';
        };
    }
}
