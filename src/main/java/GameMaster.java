/*Liz Mahoney
 *11/6/17
 * GameMaster.java
 * This class sets up the players for the board game
 */

import java.util.ArrayList;

/**
 * This class sets up the players for the board game
 *
 * @author Liz Mahoney
 * @version 1.0
 */
public class GameMaster {

    private ArrayList players;
    private GameBoard gameBoard;

    private static GameMaster singleton;


    public static GameMaster instance(){

        if(singleton == null){
            singleton = new GameMaster ();
        }

        return singleton;
    }


    public void setGameBoard(GameBoard board){
        this.gameBoard = board;
    }


    public void setNumberOfPlayers(int number){
        players = new ArrayList (number);
        for(int i = 0 ; i<number; i++){
            Player player = new Player ();
            players.add (player);

        }
    }

    public int getNumberOfPlayers(){

        return players.size ();
    }

    public Player getPlayer(int index) {

        return (Player) players.get (index);

    }

    public GameBoard getGameBoard() {

        return gameBoard;
    }

    /**
     * Moves the player to a cell on the game board
     *
     * @param playerIndex -current index of the player
     * @param diceRoll
     */
    public void movePlayer(int playerIndex, int diceRoll){

        Player player = getPlayer(playerIndex);
        Cell playerPosition = player.getPosition ();
        int oldIndex = gameBoard.getCellIndex (playerPosition);

        int newIndex = (oldIndex + diceRoll) %gameBoard.getCellNumber ();

        Cell newPosition = gameBoard.getCell (newIndex);
        player.setPosition (newPosition);
    }


}
