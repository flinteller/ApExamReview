package com.company;

public class TokenPass {

    private int[] board;
    private int currentPlayer;

    /** Creates the board array to be of size playerCount and fills it with
     * random integer values from 1 to 10, inclusive. Initializes currentPlayer to a
     * random integer value in the range between 0 and playerCount-1, inclusive.
     * @param playerCount the number of players
     */
    public TokenPass(int playerCount) {
        board = new int[playerCount];
        for(int a = 0; a <= playerCount - 1; a++){
            int newInt = (int)((Math.random() * 10) + 1);
            board[a] = newInt;

        }
        currentPlayer = (int)(Math.random() * (playerCount - 1) + 1);

    }

    /** Distributes the tokens from the current player's position one at a time to each player in
     * the game. Distribution begins with the next position and continues until all the tokens
     * have been distributed. If there are still tokens to distribute when the player at the
     * highest position is reached, the next token will be distributed to the player at position 0.
     * Precondition: the current player has at least one token.
     * Postcondition: the current player has not changed.
     */
    public void distributeCurrentPlayerTokens() {
        int spots = 1;
        for(int a = board[currentPlayer]; a >= 1; a--){
            board[currentPlayer + spots] += 1;
            board[currentPlayer]--;
            spots++;
            if(spots + currentPlayer == board.length){
                spots = currentPlayer * -1;
            }
        }
    }

    public void setBoard(int[] board) {
        this.board = board;
    }

    public void setCurrentPlayer(int currentPlayer) {
        this.currentPlayer = currentPlayer;
    }

    public int getCurrentPlayer() {
        return currentPlayer;
    }

    public int[] getBoard() {
        return board;
    }
}
