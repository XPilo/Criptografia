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
public class SustitutionTest {
    String key = "xnyahpogzqwbtsflrcvmuekjdi";
    String clearText = "thisciphertextcannotbedecrypted";
    String cipherText = "MGZVYZLGHCMHJMYXSSFMNHAHYCDLMHA";
    
    public SustitutionTest() {
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
     * Test of cipherString method, of class Sustitution.
     */
    @Test
    public void testCipherString() {
        System.out.println("cipherString");
        String expResult = "MGZVYZLGHCMHJMYXSSFMNHAHYCDLMHA";
        String result = Sustitution.cipherString(clearText, key);
        System.out.println(result);
        assertEquals(expResult, result);
    }
    
     
    @Test
    public void testDecodeString() {
        System.out.println("decodeString");
        String expResult = "thisciphertextcannotbedecrypted";
        String result = Sustitution.decodeString(cipherText, key);
        System.out.println(result);
        assertEquals(expResult, result);
    }
    
}
