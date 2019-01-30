/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package logic;

import calculator.Calculator;
import org.junit.After;
import org.junit.AfterClass;
import static org.junit.Assert.assertEquals;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

/**
 *
 * @author Jesper
 */
public class CalculatorTest {
    
    public CalculatorTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }
    
    Calculator sc = new Calculator();

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}
    
    @Test
    public void testAddPositive() {
        int result = sc.add(2, 2);
        assertEquals(4, result);
    }

    @Test
    public void testAddNegative() {
        int result = sc.add(-2, -2);
        assertEquals(-4, result);
    }

    @Test
    public void testAddPositiveAndNegative() {
        int result = sc.add(2, -2);
        assertEquals(0, result);
    }

    @Test
    public void testSubPositive() {
        int result = sc.sub(2, 2);
        assertEquals(0, result);
    }

    @Test
    public void testSubNegative() {
        int result = sc.sub(-2, -2);
        assertEquals(0, result);
    }

    @Test
    public void testSubPositiveAndNegative() {
        int result = sc.sub(2, -2);
        assertEquals(4, result);
    }

    @Test
    public void testMulPositive() {
        int result = sc.mul(2, 2);
        assertEquals(4, result);
    }

    @Test
    public void testMulNegative() {
        Calculator sc = new Calculator();
        int result = sc.mul(-2, -2);
        assertEquals(4, result);
    }

    @Test
    public void testMulPositiveAndNegative() {
        int result = sc.mul(2, -2);
        assertEquals(-4, result);
    }

    @Test
    public void testDivPositive() {
        int result = sc.div(2, 2);
        assertEquals(1, result);
    }

    @Test
    public void testDivNegative() {
        int result = sc.div(-2, -2);
        assertEquals(1, result);
    }

    @Test
    public void testDivPositiveAndNegative() {
        int result = sc.div(2, -2);
        assertEquals(-1, result);
    }

    @Test(expected = ArithmeticException.class)
    public void testDivException() {
        sc.div(2, 0);
    }
    
}
