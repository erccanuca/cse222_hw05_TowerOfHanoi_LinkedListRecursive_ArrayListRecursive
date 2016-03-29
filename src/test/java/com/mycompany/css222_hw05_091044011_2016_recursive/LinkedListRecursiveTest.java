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
        int result = instance.size(); // should be zero
        assertEquals(expResult, result);
    }

    /**
     * Test of add method, of class LinkedListRecursive.
     */
    @Test
    public void testAdd() {
        System.out.println("add");
        Object newValue = "11";
        Object newValue2 = "11";
        LinkedListRecursive instance = new LinkedListRecursive();
        LinkedListRecursive instance2 = new LinkedListRecursive();
        instance.add(newValue);
        instance2.add(newValue2);
        assertEquals(instance.toString(), instance2.toString());
    }

    /**
     * Test of remove method, of class LinkedListRecursive.
     */
    @Test
    public void testRemove() {
        System.out.println("remove");
        Object outData = 12;
        LinkedListRecursive instance = new LinkedListRecursive();
        instance.add(12);
        instance.add(13);
        instance.add(12);
        LinkedListRecursive instance2 = new LinkedListRecursive();
        instance2.add(13);
        boolean result = instance.remove(outData);
        assertTrue(result);
        assertEquals(instance.toString(),instance2.toString());
    }

    /**
     * Test of toString method, of class LinkedListRecursive.
     */
    @Test
    public void testToString() {
        System.out.println("toString");
        LinkedListRecursive instance = new LinkedListRecursive();
        instance.add("ali");
        String expResult = "ali\n";
        String result = instance.toString();
        assertEquals(expResult, result);
    }
    
}
