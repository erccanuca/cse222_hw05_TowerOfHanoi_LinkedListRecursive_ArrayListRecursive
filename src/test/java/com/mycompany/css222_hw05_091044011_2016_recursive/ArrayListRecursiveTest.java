/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.css222_hw05_091044011_2016_recursive;

import java.util.List;
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
public class ArrayListRecursiveTest {
    
    public ArrayListRecursiveTest() {
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
     * Test of IntersectionOfLists method, of class ArrayListRecursive.
     */
    @Test
    public void testIntersectionOfLists() {
        System.out.println("IntersectionOfLists");
        ArrayListRecursive instance = new ArrayListRecursive();
        List expResult = null;
        List result = instance.IntersectionOfLists();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of UnionOfLists method, of class ArrayListRecursive.
     */
    @Test
    public void testUnionOfLists() {
        System.out.println("UnionOfLists");
        ArrayListRecursive instance = new ArrayListRecursive();
        List expResult = null;
        List result = instance.UnionOfLists();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of isSubSet method, of class ArrayListRecursive.
     */
    @Test
    public void testIsSubSet() {
        System.out.println("isSubSet");
        ArrayListRecursive instance = new ArrayListRecursive();
        boolean expResult = false;
        boolean result = instance.isSubSet();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of toString method, of class ArrayListRecursive.
     */
    @Test
    public void testToString() {
        System.out.println("toString");
        ArrayListRecursive instance = new ArrayListRecursive();
        String expResult = "";
        String result = instance.toString();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
