package com.company;

public class Combinatorics {

    /** Precondition: n is between 1 and 12, inclusive.
     * Returns the factorial of n, as described in part (a). */
    public static int factorial(int n)
    { /* to be implemented in part (a) */
        int factorial;
        if(n == 1){
            factorial = 1;
        }
        else{
            factorial = n;
            for(int x = n - 1; x >= 1; x--){
                factorial *= x;
            }
        }
        return factorial;
    }

    /** Precondition: n and r are between 1 and 12, inclusive. * Determines the number of ways r items can be selected
     * from n choices and prints the result, as described in part
     (b). */
    public static void numCombinations(int n, int r) {
        /* to be implemented in part (b) */
        int ways;

        if(r > n){
            ways = 0;
        }
        else{
            ways = factorial(n)/(factorial(r)*(factorial((n-r))));
        }

        System.out.println("There are " + ways + " ways of choosing " + r + " items from " + n + " choices.");



    }
}
