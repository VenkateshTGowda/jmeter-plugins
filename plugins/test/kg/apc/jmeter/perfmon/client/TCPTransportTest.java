/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package kg.apc.jmeter.perfmon.client;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author undera
 */
public class TCPTransportTest {
    
    public TCPTransportTest() {
    }

    @BeforeClass
    public static void setUpClass() throws Exception {
    }

    @AfterClass
    public static void tearDownClass() throws Exception {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of disconnect method, of class TCPTransport.
     */
    @Test
    public void testDisconnect() {
        System.out.println("disconnect");
        TCPTransport instance = null;
        instance.disconnect();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of writeln method, of class TCPTransport.
     */
    @Test
    public void testWriteln() {
        System.out.println("writeln");
        String string = "";
        TCPTransport instance = null;
        instance.writeln(string);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of readln method, of class TCPTransport.
     */
    @Test
    public void testReadln() {
        System.out.println("readln");
        TCPTransport instance = null;
        String expResult = "";
        String result = instance.readln();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
}