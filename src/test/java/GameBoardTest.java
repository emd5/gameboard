import junit.framework.TestCase;

/**
 * This class test the game
 *
 * @author Liz Mahoney
 * @version 1.0
 */
public class GameBoardTest extends TestCase{

    public GameBoardTest(String name)
    {

        super(name);
    }

    public void testAddCell(){

        GameBoard gameBoard = new GameBoard ();

        assertEquals (0, gameBoard.getCellNumber());

        Cell cell = new Cell();
        gameBoard.addCell(cell);

        assertEquals (1,gameBoard.getCellNumber());
    }

    public void testFirstCell(){

        GameBoard gameBoard = new GameBoard();
        Cell firstCell = gameBoard.getCell(0);

        assertSame(GoCell.class, firstCell.getClass ());
    }


    public void testGetCellIndex(){
        GameBoard gameBoard = new SimpleGameBoard ();
        Cell blue2 = gameBoard.getCell (2);
        int index = gameBoard.getCellIndex (blue2);
        assertEquals (2,index);
        Cell notExist = new Cell();
        index = gameBoard.getCellIndex(notExist);
        assertEquals (-1, index);

    }






}