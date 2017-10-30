import junit.framework.TestCase;
import org.junit.Test;

import static org.junit.Assert.*;

public class GameMasterTest {


    private static GameMaster master;

    @Test
    public void testSingleton(){

        GameMaster instance1 = GameMaster.instance();
        assertNotNull(instance1);

        GameMaster instance2 = GameMaster.instance();
        assertNotNull (instance2);

        GameMaster instance3 = GameMaster.instance();
        assertNotNull (instance3);


    }

    @Test
    public void testPlayerInit(){

        master = GameMaster.instance ();
        master.setGameBoard(new SimpleGameBoard ());
        master.setNumberOfPlayers (6);

        assertEquals (6, master.getNumberOfPlayers());

        Cell go = master.getGameBoard().getCell(0);
        for(int i=0 ; i < 6 ; i++){

            Player player = master.getPlayer(i);
            assertSame(go, player.getPosition ());
        }
    }

    @Test
    public void testMovePlayerSimple(){
        master = GameMaster.instance ();
        master.setGameBoard (new SimpleGameBoard ());
        master.setNumberOfPlayers (1);

        Player player = master.getPlayer (0);

        master.movePlayer(0,2);
        assertEquals ("Blue 2", player.getPosition ().getName ());

        master.movePlayer(0,3);
        assertEquals ("Green 2", player.getPosition ().getName ());
    }

    @Test
    public void testGetCellIndex(){
        GameBoard gameBoard = new SimpleGameBoard ();
        Cell blue2 = gameBoard.getCell (2);
        int index = gameBoard.getCellIndex (blue2);
        assertEquals (2,index);
        Cell notExist = new Cell();
        index = gameBoard.getCellIndex(notExist);
        assertEquals (-1, index);

    }

    @Test
    public void testMovePlayerCircle(){
        master = GameMaster.instance ();
        master.setGameBoard (new SimpleGameBoard ());
        master. setNumberOfPlayers (1);

        Player player = master.getPlayer (0);
        master.movePlayer (0,2);
        master.movePlayer (0,5);

        assertEquals ("Blue 1", player.getPosition ().getName ());
    }
}