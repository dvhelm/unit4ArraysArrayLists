
import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * Write a description of test class RadarTest here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class RadarTest
{
    /** description of instance variable x (add comment for each instance variable) */
    private int x;

    /**
     * Default constructor for objects of class RadarTest
     */
    public RadarTest()
    {
        // initialise instance variables
        x = 0;
    }

    /**
     * Sets up the test fixture.
     *
     * Called before every test case method.
     */
    @Before
    public void setUp()
    {
    }

    /**
     * Tears down the test fixture.
     *
     * Called after every test case method.
     */
    @After
    public void tearDown()
    {
    }

    @Test
    public void testRadar1()
    {
        // Makes Radar object
        Radar radar = new Radar(100,100);

        // Sets monster location at (87,12)
        radar.setMonsterLocation(87,12);

        // Invokes scan 99 times
        for (int i=0;i<100;i++)
        {
            radar.scan();
        }
        
        //Initializes necessary variables to operate the algorithm
        
        int c=0;
        int highestValue=0;
        int highestValueRow=0;
        int highestValueCol=0;
        
        // Scans through all cells to find the most lit up cell
        
        for (int r=0;r<100;r++)
        {
            for (c=0;c<100;c++)
            {
                if (radar.getAccumulatedDetection(r,c)>highestValue)
                {
                    highestValueCol=c;
                    highestValueRow=r;
                    highestValue=radar.getAccumulatedDetection(r,c);
                }
            }
        }

        // Verifies that the cell found was the intended cell
        
        assertEquals(87,highestValueRow);
        assertEquals(12,highestValueCol);

    }
    @Test
    public void testRadar2()
    {
        // Makes Radar object
        Radar radar = new Radar(100,100);

        // Sets monster location at (55,2)
        radar.setMonsterLocation(55,2);

        // Invokes scan 99 times
        for (int i=0;i<100;i++)
        {
            radar.scan();
        }
        
        //Initializes necessary variables to operate the algorithm        
        
        int c=0;
        int highestValue=0;
        int highestValueRow=0;
        int highestValueCol=0;
        
        // Scans through all cells to find the most lit up cell
        
        for (int r=0;r<100;r++)
        {
            for (c=0;c<100;c++)
            {
                if (radar.getAccumulatedDetection(r,c)>highestValue)
                {
                    highestValueCol=c;
                    highestValueRow=r;
                    highestValue=radar.getAccumulatedDetection(r,c);
                }
            }
        }

        // Verifies that the cell found was the intended cell
        
        assertEquals(55,highestValueRow);
        assertEquals(2,highestValueCol);
    }
}
