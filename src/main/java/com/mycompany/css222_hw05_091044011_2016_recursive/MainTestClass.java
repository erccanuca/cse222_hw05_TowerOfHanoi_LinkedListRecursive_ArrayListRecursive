/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.css222_hw05_091044011_2016_recursive;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author ercan
 */
public class MainTestClass {

    public static void main(String[] args) {
        
        /*----------------------PART 1----------------*/
        //Scanner input = new Scanner(System.in);
       // System.out.print("Please input number of rings: ");
      //  int numberOfDisk = input.nextInt();

       /* int[][] pegs = new int[3][numberOfDisk];
        int[] pegA = new int[3];
        int[] pegB = new int[3];*/
       // towerOfHanoiIteratively(pegs, pegA, pegB, numberOfDisk);
        
       /*-----------------------PART 2-----------------*/
        LinkedListRecursive link = new LinkedListRecursive<Integer>();
        
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
        
        
        /*---------------PART 3----------------------*/
        ArrayList<Integer> list1 = new ArrayList<Integer>();
        ArrayList<Integer> list2 = new ArrayList<Integer>();
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
        //Collections.sort(arraylist.isSubSet());
        System.out.println("\n\n"+arraylist.UnionOfLists());
                
        

    }

    public static void towerOfHanoiIteratively(int pegs[][], int pegA[], int pegB[], int numberOfDisk) {

        int numMoves = 0;
        int cyclemove = 0;
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

}
