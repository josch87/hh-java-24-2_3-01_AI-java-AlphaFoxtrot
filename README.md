# BubbleSortDemo

The `BubbleSortDemo` class demonstrates the Bubble Sort algorithm in action by initialising an integer array, performing
the bubble sort operation, and then printing out the sorted array.

## Features

- **Bubble Sort Implementation**: The main feature of the BubbleSortDemo class. It sorts an array of integers using the
  Bubble Sort algorithm.

- **Array Swapping**: The swap function is used to interchange the position of two elements in an array.

- **Array Printing**: The printArray function prints each element of the array.

## Usage

```Java
int[] numbers = {5, 2, 9, 1, 5, 6};
BubbleSortDemo.

printArray(numbers);
BubbleSortDemo.

bubbleSort(numbers);
BubbleSortDemo.

printArray(numbers);
```

Above is the code snippet to declare an array, print the array, sort it, and then print the sorted array.

## Methods

### bubbleSort(int[] array)

This method implements the Bubble Sort algorithm on a given array. It continues to swap adjacent elements if they are in
the wrong order.

### swap(int[] array, int index1, int index2)

This method swaps the positions of two elements in the given array.

### printArray(int[] array)

This method iterates through the array and prints each element.