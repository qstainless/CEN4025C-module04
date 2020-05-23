package gce.module01;

import java.util.ArrayList;
import java.util.Hashtable;
import java.util.LinkedList;
import java.util.Random;

/**
 * This program implements an application that calls three different methods
 * that add 2 million random integers into an ArrayList, a LinkedList, and a
 * Hashtable, respectively. Each method will then delete each element
 * therefrom.
 * <p>
 * JProfiler was used to measure the performance of all three methods.
 * <p>
 * Course: CEN 4025C-33718 Software Development II
 * <p>
 * Instructor: Dr. Dhrgam AL Kafaf
 *
 * @author Guillermo Castaneda Echegaray
 * @version 1.0
 * @since 2020-05-14
 */
public class Main {

    /**
     * The Integer values to store in each list
     */
    static Integer randomInteger;

    /**
     * The random number array length.
     */
    static final int randomNumberArrayLength = 2000000;

    /**
     * The random number.
     */
    static final Random randomNumber = new Random();

    /**
     * The maximum value of the random numbers to generate.
     */
    static final int randomNumberMaxValue = 10;

    /**
     * Entry point of the application. Calls the three methods.
     *
     * @param args the input arguments
     */
    public static void main(String[] args) {

        processArrayList();

        processLinkedList();

        processHashTable();
    }

    /**
     * Method that adds and deletes 2 million integers to and from
     * an ArrayList.
     */
    public static void processArrayList() {
        ArrayList<Integer> arrayListValues = new ArrayList<>();

        // Add the random numbers to the ArrayList
        for (int i = 0; i < randomNumberArrayLength; i++){
            randomInteger = randomNumber.nextInt(randomNumberMaxValue) + 1;
            arrayListValues.add(randomInteger);
        }

        /*
         There are several ways to remove elements in an ArrayList. We could
         use the clear() or removeAll() methods, use an Iterator to remove
         elements staring with the first index (0), or use a simple while
         loop to remove them starting at the last element.
        */
        // Remove the numbers from the ArrayList
        while (!arrayListValues.isEmpty()) {
            arrayListValues.remove(arrayListValues.size() - 1);
        }
    }

    /**
     * Method that adds and deletes 2 million integers to and from
     * a LinkedList.
     */
    public static void processLinkedList() {
        LinkedList<Integer> linkedListValues = new LinkedList<>();

        // Add the random numbers to the LinkedList
        for (int i = 0; i < randomNumberArrayLength; i++){
            randomInteger = randomNumber.nextInt(randomNumberMaxValue) + 1;
            linkedListValues.add(randomInteger);
        }

        // Remove the numbers from the LinkedList
        while (!linkedListValues.isEmpty()) {
            linkedListValues.remove(linkedListValues.size() - 1);
        }
    }

    /**
     * Method that adds and deletes 2 million integers to and from
     * a Hashtable.
     */
    public static void processHashTable() {
        Hashtable<Integer, Integer> hashtablePairs = new Hashtable<>();

        // Add the random numbers to the Hashtable
        for (int i = 0; i < randomNumberArrayLength; i++){
            randomInteger = randomNumber.nextInt(randomNumberMaxValue) + 1;
            hashtablePairs.put(i, randomInteger);
        }

        // Remove the numbers from the Hashtable
        while (!hashtablePairs.isEmpty()) {
            hashtablePairs.remove(hashtablePairs.size() - 1);
        }
    }
}
