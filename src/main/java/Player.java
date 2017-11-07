/*Liz Mahoney
 *11/6/17
 * Player.java
 * This class creates an instance of the player
 */

/**
 * This class creates an instance of the player
 *
 * @author Liz Mahoney
 * @version 1.0
 */
public class Player{

    private Cell position;


    public Player(){
        position = GameMaster.instance ().getGameBoard().getCell(0);

    }

    public Cell getPosition(){

       return this.position;
    }

    public void setPosition(Cell newPosition){

        this.position = newPosition;
    }
}
