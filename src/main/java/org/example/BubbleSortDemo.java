package org.example;

public class BubbleSortDemo {

    public static void main(String[] args) {
        int[] numbers = {5, 2, 9, 1, 5, 6};
        System.out.println("Input array:");
        printArray(numbers);

        bubbleSort(numbers);

        System.out.println("\nSorted array:");
        printArray(numbers);
    }

    public static void bubbleSort(int[] array) {
        int endIndex = array.length;
        boolean isSwapped;

        do {
            isSwapped = false;

            for (int current = 1; current < endIndex; current++) {
                if (array[current - 1] > array[current]) {
                    swap(array, current - 1, current);
                    isSwapped = true;
                }
            }
            endIndex--;
        } while (isSwapped);
    }

    private static void swap(int[] array, int index1, int index2) {
        int temp = array[index1];
        array[index1] = array[index2];
        array[index2] = temp;
    }

    private static void printArray(int[] array) {
        for (int number : array) {
            System.out.print(number + " ");
        }
    }
}
