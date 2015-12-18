/*
Given a string, determine if it is a palindrome, considering only alphanumeric characters and ignoring cases.

For example,
"A man, a plan, a canal: Panama" is a palindrome.
"race a car" is not a palindrome.
*/


public class Solution {
    public boolean isPalindrome(String s) {
    if (s.length() == 1) {
        return true;
    }
    //convert string to char array
    char[] array = s.toCharArray();
    int i = 0, j = array.length - 1;
    char startChar, endChar;
    //isLetterOrDigit: Letter 1; Digit0;
    //if Digit, ignore and next
    while (i < j) {
        while (!Character.isLetterOrDigit(array[i])&&i<j) {
            i++;
        }
        while (!Character.isLetterOrDigit(array[j])&&i<j) {
            j--;
        }
    //if Letter, compare lower case
        startChar = Character.toLowerCase(array[i]);
        endChar = Character.toLowerCase(array[j]);
        if (startChar != endChar) {
            return false;
        }
    //next letter
        i++;
        j--;
    }
    return true;
}
}