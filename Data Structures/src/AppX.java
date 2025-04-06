
//import java.math.*;
package main;

import java.util.Arrays;

public class AppX {

    AppX() {
    }

    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");

        // Single Linked list ###############
        SinglyLinkedList s = new SinglyLinkedList();
        s.AppendNode(10);
        s.AppendNode(20);
        s.AppendNode(30);
        s.PrintNodes();
        s.DeleteLast();
        s.PrintNodes();


        // Doubly Linked list ###############
        DoublyLinkedList ds = new DoublyLinkedList();
        ds.AppendNode(10);
        ds.AppendNode(20);
        ds.AppendNode(30);
        ds.AppendNode(40);
        ds.DeleteNode(40);


        // Linear Search ###############
        int [] arr = new int[10000];
        for(int i = 0;i < 10000;i++)
        {
            arr[i] = (int)Math.random();
        }
        int numberToFind = 100;
        LinearSearch ls = new LinearSearch();
        if(ls.Search(arr, numberToFind) == true)
        {
            System.out.println("number found.");;
        }
        else
        {
            System.out.println("number not found");
        }


        // Binary Search ###############
        BinarySearch bs = new BinarySearch();
        int [] searchArray = {1,5,12,24,25,30,31,32,36,40,45,47,33};
        int toFind = 100;
        int result = bs.bSearch(searchArray, toFind, 0, searchArray.length - 1);
        if(result != -1)
        {
            System.out.println("number found at " + (result + 1));
        }
        else
        {
            System.out.println("number not found");
        }

        // Test performance between linear and binary search.
        // Create an array of a ten million values;
        int [] millionArray = new int[10000000];
        for(int i = 0;i < 10000000;i++)
        {
            // Can you tell me what is happening here ?
            // Or what I am trying to do here.
            millionArray[i] = (int)Math.random() % 100000;
        }

        numberToFind = 500000;
        
        // Do a linear search
        long startTime = System.nanoTime();
        if(ls.Search(millionArray, numberToFind) == true)
        {
            System.out.println("Linear search: number found.");
        }
        else
        {
            System.out.println("Linear search: number not found");
        }
        long endTime = System.nanoTime();
        System.out.println("time taken for linear searching "
            + (endTime - startTime) / 1000000 + "ms");


        // Do a sort and then binary search
        Arrays.sort(millionArray, 0, millionArray.length - 1);
        startTime = System.nanoTime();
        if(bs.bSearch(millionArray, numberToFind, 0, millionArray.length - 1) != -1)
        {
            System.out.println("Binary search: number found.");
        }
        else
        {
            System.out.println("Binary search: number not found");
        }
        endTime = System.nanoTime();
        System.out.println("time taken for binary searching "
            + (endTime - startTime) / 1000000 + "ms");

    }
}
