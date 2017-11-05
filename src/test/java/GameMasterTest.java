import junit.framework.TestCase;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class GameMasterTest {


    private static GameMaster master;

    @Before
    public void setUp(){
        master = GameMaster.instance ();
        master.setGameBoard (new SimpleGameBoard ());
    }


    @Test
    public void testPlayerInit(){

        master.setNumberOfPlayers (6);
        assertEquals (6, master.getNumberOfPlayers());

    }

    @Test
    public void testMovePlayerSimple(){

        master.setNumberOfPlayers (1);

        Player player = master.getPlayer (0);
        master.movePlayer(0,2);
        assertEquals ("Blue 2", player.getPosition ().getName ());

        //master.movePlayer(0,3);
        //assertEquals ("Green 2", player.getPosition ().getName ());
    }

    @Test
    public void testMovePlayerCycle(){

        master. setNumberOfPlayers (1);

        Player player = master.getPlayer (0);
        master.movePlayer (0,2);
        master.movePlayer (0,5);

        assertEquals ("Blue 1", player.getPosition ().getName ());
    }

    //    @Test
//    public void testSingleton(){
//
//        GameMaster instance1 = GameMaster.instance();
//        assertNotNull(instance1);
//
//        GameMaster instance2 = GameMaster.instance();
//        assertNotNull (instance2);
//
//        GameMaster instance3 = GameMaster.instance();
//        assertNotNull (instance3);
//
//
//    }


}