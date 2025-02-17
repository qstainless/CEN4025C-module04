# Add and remove integers from collections

## Overview
This exercise attempts to implement an application that adds and removes 2 million random integers from collections.

## What does this program do?
The program calls three methods that will add and remove 2 million random integers from an ArryList, a LinkedList, and a Hashtable, respecitvely. JProfiler is used to measure each methods performance.

## Code design
There are several ways to add and remove elements from a collection. Adding elements is rather straightforward. For this exercise, an indexed for loop is used in each method to keep the process consistent. 

Removing the elements is another issue, altogether. The collections have their own methods for clearing all elements therein. In this exercise, we are not using those methods for purposes of profiling the performance of other methods. Looping through the collections and removing the first index proved to be too time consuming (for 2 million elements, in excess of 6 hours). The main reason is that when the first index is removed from a collection, all remaining elements are reassigned to start at index 0. Even though removal speed increases as the number of elements in the collection is reduced, investing time and effort in profiling that process is moot. 

Insted of using the built-in methods to remove all elements at once, I implemented a while loop to remove the last element of the collection until the collection is empty. With this method, there is no need to reallocate the lists' elements to the first index. While the process was almost instantaneous, considering the removal of 2 million elements, it was long enough to measure its performance using JProfiler.

## System requirements
The program is a Java application using version 11 of Amazon's distribution of the Open Java Development Kit (OpenJDK) [Corretto 11](https://aws.amazon.com/corretto/).

While the program does not require JProfile to run, JProfiler was used to measure performance and ideentify hotspots.

## How to use this program.
No user interaction needed. The program simply adds and removes the 2 million elements to the cpllections, without providing feedback so as to avoid a potential impact in performance profiling.

## Profiling results
From a sample of five tests, the method with the longest run time is `processHashTable()`.

## Installation.
Clone the repo, import it into your favorite Java IDE, and run Main.

## Known Issues
None at this time
