package com.company;

public class SpinnerGame {
    /** Precondition: min < max
     * Simulates a spin of a spinner by returning a random integer
     * between min and max, inclusive.
     */
    public int spin(int min, int max) {
        int result = (int) (Math.random() * max) + min;

        return result;
    }
    /** Simulates one round of the game as described in part (b).
     */
    public void playRound() {
        int player_spin1 = spin(1, 10);
        int comp_spin1 = spin(2, 8);
        if(player_spin1 > comp_spin1)
            System.out.println("You win! " + (player_spin1 - comp_spin1) + " points");

        else if(comp_spin1 > player_spin1)
            System.out.println("You lose. " + (player_spin1 - comp_spin1) + " points");

        else {
            int player_spin2 = spin(1, 10);
            int comp_spin2 = spin(2, 8);
            if (player_spin2 + player_spin1 < comp_spin2 + comp_spin1)
                System.out.println("You lose. -1 point");
            else if (player_spin2 + player_spin1 > comp_spin2 + comp_spin1)
                System.out.println("You win! 1 point");
            else
                System.out.println("Tie. 0 points");
        }
    }
}
