/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.css222_hw05_091044011_2016_recursive;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

/**
 * @author ercan
 */
public class MainTestClass {
    /**
    * Main test Method
    * @param args Command line arguments 
    */
    public static void main(String[] args) {
        
        /*-----------------------------------PART 1----------------------------*/
        System.out.println("-----------------------PART_1-----------------------");
        int numberOfDisk = 3;
        int[][] pegs = new int[3][numberOfDisk];
        int[] pegA = new int[3];
        int[] pegB = new int[3];
        towerOfHanoiIteratively(pegs, pegA, pegB, numberOfDisk);
        System.out.println("---------------------PART_1_END---------------------");
        
       /*----------------------------------PART 2-------------------------------*/
        test_part_2();
        /*-------------------------------PART 3---------------------------------*/
        test_part_3_Intersection();
        test_part_3_Union();
        test_part_3_Subset();
        
    }
   /**
    * Tower of hanoi implement iterative.
    * @param pegs store weight and disk number.
    * @param pegA store swaps for pegA. 
    * @param pegB store sawps for pegB.
    * @param numberOfDisk total disks number.
    */
    private static void towerOfHanoiIteratively(int pegs[][], int pegA[], int pegB[], int numberOfDisk) {

        int numMoves = 0;
        int cyclemove = 0;
        System.out.println("");
        for (int i = 0; i < numberOfDisk; i++) {
            pegs[0][i] = i + 1;
            pegs[1][i] = 99;
            pegs[2][i] = 99;
            System.out.println("pegs[0]["+i+"] = " + (i+1));
            System.out.println("pegs[1]["+i+"] = " + (99));
            System.out.println("pegs[2]["+i+"] = " + (99));
        }

        if (numberOfDisk % 2 != 0) {
            pegA[0] = 0;
            pegA[1] = 0;
            pegA[2] = 1;

            pegB[0] = 2;
            pegB[1] = 1;
            pegB[2] = 2;
        } else {
            pegA[0] = 0;
            pegA[1] = 0;
            pegA[2] = 1;

            pegB[0] = 1;
            pegB[1] = 2;
            pegB[2] = 2;
        }

        long startTime = System.currentTimeMillis();

        while (pegs[0][0] != pegs[1][0]) {
            numMoves++;
            cyclemove = ((numMoves - 1) % 3);
            if (pegs[pegA[cyclemove]][0] < pegs[pegB[cyclemove]][0]) {
                pegs[pegB[cyclemove]][(numberOfDisk - 1)] = pegs[pegA[cyclemove]][0];
                pegs[pegA[cyclemove]][0] = 99;
                System.out.printf("Moving disk %d from peg %d to peg %d\n",
                        pegs[pegB[cyclemove]][(numberOfDisk - 1)], pegA[cyclemove], pegB[cyclemove]);
            } else {
                pegs[pegA[cyclemove]][(numberOfDisk - 1)] = pegs[pegB[cyclemove]][0];
                pegs[pegB[cyclemove]][0] = 99;
                System.out.printf("Moving disk %d from peg %d to peg %d\n",
                        pegs[pegA[cyclemove]][(numberOfDisk - 1)], pegB[cyclemove], pegA[cyclemove]);
            }
            Arrays.sort(pegs[pegA[cyclemove]]);
            Arrays.sort(pegs[pegB[cyclemove]]);

        }// end while
        long endTime = System.currentTimeMillis();
        long totalTime = endTime - startTime;

        System.out.printf("Took approximately %d ms to solve Towers of Hanoi with %d disks\n", totalTime, numberOfDisk);
        System.out.printf("Number of moves: %d\n", numMoves);
    }
    /**
     * The Method for test part 2
     */
    private static void test_part_2(){
        System.out.println("-----------------------PART_2-----------------------");
        System.out.println("-------------------PART_2_INTEGER-------------------");
        LinkedListRecursive<Integer> link = new LinkedListRecursive<>();
        link.add(23);
        link.add(34);
        link.add(67);
        link.add(50);
        link.add(67);
        link.add(67);
        link.add(67);
        link.add(67);
        link.add(67);
        link.add(67);
        link.add(67);
        link.add(67);
        link.add(22);
        link.add(67);
        link.add(67);
        link.add(11);
        link.add(67);
        link.add(67);
        
        System.out.println("Before removing!");
        System.out.println(link.toString());
        
        if(link.remove(67)){
            System.out.println("Remove all dublicates.");
        }
        
        System.out.println("After removing!\n\n");
        System.out.println(link.toString());
        System.out.println("-----------------PART_2_INTEGER_END-----------------");
        System.out.println("-------------------PART_2_STRING-------------------");
        LinkedListRecursive<String> link2 = new LinkedListRecursive<>();
        link2.add("ercan");
        link2.add("can");
        link2.add("sercan");
        link2.add("arif");
        link2.add("elif");
        link2.add("elif");
        link2.add("serdar");
        link2.add("elif");
        link2.add("Ayse");
        link2.add("elif");
        link2.add("elif");
        link2.add("Halis");
        link2.add("Yusuf");
        
        
        System.out.println("Before removing!");
        System.out.println(link2.toString());
        
        if(link2.remove("elif")){
            System.out.println("Remove all dublicates.");
        }
        
        System.out.println("After removing!\n\n");
        System.out.println(link2.toString());
        System.out.println("-----------------PART_2_STRING_END-----------------");
        System.out.println("-------------------PART_2_DOUBLE-------------------");
        LinkedListRecursive<Double> link3 = new LinkedListRecursive<>();
        link3.add(12.1);
        link3.add(12.3);
        link3.add(12.3);
        link3.add(12.7);
        link3.add(12.3);
        link3.add(12.5);
        link3.add(12.4);
        
        System.out.println("Before removing!");
        System.out.println(link3.toString());
        
        if(link3.remove(12.3)){
            System.out.println("Remove all dublicates.");
        }
        
        System.out.println("After removing!\n\n");
        System.out.println(link3.toString());
        System.out.println("-----------------PART_2_DOUBLE_END-----------------");
        System.out.println("---------------------PART_2_END---------------------");
    }
    /**
     * The method test for part 3, Intersection of lists
     */
    private static void test_part_3_Intersection(){
        System.out.println("-----------------------PART_3-----------------------");
        System.out.println("-----------------PART_3_Intersection----------------");
        System.out.println("-------------PART_3_Intersection_Integer------------");
        
        ArrayList<Integer> list1 = new ArrayList<>();
        ArrayList<Integer> list2 = new ArrayList<>();
        list1.add(1);
        list1.add(2);
        list1.add(3);
        list1.add(5);
        
        list2.add(1);
        list2.add(2);
        list2.add(88);
        list2.add(8);
        list2.add(3);
        list2.add(4);
        list2.add(0);
      
        Collections.sort(list1);
        Collections.sort(list2);
        ArrayListRecursive<Integer> arraylist =  new ArrayListRecursive(list1, list2);
        System.out.println(arraylist.toString());
        Collections.sort(arraylist.IntersectionOfLists());
        System.out.println("\n"+arraylist.IntersectionOfLists());
        System.out.println("---------PART_3_Intersection_Integer_END------------\n");
        
        System.out.println("---------PART_3_Intersection_STRING-----------------");
        ArrayList<String> list3 = new ArrayList<>();
        ArrayList<String> list4 = new ArrayList<>();
        list3.add("Ali");
        list3.add("Can");
        list3.add("ercan");
        list3.add("elif");
        
        list4.add("Ali");
        list4.add("Can");
        list4.add("elif");
        list4.add("sertap");
        list4.add("ercan");
        list4.add("kenan");
        list4.add("ahmet");
     
        Collections.sort(list3);
        Collections.sort(list4);
        
        ArrayListRecursive<String> arraylist2 =  new ArrayListRecursive(list3, list4);
        System.out.println(arraylist2.toString());
        Collections.sort(arraylist2.IntersectionOfLists());
        System.out.println("\n"+arraylist2.IntersectionOfLists());     
        System.out.println("---------PART_3_Intersection_String_END------------\n");
        
        System.out.println("---------PART_3_Intersection_DOUBLE-----------------");
        ArrayList<Double> list5 = new ArrayList<>();
        ArrayList<Double> list6 = new ArrayList<>();
        list5.add(1.5);
        list5.add(1.6);
        list5.add(1.9);
        list5.add(2.2);
        
        list6.add(1.5);
        list6.add(1.6);
        list6.add(99.99);
        list6.add(33.4);
        list6.add(1.9);
        list6.add(4.223);
        list6.add(0.1213);
     
        Collections.sort(list5);
        Collections.sort(list6);
        
        ArrayListRecursive<Double> arraylist3 =  new ArrayListRecursive(list5, list6);
        System.out.println(arraylist3.toString());
        Collections.sort(arraylist3.IntersectionOfLists());
        System.out.println("\n"+arraylist3.IntersectionOfLists());     
        System.out.println("---------PART_3_Intersection_DOUBLE_END------------");
        System.out.println("---------PART_3_Intersection_END------------------\n");

    }
    /**
     * The method test for part 3, Union of lists
     */
    private static void test_part_3_Union(){
        System.out.println("------------------PART_3_Union_List-----------------");
        System.out.println("--------------PART_3_Union_List_Integer-------------");
        
        ArrayList<Integer> list1 = new ArrayList<>();
        ArrayList<Integer> list2 = new ArrayList<>();
        list1.add(1);
        list1.add(2);
        list1.add(3);
        list1.add(5);
        
        list2.add(1);
        list2.add(2);
        list2.add(88);
        list2.add(8);
        list2.add(3);
        list2.add(4);
        list2.add(0);
      
        Collections.sort(list1);
        Collections.sort(list2);
        ArrayListRecursive<Integer> arraylist =  new ArrayListRecursive(list1, list2);
        System.out.println(arraylist.toString());
        Collections.sort(arraylist.UnionOfLists());
        System.out.println("\n"+arraylist.UnionOfLists());
        System.out.println("---------PART_3_Union_List_Integer_END--------------\n");
        
        System.out.println("---------PART_3_Union_List_STRING-----------------");
        ArrayList<String> list3 = new ArrayList<>();
        ArrayList<String> list4 = new ArrayList<>();
        list3.add("Ali");
        list3.add("Can");
        list3.add("ercan");
        list3.add("elif");
        
        list4.add("Ali");
        list4.add("Can");
        list4.add("elif");
        list4.add("sertap");
        list4.add("ercan");
        list4.add("kenan");
        list4.add("ahmet");
     
        Collections.sort(list3);
        Collections.sort(list4);
        
        ArrayListRecursive<String> arraylist2 =  new ArrayListRecursive(list3, list4);
        System.out.println(arraylist2.toString());
        Collections.sort(arraylist2.UnionOfLists());
        System.out.println("\n"+arraylist2.UnionOfLists());     
        System.out.println("---------PART_3_Union_List_String_END------------\n");
        
        System.out.println("---------PART_3_Union_List_DOUBLE-----------------");
        ArrayList<Double> list5 = new ArrayList<>();
        ArrayList<Double> list6 = new ArrayList<>();
        list5.add(1.5);
        list5.add(1.6);
        list5.add(1.9);
        list5.add(2.2);
        
        list6.add(1.5);
        list6.add(1.6);
        list6.add(99.99);
        list6.add(33.4);
        list6.add(1.9);
        list6.add(4.223);
        list6.add(0.1213);
     
        Collections.sort(list5);
        Collections.sort(list6);
        
        ArrayListRecursive<Double> arraylist3 =  new ArrayListRecursive(list5, list6);
        System.out.println(arraylist3.toString());
        Collections.sort(arraylist3.UnionOfLists());
        System.out.println("\n"+arraylist3.UnionOfLists());     
        System.out.println("---------PART_3_Union_List_DOUBLE_END---------------");
        System.out.println("---------PART_3_Union_List_END----------------------\n");
    }
    /**
     * The method test for part 3, Subset of lists 
     */
    private static void test_part_3_Subset(){
        System.out.println("-----------------PART_3_SubSet----------------------");
        System.out.println("-------------PART_3_SubSet_Integer------------------");
        
        ArrayList<Integer> list1 = new ArrayList<>();
        ArrayList<Integer> list2 = new ArrayList<>();
        list1.add(1);
        list1.add(2);
        list1.add(3);
        list1.add(5);
        
        list2.add(1);
        list2.add(2);
        list2.add(88);
        list2.add(8);
        list2.add(3);
        list2.add(4);
        list2.add(0);
      
        Collections.sort(list1);
        Collections.sort(list2);
        ArrayListRecursive<Integer> arraylist =  new ArrayListRecursive(list1, list2);
        System.out.println(arraylist.toString());
        System.out.println("List2 is subset of list1: "+arraylist.isSubSet());
        System.out.println("---------PART_3_SubSet_Integer_END------------------\n");
        
        System.out.println("---------PART_3_SubSet_STRING-----------------------");
        ArrayList<String> list3 = new ArrayList<>();
        ArrayList<String> list4 = new ArrayList<>();
        list3.add("Ali");
        list3.add("Can");
        list3.add("ercan");
        list3.add("elif");
        
        list4.add("Ali");
        list4.add("Can");
        list4.add("elif");
        list4.add("sertap");
        list4.add("ercan");
        list4.add("kenan");
        list4.add("ahmet");
     
        Collections.sort(list3);
        Collections.sort(list4);
        
        ArrayListRecursive<String> arraylist2 =  new ArrayListRecursive(list3, list4);
        System.out.println(arraylist2.toString());
        System.out.println("List2 is subset of list1: "+arraylist2.isSubSet());     
        System.out.println("---------PART_3_SubSet_String_END------------\n");
        
        System.out.println("---------PART_3_SubSet_DOUBLE-----------------");
        ArrayList<Double> list5 = new ArrayList<>();
        ArrayList<Double> list6 = new ArrayList<>();
        list5.add(1.5);
        list5.add(1.6);
        list5.add(1.9);
        list5.add(2.2);
        
        list6.add(1.5);
        list6.add(1.6);
        list6.add(99.99);
        list6.add(33.4);
        list6.add(1.9);
        list6.add(4.223);
        list6.add(0.1213);
     
        Collections.sort(list5);
        Collections.sort(list6);
        
        ArrayListRecursive<Double> arraylist3 =  new ArrayListRecursive(list5, list6);
        System.out.println("List2 is subset of list1: "+arraylist3.isSubSet());     
        System.out.println("-------------PART_3_SubSet_DOUBLE_END---------------");
        System.out.println("---------------PART_3_SubSet_END--------------------");
        System.out.println("-----------------PART_3_END-------------------------\n");
    }
}