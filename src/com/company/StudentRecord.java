package com.company;

public class StudentRecord {

    private int[] scores; // contains scores.length values. scores.length > 1

    public StudentRecord(int[] scores) {
        this.scores = scores;
    }

    /** Returns the average (arithmetic mean) of the values in scores
     * whose subscripts are between first and last, inclusive
     * precondition: 0 <= first <= last < scores.length
     * Method is marked public for testing purposes.
     */
    public double average(int first, int last) {
        /* to be implemented in part (a) */
        double avg;
        int total = 0;

        for(int q = first; q <= last; q++){
            total += scores[q];
        }

        avg = total / ((double)(last - first) + 1);

        return avg;

    }

    /** Returns true if each successive value in scores is greater
     * than or equal to the previous value;
     * otherwise, returns false
     * Method marked public for testing purposes.
     */
    public boolean hasImproved() {
        /* to be implemented in part (b) */
        boolean improved = true;
        for(int w = 0; w < scores.length - 1; w++){
            if(scores[w] > scores[w + 1]){
                improved = false;
                break;
            }
        }
        return improved;
    }

    /** If the values in scores have improved, returns the average of the elements in scores
     * with indexes greater than or equal to scores.length/2;
     * otherwise, returns the average of all the values in scores
     */
    public double finalAverage() {
        /* to be implemented in part (c) */
        double avg;
        if(hasImproved()){
            avg = average(scores.length / 2, scores.length - 1);
        }
        else{
            avg = average(0, scores.length - 1);
        }
        return avg;
    }
}
