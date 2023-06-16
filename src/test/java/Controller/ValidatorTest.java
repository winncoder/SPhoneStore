/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import javax.swing.JTextField;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author Admin
 */
public class ValidatorTest {
    
    public ValidatorTest() {
    }
    
    @BeforeAll
    public static void setUpClass() {
    }
    
    @AfterAll
    public static void tearDownClass() {
    }
    
    @BeforeEach
    public void setUp() {
    }
    
    @AfterEach
    public void tearDown() {
    }

    /**
     * Test of checkName method, of class Validator.
     */
    @Test
    public void testCheckName() {
        System.out.println("checkName");
        JTextField field = new JTextField("Iphone12");
        StringBuilder stringBuilder = new StringBuilder();
        Validator.checkName(field, stringBuilder);
        String errorMessage = stringBuilder.toString();
        assertTrue(errorMessage.isEmpty());
    }

    /**
     * Test of checkId method, of class Validator.
     */
    @Test
    public void testCheckId() {
        System.out.println("checkId");
        JTextField field = new JTextField("123");
        StringBuilder stringBuilder = new StringBuilder();
        boolean expResult = true;
        boolean result = Validator.checkId(field, stringBuilder);
        assertEquals(expResult, result);
    }
    /**
     * Test of checkPrice method, of class Validator.
     */
    @Test
    public void testCheckPrice() {
        System.out.println("checkPrice");
        JTextField field = new JTextField("10"); // Example input
        StringBuilder stringBuilder = new StringBuilder();
        boolean expResult = true;
        boolean result = Validator.checkPrice(field, stringBuilder);
        assertEquals(expResult, result);
    }

    /**
     * Test of checkEmpty method, of class Validator.
     */
    @Test
    public void testCheckEmpty() {
        System.out.println("checkEmpty");
        JTextField field = new JTextField(""); // Example input
        StringBuilder stringBuilder = new StringBuilder();
        String message = "Field is empty!";
        boolean expResult = false;
        boolean result = Validator.checkEmpty(field, stringBuilder, message);
        assertEquals(expResult, result);
    }
    
}
