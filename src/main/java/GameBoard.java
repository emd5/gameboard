/*Liz Mahoney
 *11/6/17
 * GameBoard.java
 * This class sets the cells and retrieves the cells
 */

import java.util.ArrayList;

/**
 * This class sets the cells and retrieves the cells
 *
 * @author Liz Mahoney
 * @version 1.0
 */
public class GameBoard {

    ArrayList cells = new ArrayList ();


    public GameBoard(){
        addCell (new GoCell ());
    }

    /**
     * Generates a cell
     *
     * @param cell - The cells on the board
     */
    public void addCell(Cell cell) {

        cells.add(cell);
    }

    public int getCellNumber() {

        return cells.size ();
    }

    public Cell getCell(int index){

        return (Cell)cells.get (index);
    }

    public int getCellIndex(Cell cell){

        return cells.indexOf(cell);

    }


}


