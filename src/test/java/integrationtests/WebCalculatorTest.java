/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package integrationtests;

import java.io.IOException;
import org.junit.Test;
import static org.junit.Assert.*;
import utils.HttpClient;

/**
 *
 * @author Jesper
 */
public class WebCalculatorTest {

    HttpClient client = new HttpClient("http://localhost:7777/SimpleCalculator/calculator");
    


    @Test
    public void testAddPositive() throws IOException {
        String res = client.makeHttpRequest("?operation=add&n1=2&n2=4");
        assertEquals("Result of: 2+4= 6", res);
    }
        
    @Test(expected = IOException.class)
    public void testAddIllegalChar() throws IOException {
        client.makeHttpRequest("?operation=add&n1=a&n2=3");
    }

    @Test
    public void testSubPositiv() throws IOException {
        String res = client.makeHttpRequest("?operation=sub&n1=2&n2=3");
        assertEquals("Result of: 2-3= -1", res);
    }

    @Test(expected = IOException.class)
    public void testSubIllegalChar() throws IOException {
        client.makeHttpRequest("?operation=sub&n1=a&n2=3");
    }

    @Test
    public void testMulPositiv() throws IOException {
        String res = client.makeHttpRequest("?operation=mul&n1=2&n2=3");
        assertEquals("Result of: 2*3= 6", res);
    }

    @Test(expected = IOException.class)
    public void testMulIllegalChar() throws IOException {
        client.makeHttpRequest("?operation=mul&n1=a&n2=3");
    }

    @Test
    public void testDiv() throws IOException {
        String res = client.makeHttpRequest("?operation=div&n1=2&n2=3");
        assertEquals("Result of: 2/3= 0", res);
    }

    @Test(expected = IOException.class)
    public void testDivIllegalChar() throws IOException {
        client.makeHttpRequest("?operation=div&n1=a&n2=3");
    }

    @Test(expected = IOException.class)
    public void testDivZero() throws IOException {
        client.makeHttpRequest("?operation=div&n1=2&n2=0");
    }

}
