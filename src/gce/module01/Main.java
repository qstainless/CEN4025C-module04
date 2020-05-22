package gce.module01;

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
    }

    public static void processLinkedList() {
    }

    public static void processHashTable() {
    }
}
