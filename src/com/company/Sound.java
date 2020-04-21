package com.company;

public class Sound {

    /** the array of values in this sound; guaranteed not to be null */
    private int[] samples;

    /** constructor created for testing purposes
     * Not part of original problem
     */
    public Sound(int[] samples) {
        this.samples = samples;
    }

    /** Changes those values in this sound that have an amplitude greater than limit.
     * Values greater than limit are changed to limit.
     * Values less than -limit are chhanged to -limit.
     * @param limit the amplitude limit
     *              Precondition limit >= 0
     * @return the number of values in this sound that this method changed.
     */
    public int limitAmplitude(int limit) {
        int num_changed = 0;

        for(int a = 0; a < samples.length; a++){
            if(samples[a] > limit) {
                samples[a] = limit;
                num_changed++;
            }
            else if(samples[a] < -limit) {
                samples[a] = -limit;
                num_changed++;
            }
        }

        return num_changed;
    }

    /**
     * Removes all silence from the beginning of this sound.
     * Silence is represented by a value of 0;
     * Precodition: samples contains at least one nonzero value
     * Postcondition: the length of samples reflects the removal of starting silence
     */
    public void trimSilenceFromBeginning() {
        int place = 0;
        int b = 0;
        boolean on = true;
        while(on){
            if(samples[b] != 0){
                place = b;
                on = false;
            }
            b++;
        }
        int size = samples.length - place;
        int[] new_samples = new int[size];
        int count = 0;
        for(int c = place; c < samples.length; c++){
            new_samples[count] = samples[c];
            count++;
        }
        samples = new_samples;
       
    }

    /** accessor method used for testing purposes - Not part of original program */
    public int[] getSamples() {
        return samples;
    }
}
