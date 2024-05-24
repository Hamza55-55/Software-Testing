/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author badar
 */
public class RemoveDuplicatesTest {
    
    public RemoveDuplicatesTest() {
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
     * Test of removeDuplicates method, of class RemoveDuplicates.
     */
    @Test
    public void EmptyArray() {
        System.out.println("Empty array");
        int[] array = {};
        int expResult = 0;
        int result = RemoveDuplicates.removeDuplicates(array);
        assertEquals(expResult, result);
    }
 @Test
    public void SingleValue() {
        System.out.println("if single value is entered");
        int[] array = {1};
        int expResult = 1;
        int result = RemoveDuplicates.removeDuplicates(array);
        assertEquals(expResult, result);
    }
    @Test
    public void NoDuplicateCase() {
        System.out.println("if no duplicates ");
        int[] array = {1,2,3,47};
        int expResult = array.length;
        int result = RemoveDuplicates.removeDuplicates(array);
        if(result==expResult){
        System.out.println("There are no such duplicates in array");
        }else
        {
            assertEquals(expResult, result);
        }
    }
     @Test
    public void AllDuplicateCase() {
        System.out.println("AllDuplicates");
        int[] array = {3,3,3,3};
        int expResult =1;
        int result = RemoveDuplicates.removeDuplicates(array);
        assertEquals(expResult, result);
    }
     @Test
    public void Mixednumbers() {
        System.out.println("Mixed numbers");
        int[] array = {1,3,4,5,5,7,7};
        int expResult = 5;
        int result = RemoveDuplicates.removeDuplicates(array);
        assertEquals(expResult, result);
         System.out.println(result);
    }
    /**
     * Test of main method, of class RemoveDuplicates.
     */
    @Test
    public void testMain() {
        System.out.println("main");
        String[] args = null;
        RemoveDuplicates.main(args);
    }
    
}
