/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ciphers;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Jose
 */
public class CesarTest {
    
    public CesarTest() {
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

    /**
     * Test of cipherCharacter method, of class Cesar.
     */
    //@Test
    public void testCipherCharacter() {
        System.out.println("cipherCharacter");
        char x = ' ';
        int k = 0;
        char expResult = ' ';
        char result = Cesar.cipherCharacter(x, k);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of cipherString method, of class Cesar.
     */
    //@Test
    public void testCipherString() {
        System.out.println("cipherString");
        String clearText = "";
        int k = 0;
        String expResult = "";
        String result = Cesar.cipherString(clearText, k);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of decipherCharacter method, of class Cesar.
     */
    //@Test
    public void testDecodeCharacter() {
        System.out.println("decipherCharacter");
        char x = 'p';
        int k = 11;
        char expResult = 'e';
        char result = Cesar.decodeCharacter(x, k);
        assertEquals(expResult, result);
    }

    /**
     * Test of decipherString method, of class Cesar.
     */
    @Test
    public void testDecodeString() {
        System.out.println("decipherString");
        String cipherText = "HPHTWWXPPELEXTOYTRSE";
        int k = 11;
        String expResult = "wewillmeetatmidnight";
        String result = Cesar.decodeString(cipherText, k);
        assertEquals(expResult, result);
    }
    
}
