

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
    public void testRadar()
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
        
        int highestValue=radar.getAccumulatorDetection[0][0];
        for (int r=0;i<100;r++)
        {
            for (int c=0;c<100;c++)
            {
                if (getAccumulatorDetection[r][c]>highestValue)
                {
                    highestValue=radar.getAccumulator[r][c];
                }
            }
        }
        //assertEquals(getAccumulatorValue
    }
}