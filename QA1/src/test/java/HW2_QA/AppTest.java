package HW2_QA;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

/**
 * Unit test for simple App.
 */
public class AppTest 
{
    /**
     * Rigorous Test :-)
     */
    @Test
    public void shouldAnswerWithTrue()
    {
        assertTrue( true );
    }
    /**
     * this function is PVA test
     *  test the min number in the range
     * the number range of C is 70-79
     */
    @Test
    public void C_Step_min() {
    	String Expected = "C" ;
    	String Result=App.checkDegree(70);
    	assertEquals(Result, Expected);
    }
    
    /**
     * this function is PVA test
     *  test the min + 1 number in the range
     * the number range of C is 70-79
     */
    
    @Test
    public void C_Step_minPlus1() {
    	String Expected = "C" ;
    	String Result=App.checkDegree(71);
    	assertEquals(Result, Expected);
    }
    
    /**
     * this function is PVA test
     *  test the random number in the range
     * the number range of C is 70-79
     */
    
    @Test
    public void C_Step_randomInRange() {
    	String Expected = "C" ;
    	String Result=App.checkDegree(75);
    	assertEquals(Result, Expected);
    }
    
    /**
     * this function is PVA test
     *  test the max - 1 number in the range
     * the number range of C is 70-79
     */
    
    @Test
    public void C_Step_maxMinus1() {
    	String Expected = "C" ;
    	String Result=App.checkDegree(78);
    	assertEquals(Result, Expected);
    }
    
    /**
     * this function is PVA test
     *  test the max number in the range
     * the number range of C is 70-79
     */
    
    @Test
    public void C_Step_max() {
    	String Expected = "C" ;
    	String Result=App.checkDegree(79);
    	assertEquals(Result, Expected);
    }
}
