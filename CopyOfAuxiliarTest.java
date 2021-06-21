

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
public class CopyOfAuxiliarTest
{
    /**
     * Default constructor for test class CopyOfAuxiliarTest
     */
    public CopyOfAuxiliarTest()
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
        int[][] input_down = {{2, 0, 0, 0}, {0, 0, 0, 0}, {0, 0, 0, 0}, {0, 0, 0, 0}};
        int[][] result_down = {{0, 0, 0, 0}, {0, 0, 0, 0}, {0, 0, 0, 0}, {2, 0, 0, 0}};
        
        assertEquals(result_down, Auxiliar.moveDown(input_down));
    }
    
    @Test
    public void testMoveLeft()
    {
        int[][] input_left= {{0, 0, 0, 2}, {0, 0, 0, 0}, {0, 0, 0, 0}, {0, 0, 0, 2}};
        int[][] result_left = {{2, 0, 0, 0}, {0, 0, 0, 0}, {0, 0, 0, 0}, {2, 0, 0, 0}};
        
        assertEquals(result_left, Auxiliar.moveLeft(input_left));
    }
    
    @Test
    public void testMoveRight()
    {
        int[][] input_right = {{2, 0, 0, 0}, {2, 0, 0, 0}, {4, 0, 0, 0}, {4, 0, 0, 0}};
        int[][] result_right = {{0, 0, 0, 2}, {0, 0, 0, 2}, {0, 0, 0, 4}, {0, 0, 0, 4}};
        
        assertEquals(result_right, Auxiliar.moveRight(input_right));
    }
    
    @Test
    public void testMoveUp()
    {
        int[][] input_up = {{0, 0, 0, 0}, {0, 0, 0, 0}, {0, 0, 0, 0}, {2, 2, 4, 4}};
        int[][] result_up = {{2, 2, 4, 4}, {0, 0, 0, 0}, {0, 0, 0, 0}, {0, 0, 0, 0}};

        
        assertEquals(result_up, Auxiliar.moveUp(input_up));
    }
    
    @Test
    public void testAllMoves()
    {
        int[][] input_down = {{ 2, 0, 0, 0}, {0, 0, 0, 0}, {0, 0, 0, 0}, {0, 0, 0, 0}};
        int[][] result_down = {{ 0, 0, 0, 0}, {0, 0, 0, 0}, {0, 0, 0, 0}, {2, 0, 0, 0}};
        int[][] input_left= {{ 0, 0, 0, 2}, {0, 0, 0, 0}, {0, 0, 0, 0}, {0, 0, 0, 2}};
        int[][] result_left = {{ 2, 0, 0, 0}, {0, 0, 0, 0}, {0, 0, 0, 0}, {2, 0, 0, 0}};
        int[][] input_right = {{ 2, 0, 0, 0}, {2, 0, 0, 0}, {4, 0, 0, 0}, {4, 0, 0, 0}};
        int[][] result_right = {{ 0, 0, 0, 2}, {0, 0, 0, 2}, {0, 0, 0, 4}, {0, 0, 0, 4}};
        int[][] input_up = {{ 0, 0, 0, 0}, {0, 0, 0, 0}, {0, 0, 0, 0}, {2, 2, 4, 4}};
        int[][] result_up = {{2, 2, 4, 4}, {0, 0, 0, 0}, {0, 0, 0, 0}, {0, 0, 0, 0}};
        
        assertEquals(result_down, Auxiliar.moveDown(input_down));
        assertEquals(result_left, Auxiliar.moveLeft(input_left));
        assertEquals(result_right, Auxiliar.moveRight(input_right));
        assertEquals(result_up, Auxiliar.moveUp(input_up));
    }
    
    @Test
    public void TESTE()
    {
        int[][] input_up = {{0, 0, 0, 0}, {0, 0, 0, 0}, {0, 0, 0, 0}, {2, 2, 4, 4}};
        int[][] result_up = {{2, 2, 4, 4}, {0, 0, 0, 0}, {0, 0, 0, 0}, {0, 0, 0, 0}};

        
        //assertEquals(result_up, Auxiliar.moveUp(({{0, 0, 0, 0}, {0, 0, 0, 0}, {0, 0, 0, 0}, {2, 2, 4, 4}})));
    }
}

