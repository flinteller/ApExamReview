package com.company;

public class StringManip
{
    /** Takes a string str and returns a new string * with all spaces removed.
     */
    public static String removeSpaces(String str)
    {
        String noSpace = "";
        for (int i=0; i<str.length(); i++) {
            if (!str.substring(i, i+1).equals(" ")) {
                noSpace += str.substring(i, i+1);
            }
        }
        return noSpace;
    }


    /** Takes a string str and returns a new string
     * with the characters reversed, as described in part (a). */
    public static String reverseString(String str)
    { /* to be implemented in part (a) */
        String newString = "";
        for(int a = str.length(); a >= 1; a--){
            newString = newString + str.substring(a - 1, a);
        }
        return newString;
    }


    /** Determines whether str is a palindrome and prints a message
     * indicating the result, as described in part (b).
     * Precondition: str contains only lowercase letters and spaces.
     */
    public static void palindromeChecker(String str)
    { /* to be implemented in part (b) */
        String no_spaces = removeSpaces(str);
        String backwards = reverseString(no_spaces);

        if(no_spaces.equals(backwards))
            System.out.println(str + " is a palindrome");
        else
            System.out.println(str + " is not a palindrome");

    }

}