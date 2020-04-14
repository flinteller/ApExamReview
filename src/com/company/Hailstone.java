package com.company;

public class Hailstone {


    /** Returns the length of a hailstone sequence that starts with n,
     * as described in part (a).
     * Precondition: n > 0
     */
    public static int hailstoneLength(int n) {
        /* to be implemented in part (a) */
        int count = 0;
        while(n > 0){
            if(n == 1){
                count++;
                break;
            }
            else if(n % 2 == 0){
                n /= 2;
                count++;
            }
            else{
                n = (n * 3) + 1;
                count++;
            }
        }
        return count;
    }


    /** Returns true if the hailstone sequence that starts with n is considered long
     * and false otherwise, as described in part (b).
     * Precondition: n > 0
     */
    public static boolean isLongSeq(int n) {
        /* to be implemented in part (b) */
        boolean isBig = false;

        if(hailstoneLength(n) > n){
            isBig = true;
        }

        return isBig;
    }


    /** Returns the proportion of the first n hailstone sequences that are considered long,
     * as described in part (c).
     * Precondition: n > 0
     */
    public static double propLong(int n) {
        /* to be implemented in part (c) */
        double proportion = 0.0;
        int isLong = 0;

        for(int a = 1; a <= n; a++){
            if(isLongSeq(a)){
                isLong++;
            }
            proportion = (double) isLong/n;
        }
        return proportion;
    }

    // There may be instance variables, constructors, and methods not shown.
}
