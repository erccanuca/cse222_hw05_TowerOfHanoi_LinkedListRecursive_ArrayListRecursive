/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.css222_hw05_091044011_2016_recursive;

import java.util.ArrayList;
import java.util.Collections;
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
        ArrayList<Integer> arr1 = new ArrayList<>();
        arr1.add(12);
        arr1.add(10);
        arr1.add(23);
        ArrayList<Integer> arr2 = new ArrayList<>();
        arr2.add(23);
        arr2.add(10);
        Collections.sort(arr2);
        ArrayListRecursive instance = new ArrayListRecursive(arr1, arr2);
        List result = instance.IntersectionOfLists();
        Collections.sort(result);
        assertEquals(arr2, result);
    }

    /**
     * Test of UnionOfLists method, of class ArrayListRecursive.
     */
    @Test
    public void testUnionOfLists() {
        System.out.println("UnionOfLists");
        ArrayList<Integer> arr1 = new ArrayList<>();
        arr1.add(12);
        arr1.add(10);
        arr1.add(23);
        ArrayList<Integer> arr2 = new ArrayList<>();
        arr2.add(23);
        arr2.add(10);
        Collections.sort(arr1);
        ArrayListRecursive instance = new ArrayListRecursive(arr1, arr2);
        List result = instance.UnionOfLists();
        Collections.sort(result);
        assertEquals(arr1, result);
    }

    /**
     * Test of isSubSet method, of class ArrayListRecursive.
     */
    @Test
    public void testIsSubSet() {
        System.out.println("isSubSet");
        ArrayList<Integer> arr1 = new ArrayList<>();
        arr1.add(12);
        arr1.add(10);
        arr1.add(23);
        ArrayList<Integer> arr2 = new ArrayList<>();
        arr2.add(10);
        arr2.add(23);
        Collections.sort(arr1);
        ArrayListRecursive instance = new ArrayListRecursive(arr1, arr2);
        boolean expResult = true;
        boolean result = instance.isSubSet();
        assertEquals(expResult, result);
    }

    /**
     * Test of toString method, of class ArrayListRecursive.
     */
    @Test
    public void testToString() {
        System.out.println("toString");
        ArrayList<Integer> arr1 = new ArrayList<>();
        arr1.add(12);
        ArrayList<Integer> arr2 = new ArrayList<>();
        arr2.add(10);
        ArrayListRecursive instance = new ArrayListRecursive(arr1, arr2);
        String expResult = "ArrayListRecursive{list1=[12], list2=[10]}";
        String result = instance.toString();
        assertEquals(expResult, result);
    }
    
}
