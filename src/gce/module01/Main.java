package gce.module01;

import java.util.ArrayList;
import java.util.Random;

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

    public static void main(String[] args) {

        processArrayList();

        processLinkedList();

        processHashTable();
    }

    public static void processArrayList() {
        ArrayList<Integer> arrayListValues = new ArrayList<>();

        // Add the random numbers to the ArrayList
        for (int i = 0; i < randomNumberArrayLength; i++){
            randomInteger = randomNumber.nextInt(randomNumberMaxValue) + 1;
            arrayListValues.add(randomInteger);
        }

        System.out.println("Done adding.");

        /*
         There are several ways to remove elements in an ArrayList. We could
         use the clear() or removeAll() methods, use an Iterator to remove
         elements staring with the first index (0), or use a simple while
         loop to remove them starting at the last element.
        */
        while (!arrayListValues.isEmpty()) {
            arrayListValues.remove(arrayListValues.size() - 1);
        }

        System.out.println("Done removing.");
    }

    public static void processLinkedList() {
    }

    public static void processHashTable() {
    }
}
