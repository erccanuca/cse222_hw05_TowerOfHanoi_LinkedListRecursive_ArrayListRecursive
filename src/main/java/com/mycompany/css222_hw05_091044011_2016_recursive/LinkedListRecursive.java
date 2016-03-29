/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.css222_hw05_091044011_2016_recursive;

/**
 * A recursive linked list with recursive methods
 *
 * @author ercan
 * @param <E> generic type
 */
public class LinkedListRecursive<E> {

    /**
     * The list head
     */
    private Node<E> head;

    /**
     * Inner Node Class
     *
     * @param <E> generic type
     */
    private class Node<E> {

        /**
         * E type data
         */
        private E data;
        /**
         * node next element referance
         */
        private Node<E> next;

        /**
         * Node Default Constructor 
         * @param theData firt data of Node Class
         */
        public Node(E theData) {
            data = theData;
            next = null;
        }

        /**
         * Node Class Contructor with Node referance
         * @param theData first data
         * @param nodeRef next node referance
         */
        public Node(E theData, Node<E> nodeRef) {
            data = theData;
            next = nodeRef;
        }

    } // inner class end

    /**
     * Find size of a list.
     * @param head The head of current list.
     * @return The size of current list.
     */
    private int size(Node<E> head) {
        if (head == null) {
            return 0;
        }
        return 1 + size(head.next);
    }

    /**
     * Wrapper method for find size of a list.
     * @return The size of list.
     */
    public int size() {
        return size(head);
    }

    /**
     * Adds a new node to the end of a list.
     * @param head The head of the current list.
     * @param newValue The data for the new node.
     */
    private void add(Node<E> head, E newValue) {
        if (head.next == null) {
            head.next = new Node<>(newValue);
        } else {
            add(head.next, newValue);
        }
    }
    /**
     * Wrapper method for adding a new node
     * to the end of a list.
     * @param newValue The data for the new node.
     */
    public void add(E newValue) {
        if (head == null) {
            head = new Node<>(newValue);
        } else {
            add(head, newValue);
        }

    }

    /**
     * Removes all duplicate elements from a list. 
     * @post The first occurrence of
     * outData is removed and continue list for remove.
     * @param head The head of the current list.
     * @param prev The predecessor of the list head.
     * @param outData The data to be removed.
     * @return true if the all same item is removed, and false otherwise.
     */
    private boolean remove(Node<E> head, Node<E> prev, E outData) {
        if (head == null) { // if list empty
            return false;
        } else if (head.data.equals(outData)) { // if found remove it.
            prev.next = head.next; // removed
            if (head.next == null) // after removed and end list
            {
                return true;       // return true.
            }
            return remove(head.next, prev, outData); // non end of list.
        } else {
            return remove(head.next, head, outData); // not found continue.
        }
    }

    /**
     * Wrapper method for removing all duplicate nodes (in LinkedListRecursive).
     * Post: The first occurrence of outData is removed and continue list for remove.
     * @param outData The data to be removed.
     * @return true if the all same item is removed, and false otherwise.
     */
    public boolean remove(E outData) {
        if (head == null) { // if list empty
            return false;
        } else if (head.data.equals(outData)) { // if first element is to be removing element
            head = head.next; // remove
            return remove(head.next, head, outData); // and continue
        } else {
            return remove(head.next, head, outData); // if element not found,
            // call next for removing.
        }
    }

    /**
     * Returns the string representation of a list.
     * @param head The head of the current list.
     * @return The state of the current list.
     */
    private String toString(Node<E> head) {
        if (head == null) {
            return "";
        } else {
            return head.data + "\n" + toString(head.next);
        }
    }

    /**
     * Wrapper merhod for returning the string representation of a list.
     * @return The string representatin of a list.
     */
    @Override
    public String toString() {
        return toString(head);
    }

}
