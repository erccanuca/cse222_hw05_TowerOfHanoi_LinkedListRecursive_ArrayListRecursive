/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.css222_hw05_091044011_2016_recursive;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author ercan
 */
public class LinkedListRecursiveTest {
    
    public LinkedListRecursiveTest() {
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
     * Test of size method, of class LinkedListRecursive.
     */
    @Test
    public void testSize() {
        System.out.println("size");
        LinkedListRecursive instance = new LinkedListRecursive();
        int expResult = 0;
        int result = instance.size();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of add method, of class LinkedListRecursive.
     */
    @Test
    public void testAdd() {
        System.out.println("add");
        Object newValue = null;
        LinkedListRecursive instance = new LinkedListRecursive();
        instance.add(newValue);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of remove method, of class LinkedListRecursive.
     */
    @Test
    public void testRemove() {
        System.out.println("remove");
        Object outData = null;
        LinkedListRecursive instance = new LinkedListRecursive();
        boolean expResult = false;
        boolean result = instance.remove(outData);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of toString method, of class LinkedListRecursive.
     */
    @Test
    public void testToString() {
        System.out.println("toString");
        LinkedListRecursive instance = new LinkedListRecursive();
        String expResult = "";
        String result = instance.toString();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
