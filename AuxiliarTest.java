
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

/**
 * The test class CopyOfAuxiliarTest.
 *
 * @author  (your name)
 * @version (a version number or a date)
 */
public class AuxiliarTest
{
    /**
     * Default constructor for test class CopyOfAuxiliarTest
     */
    public AuxiliarTest()
    {
    }

    /**
     * Sets up the test fixture.
     *
     * Called before every test case method.
     */
    @BeforeEach
    public void setUp()
    {
    }

    /**
     * Tears down the test fixture.
     *
     * Called after every test case method.
     */
    @AfterEach
    public void tearDown()
    {
    }

    @Test
    public void testMoveDown()
    {
        int[][] input_Down1 = {{2, 0, 0, 0}, {0, 0, 0, 0}, {0, 0, 0, 0}, {0, 0, 0, 0}};
        int[][] input_Down2 = {{0, 0, 0, 0}, {0, 0, 0, 0}, {0, 0, 0, 0}, {2, 0, 0, 0}};

        assertEquals(true, Auxiliar.moveDown(input_Down1));
        assertEquals(false, Auxiliar.moveDown(input_Down2));
    }

    @Test
    public void testMoveLeft()
    {
        int[][] input_Left1 = {{0, 0, 0, 2}, {0, 0, 0, 0}, {0, 0, 0, 0}, {0, 0, 0, 2}};
        int[][] input_Left2 = {{2, 0, 0, 0}, {0, 0, 0, 0}, {0, 0, 0, 0}, {2, 0, 0, 0}};

        assertEquals(true, Auxiliar.moveLeft(input_Left1));
        assertEquals(false, Auxiliar.moveLeft(input_Left2));
    }

    @Test
    public void testMoveRight()
    {
        int[][] input_Right1 = {{2, 0, 0, 0}, {2, 0, 0, 0}, {4, 0, 0, 0}, {4, 0, 0, 0}};
        int[][] input_Right2 = {{0, 0, 0, 2}, {0, 0, 0, 2}, {0, 0, 0, 4}, {0, 0, 0, 4}};

        assertEquals(true, Auxiliar.moveRight(input_Right1));
        assertEquals(false, Auxiliar.moveRight(input_Right2));
    }

    @Test
    public void testMoveUp()
    {
        int[][] input_Up1 = {{0, 0, 0, 0}, {0, 0, 0, 0}, {0, 0, 0, 0}, {2, 2, 4, 4}};
        int[][] input_Up2 = {{2, 2, 4, 4}, {0, 0, 0, 0}, {0, 0, 0, 0}, {0, 0, 0, 0}};

        assertEquals(true, Auxiliar.moveUp(input_Up1));
        assertEquals(false, Auxiliar.moveUp(input_Up2));
    }

    @Test
    public void testAllMoves()
    {
        int[][] input_Down1 = {{2, 0, 0, 0}, {0, 0, 0, 0}, {0, 0, 0, 0}, {0, 0, 0, 0}};
        int[][] input_Down2 = {{0, 0, 0, 0}, {0, 0, 0, 0}, {0, 0, 0, 0}, {2, 0, 0, 0}};
        int[][] input_Left1 = {{0, 0, 0, 2}, {0, 0, 0, 0}, {0, 0, 0, 0}, {0, 0, 0, 2}};
        int[][] input_Left2 = {{2, 0, 0, 0}, {0, 0, 0, 0}, {0, 0, 0, 0}, {2, 0, 0, 0}};
        int[][] input_Right1 = {{2, 0, 0, 0}, {2, 0, 0, 0}, {4, 0, 0, 0}, {4, 0, 0, 0}};
        int[][] input_Right2 = {{0, 0, 0, 2}, {0, 0, 0, 2}, {0, 0, 0, 4}, {0, 0, 0, 4}};
        int[][] input_Up1 = {{0, 0, 0, 0}, {0, 0, 0, 0}, {0, 0, 0, 0}, {2, 2, 4, 4}};
        int[][] input_Up2 = {{2, 2, 4, 4}, {0, 0, 0, 0}, {0, 0, 0, 0}, {0, 0, 0, 0}};

        assertEquals(true, Auxiliar.moveDown(input_Down1));
        assertEquals(false, Auxiliar.moveDown(input_Down2));
        assertEquals(true, Auxiliar.moveLeft(input_Left1));
        assertEquals(false, Auxiliar.moveLeft(input_Left2));
        assertEquals(true, Auxiliar.moveRight(input_Right1));
        assertEquals(false, Auxiliar.moveRight(input_Right2));
        assertEquals(true, Auxiliar.moveUp(input_Up1));
        assertEquals(false, Auxiliar.moveUp(input_Up2));
    }

    @Test
    public void testAllFusions()
    {
        int[][] input_Down1 = {{2, 4, 8, 16}, {2, 4, 8, 16}, {32, 64, 128, 256}, {32, 64, 128, 256}};
        int[][] input_Down2 = {{0, 0, 0, 0}, {0, 0, 0, 0}, {0, 0, 0, 0}, {2, 0, 0, 0}};
        int[][] input_Left1 = {{2, 2, 4, 4}, {8, 8, 16, 16}, {32, 32, 64, 64}, {128, 128, 256, 256}};
        int[][] input_Left2 = {{2, 0, 0, 0}, {0, 0, 0, 0}, {0, 0, 0, 0}, {2, 0, 0, 0}};
        int[][] input_Right1 = {{2, 2, 4, 4}, {8, 8, 16, 16}, {32, 32, 64, 64}, {128, 128, 256, 256}};
        int[][] input_Right2 = {{0, 0, 0, 2}, {0, 0, 0, 2}, {0, 0, 0, 4}, {0, 0, 0, 4}};
        int[][] input_Up1 = {{2, 4, 8, 16}, {2, 4, 8, 16}, {32, 64, 128, 256}, {32, 64, 128, 256}};
        int[][] input_Up2 = {{2, 2, 4, 4}, {0, 0, 0, 0}, {0, 0, 0, 0}, {0, 0, 0, 0}};

        assertEquals(1020, Auxiliar.fuseDown(input_Down1));
        assertEquals(0, Auxiliar.fuseDown(input_Down2));
        assertEquals(1020, Auxiliar.fuseLeft(input_Left1));
        assertEquals(0, Auxiliar.fuseLeft(input_Left2));
        assertEquals(1020, Auxiliar.fuseRight(input_Right1));
        assertEquals(0, Auxiliar.fuseRight(input_Right2));
        assertEquals(1020, Auxiliar.fuseUp(input_Up1));
        assertEquals(0, Auxiliar.fuseUp(input_Up2));
    }

    @Test
    public void testFuseDown()
    {
        int[][] input_Down1 = {{2, 4, 8, 16}, {2, 4, 8, 16}, {32, 64, 128, 256}, {32, 64, 128, 256}};
        int[][] input_Down2 = {{0, 0, 0, 0}, {0, 0, 0, 0}, {0, 0, 0, 0}, {2, 0, 0, 0}};

        assertEquals(1020, Auxiliar.fuseDown(input_Down1));
        assertEquals(0, Auxiliar.fuseDown(input_Down2));
    }

    @Test
    public void testFuseLeft()
    {
        int[][] input_Left1 = {{2, 2, 4, 4}, {8, 8, 16, 16}, {32, 32, 64, 64}, {128, 128, 256, 256}};
        int[][] input_Left2 = {{2, 0, 0, 0}, {0, 0, 0, 0}, {0, 0, 0, 0}, {2, 0, 0, 0}};

        assertEquals(1020, Auxiliar.fuseLeft(input_Left1));
        assertEquals(0, Auxiliar.fuseLeft(input_Left2));
    }

    @Test
    public void testFuseRight()
    {
        int[][] input_Right1 = {{2, 2, 4, 4}, {8, 8, 16, 16}, {32, 32, 64, 64}, {128, 128, 256, 256}};
        int[][] input_Right2 = {{0, 0, 0, 2}, {0, 0, 0, 2}, {0, 0, 0, 4}, {0, 0, 0, 4}};

        assertEquals(1020, Auxiliar.fuseRight(input_Right1));
        assertEquals(0, Auxiliar.fuseRight(input_Right2));
    }

    @Test
    public void testFuseUp()
    {
        int[][] input_Up1 = {{2, 4, 8, 16}, {2, 4, 8, 16}, {32, 64, 128, 256}, {32, 64, 128, 256}};
        int[][] input_Up2 = {{2, 2, 4, 4}, {0, 0, 0, 0}, {0, 0, 0, 0}, {0, 0, 0, 0}};

        assertEquals(1020, Auxiliar.fuseUp(input_Up1));
        assertEquals(0, Auxiliar.fuseUp(input_Up2));
    }

    @Test
    public void testHighestValue()
    {
        int[][] input_hv2 = {{2, 0, 0, 0}, {0, 0, 0, 0}, {0, 0, 0, 0}, {0, 0, 0, 0}};
        int[][] input_hv4 = {{2, 4, 0, 0}, {0, 0, 0, 0}, {0, 0, 0, 0}, {0, 0, 0, 0}};
        int[][] input_hv8 = {{2, 4, 8, 0}, {0, 0, 0, 0}, {0, 0, 0, 0}, {0, 0, 0, 0}};
        int[][] input_hv16 = {{2, 4, 8, 16}, {0, 0, 0, 0}, {0, 0, 0, 0}, {0, 0, 0, 0}};
        int[][] input_hv32 = {{2, 4, 8, 16}, {32, 0, 0, 0}, {0, 0, 0, 0}, {0, 0, 0, 0}};
        int[][] input_hv64 = {{2, 4, 8, 16}, {32, 64, 0, 0}, {0, 0, 0, 0}, {0, 0, 0, 0}};
        int[][] input_hv128 = {{2, 4, 8, 16}, {32, 64, 128, 0}, {0, 0, 0, 0}, {0, 0, 0, 0}};
        int[][] input_hv256 = {{2, 4, 8, 16}, {32, 64, 128, 256}, {0, 0, 0, 0}, {0, 0, 0, 0}};
        int[][] input_hv512 = {{2, 4, 8, 16}, {32, 64, 128, 256}, {512, 0, 0, 0}, {0, 0, 0, 0}};
        int[][] input_hv1024 = {{2, 4, 8, 16}, {32, 64, 128, 256}, {512, 1024, 0, 0}, {0, 0, 0, 0}};
        int[][] input_hv2048 = {{2, 4, 8, 16}, {32, 64, 128, 256}, {512, 1024, 2048, 0}, {0, 0, 0, 0}};
        int[][] input_hv4096 = {{2, 4, 8, 16}, {32, 64, 128, 256}, {512, 1024, 2048, 4096}, {0, 0, 0, 0}};
        int[][] input_hv8192 = {{2, 4, 8, 16}, {32, 64, 128, 256}, {512, 1024, 2048, 4096}, {8192, 0, 0, 0}};
        int[][] input_hv16384 = {{2, 4, 8, 16}, {32, 64, 128, 256}, {512, 1024, 2048, 4096}, {8192, 16384, 0, 0}};
        int[][] input_hv32768 = {{2, 4, 8, 16}, {32, 64, 128, 256}, {512, 1024, 2048, 4096}, {8192, 16384, 32768, 0}};
        int[][] input_hv65536 = {{2, 4, 8, 16}, {32, 64, 128, 256}, {512, 1024, 2048, 4096}, {8192, 16384, 32768, 65536}};

        assertEquals(2, Auxiliar.highestValue(input_hv2));
        assertEquals(4, Auxiliar.highestValue(input_hv4));
        assertEquals(8, Auxiliar.highestValue(input_hv8));
        assertEquals(16, Auxiliar.highestValue(input_hv16));
        assertEquals(32, Auxiliar.highestValue(input_hv32));
        assertEquals(64, Auxiliar.highestValue(input_hv64));
        assertEquals(128, Auxiliar.highestValue(input_hv128));
        assertEquals(256, Auxiliar.highestValue(input_hv256));
        assertEquals(512, Auxiliar.highestValue(input_hv512));
        assertEquals(1024, Auxiliar.highestValue(input_hv1024));
        assertEquals(2048, Auxiliar.highestValue(input_hv2048));
        assertEquals(4096, Auxiliar.highestValue(input_hv4096));
        assertEquals(8192, Auxiliar.highestValue(input_hv8192));
        assertEquals(16384, Auxiliar.highestValue(input_hv16384));
        assertEquals(32768, Auxiliar.highestValue(input_hv32768));
        assertEquals(65536, Auxiliar.highestValue(input_hv65536));
    }

    @Test
    public void testEmptySpaces()
    {
        int[][] input_es0 = {{2, 2, 2, 2}, {2, 2, 2, 2}, {2, 2, 2, 2}, {2, 2, 2, 2}};
        int[][] input_es1 = {{0, 2, 2, 2}, {2, 2, 2, 2}, {2, 2, 2, 2}, {2, 2, 2, 2}};
        int[][] input_es2 = {{2, 0, 2, 2}, {2, 2, 2, 2}, {2, 2, 2, 2}, {2, 2, 2, 2}};
        int[][] input_es3 = {{2, 2, 0, 2}, {2, 2, 2, 2}, {2, 2, 2, 2}, {2, 2, 2, 2}};
        int[][] input_es4 = {{2, 2, 2, 0}, {2, 2, 2, 2}, {2, 2, 2, 2}, {2, 2, 2, 2}};
        int[][] input_es5 = {{2, 2, 2, 2}, {0, 2, 2, 2}, {2, 2, 2, 2}, {2, 2, 2, 2}};
        int[][] input_es6 = {{2, 2, 2, 2}, {2, 0, 2, 2}, {2, 2, 2, 2}, {2, 2, 2, 2}};
        int[][] input_es7 = {{2, 2, 2, 2}, {2, 2, 0, 2}, {2, 2, 2, 2}, {2, 2, 2, 2}};
        int[][] input_es8 = {{2, 2, 2, 2}, {2, 2, 2, 0}, {2, 2, 2, 2}, {2, 2, 2, 2}};
        int[][] input_es9 = {{2, 2, 2, 2}, {2, 2, 2, 2}, {0, 2, 2, 2}, {2, 2, 2, 2}};
        int[][] input_es10 = {{2, 2, 2, 2}, {2, 2, 2, 2}, {2, 0, 2, 2}, {2, 2, 2, 2}};
        int[][] input_es11 = {{2, 2, 2, 2}, {2, 2, 2, 2}, {2, 2, 0, 2}, {2, 2, 2, 2}};
        int[][] input_es12 = {{2, 2, 2, 2}, {2, 2, 2, 2}, {2, 2, 2, 0}, {2, 2, 2, 2}};
        int[][] input_es13 = {{2, 2, 2, 2}, {2, 2, 2, 2}, {2, 2, 2, 2}, {0, 2, 2, 2}};
        int[][] input_es14 = {{2, 2, 2, 2}, {2, 2, 2, 2}, {2, 2, 2, 2}, {2, 0, 2, 2}};
        int[][] input_es15 = {{2, 2, 2, 2}, {2, 2, 2, 2}, {2, 2, 2, 2}, {2, 2, 0, 2}};
        int[][] input_es16 = {{2, 2, 2, 2}, {2, 2, 2, 2}, {2, 2, 2, 2}, {2, 2, 2, 0}};

        assertEquals(false, Auxiliar.emptySpaces(input_es0));
        assertEquals(true, Auxiliar.emptySpaces(input_es1));
        assertEquals(true, Auxiliar.emptySpaces(input_es2));
        assertEquals(true, Auxiliar.emptySpaces(input_es3));
        assertEquals(true, Auxiliar.emptySpaces(input_es4));
        assertEquals(true, Auxiliar.emptySpaces(input_es5));
        assertEquals(true, Auxiliar.emptySpaces(input_es6));
        assertEquals(true, Auxiliar.emptySpaces(input_es7));
        assertEquals(true, Auxiliar.emptySpaces(input_es8));
        assertEquals(true, Auxiliar.emptySpaces(input_es9));
        assertEquals(true, Auxiliar.emptySpaces(input_es10));
        assertEquals(true, Auxiliar.emptySpaces(input_es11));
        assertEquals(true, Auxiliar.emptySpaces(input_es12));
        assertEquals(true, Auxiliar.emptySpaces(input_es13));
        assertEquals(true, Auxiliar.emptySpaces(input_es14));
        assertEquals(true, Auxiliar.emptySpaces(input_es15));
        assertEquals(true, Auxiliar.emptySpaces(input_es16));
    }

    @Test
    public void testAllPrintsOnly()
    {
        int[][] grid = {{0, 0, 0, 0}, {0, 0, 0, 0}, {0, 0, 0, 0}, {0, 0, 0, 2048}};

        Auxiliar.greetings();
        Auxiliar.printMatrix(grid, 0);
        Auxiliar.printYouWon();
        Auxiliar.printGameOver();
    }
}


