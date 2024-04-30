package org.example;

public class BubbleSortDemo {

    public static void main(String[] args) {
        // Declaring and initializing the array to be sorted
        int[] numbers = {5, 2, 9, 1, 5, 6};

        System.out.println("Input array:");
        // Printing the initial unsorted array
        printArray(numbers);

        // Applying bubble sort on the array
        bubbleSort(numbers);

        System.out.println("\nSorted array:");
        // Printing the sorted array
        printArray(numbers);
    }

    // Implementing Bubble Sort algorithm
    public static void bubbleSort(int[] array) {
        int endIndex = array.length;
        boolean isSwapped;

        // We keep going through the array until no more swaps are needed
        do {
            isSwapped = false;

            for (int current = 1; current < endIndex; current++) {
                // If current element is greater than the next one, swap them
                if (array[current - 1] > array[current]) {
                    swap(array, current - 1, current);
                    isSwapped = true;
                }
            }
            // Reduce the size of unsorted part of the array
            endIndex--;
        } while (isSwapped);
    }

    // Swapping two elements in an array
    private static void swap(int[] array, int index1, int index2) {
        int temp = array[index1];       // Store the first value in a temporary variable
        array[index1] = array[index2];  // Assign the second value to the first
        array[index2] = temp;           // Assign the stored initial first value to the second
    }

    // Prints elements of an array
    private static void printArray(int[] array) {
        for (int number : array) {
            System.out.print(number + " ");
        }
    }
}
