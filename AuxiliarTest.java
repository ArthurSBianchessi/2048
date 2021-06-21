
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
        int[][] input_Down1 = {{2, 0, 0, 0}, {2, 0, 0, 0}, {0, 0, 0, 0}, {0, 0, 0, 0}};
        int[][] input_Down2 = {{0, 0, 0, 0}, {0, 0, 0, 0}, {0, 0, 0, 0}, {2, 0, 0, 0}};
        int[][] input_Left1 = {{0, 2, 0, 2}, {0, 0, 0, 0}, {0, 0, 0, 0}, {0, 0, 0, 2}};
        int[][] input_Left2 = {{2, 0, 0, 0}, {0, 0, 0, 0}, {0, 0, 0, 0}, {2, 0, 0, 0}};
        int[][] input_Right1 = {{2, 0, 0, 2}, {2, 0, 0, 0}, {4, 0, 0, 0}, {4, 0, 0, 0}};
        int[][] input_Right2 = {{0, 0, 0, 2}, {0, 0, 0, 2}, {0, 0, 0, 4}, {0, 0, 0, 4}};
        int[][] input_Up1 = {{0, 0, 0, 0}, {0, 0, 0, 0}, {2, 0, 0, 0}, {2, 2, 4, 4}};
        int[][] input_Up2 = {{2, 2, 4, 4}, {0, 0, 0, 0}, {0, 0, 0, 0}, {0, 0, 0, 0}};

        assertEquals(true, Auxiliar.fuseDown(input_Down1));
        assertEquals(false, Auxiliar.fuseDown(input_Down2));
        assertEquals(true, Auxiliar.fuseLeft(input_Left1));
        assertEquals(false, Auxiliar.fuseLeft(input_Left2));
        assertEquals(true, Auxiliar.fuseRight(input_Right1));
        assertEquals(false, Auxiliar.fuseRight(input_Right2));
        assertEquals(true, Auxiliar.fuseUp(input_Up1));
        assertEquals(false, Auxiliar.fuseUp(input_Up2));
    }

    @Test
    public void testFuseDown()
    {
        int[][] input_Down1 = {{2, 0, 0, 0}, {2, 0, 0, 0}, {0, 0, 0, 0}, {0, 0, 0, 0}};
        int[][] input_Down2 = {{0, 0, 0, 0}, {0, 0, 0, 0}, {0, 0, 0, 0}, {2, 0, 0, 0}};

        assertEquals(true, Auxiliar.fuseDown(input_Down1));
        assertEquals(false, Auxiliar.fuseDown(input_Down2));
    }

    @Test
    public void testFuseLeft()
    {
        int[][] input_Left1 = {{0, 2, 0, 2}, {0, 0, 0, 0}, {0, 0, 0, 0}, {0, 0, 0, 2}};
        int[][] input_Left2 = {{2, 0, 0, 0}, {0, 0, 0, 0}, {0, 0, 0, 0}, {2, 0, 0, 0}};

        assertEquals(true, Auxiliar.fuseLeft(input_Left1));
        assertEquals(false, Auxiliar.fuseLeft(input_Left2));
    }

    @Test
    public void testFuseRight()
    {
        int[][] input_Right1 = {{2, 0, 0, 2}, {2, 0, 0, 0}, {4, 0, 0, 0}, {4, 0, 0, 0}};
        int[][] input_Right2 = {{0, 0, 0, 2}, {0, 0, 0, 2}, {0, 0, 0, 4}, {0, 0, 0, 4}};

        assertEquals(true, Auxiliar.fuseRight(input_Right1));
        assertEquals(false, Auxiliar.fuseRight(input_Right2));
    }

    @Test
    public void testFuseUp()
    {
        int[][] input_Up1 = {{0, 0, 0, 0}, {0, 0, 0, 0}, {2, 0, 0, 0}, {2, 2, 4, 4}};
        int[][] input_Up2 = {{2, 2, 4, 4}, {0, 0, 0, 0}, {0, 0, 0, 0}, {0, 0, 0, 0}};

        assertEquals(true, Auxiliar.fuseUp(input_Up1));
        assertEquals(false, Auxiliar.fuseUp(input_Up2));
    }

    @Test
    public void test_____()
    {
        int[][] input_Up1 = {{0, 0, 0, 0}, {0, 0, 0, 0}, {0, 0, 0, 0}, {2, 2, 4, 4}};
        int[][] input_Up2 = {{2, 2, 4, 4}, {0, 0, 0, 0}, {0, 0, 0, 0}, {0, 0, 0, 0}};

        assertEquals(true, Auxiliar.moveUp(input_Up1));
        assertEquals(false, Auxiliar.moveUp(input_Up2));
    }
}

