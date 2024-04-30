package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class BubbleSortDemoTest {

    @Test
    public void testBubbleSort_randomOrder() {
        int[] actualArray = {5, 2, 9, 1, 5, 6};
        int[] expectedArray = {1, 2, 5, 5, 6, 9};

        BubbleSortDemo.bubbleSort(actualArray);

        Assertions.assertArrayEquals(expectedArray, actualArray);
    }

    @Test
    public void testBubbleSort_alreadySorted() {
        int[] actualArray = {1, 2, 3, 4, 5, 6};
        int[] expectedArray = {1, 2, 3, 4, 5, 6};

        BubbleSortDemo.bubbleSort(actualArray);

        Assertions.assertArrayEquals(expectedArray, actualArray);
    }

    @Test
    public void testBubbleSort_reversedOrder() {
        int[] actualArray = {6, 5, 4, 3, 2, 1};
        int[] expectedArray = {1, 2, 3, 4, 5, 6};

        BubbleSortDemo.bubbleSort(actualArray);

        Assertions.assertArrayEquals(expectedArray, actualArray);
    }

    @Test
    public void testBubbleSort_singleElement() {
        int[] actualArray = {1};
        int[] expectedArray = {1};

        BubbleSortDemo.bubbleSort(actualArray);

        Assertions.assertArrayEquals(expectedArray, actualArray);
    }

    @Test
    public void testBubbleSort_emptyArray() {
        int[] actualArray = {};
        int[] expectedArray = {};

        BubbleSortDemo.bubbleSort(actualArray);

        Assertions.assertArrayEquals(expectedArray, actualArray);
    }
}