package com.nighthawk.spring_portfolio.mvc.sorting;
import java.util.Arrays;

public class SortingAlgorithm {
    
    public static void insertionSort(int[] array) {
        int n = array.length;
        for (int i = 1; i < n; ++i) {
            int key = array[i];
            int j = i - 1;

            while (j >= 0 && array[j] > key) {
                array[j + 1] = array[j];
                j = j - 1;
            }
            array[j + 1] = key;
        }
    }

    public static void bubbleSort(int[] array) {
        int n = array.length;
        for (int i = 0; i < n-1; i++) {
            for (int j = 0; j < n-i-1; j++) {
                if (array[j] > array[j+1]) {
                    int temp = array[j];
                    array[j] = array[j+1];
                    array[j+1] = temp;
                }
            }
        }
    }

    public static void mergeSort(int[] array) {
        if (array.length > 1) {
            int mid = array.length / 2;

            int[] left = new int[mid];
            int[] right = new int[array.length - mid];

            System.arraycopy(array, 0, left, 0, left.length);
            System.arraycopy(array, mid, right, 0, right.length);

            mergeSort(left);
            mergeSort(right);

            merge(array, left, right);
        }
    }

    private static void merge(int[] array, int[] left, int[] right) {
        int i = 0, j = 0, k = 0;

        while (i < left.length && j < right.length) {
            if (left[i] <= right[j]) {
                array[k++] = left[i++];
            } else {
                array[k++] = right[j++];
            }
        }

        while (i < left.length) {
            array[k++] = left[i++];
        }

        while (j < right.length) {
            array[k++] = right[j++];
        }
    }

    public static void analyzeSortingAlgorithms() {
        int[] arraySizes = {10, 100, 1000, 10000};

        System.out.println("Array Size\tInsertion Sort\tBubble Sort\tMerge Sort");

        for (int size : arraySizes) {
            int[] randomArray = generateRandomArray(size);

            long insertionSortTime = measureExecutionTime(() -> insertionSort(Arrays.copyOf(randomArray, randomArray.length)));
            long bubbleSortTime = measureExecutionTime(() -> bubbleSort(Arrays.copyOf(randomArray, randomArray.length)));
            long mergeSortTime = measureExecutionTime(() -> mergeSort(Arrays.copyOf(randomArray, randomArray.length)));

            System.out.printf("%d\t\t%d\t\t%d\t\t%d%n", size, insertionSortTime, bubbleSortTime, mergeSortTime);
        }
    }

    private static int[] generateRandomArray(int size) {
        int[] array = new int[size];
        for (int i = 0; i < size; i++) {
            array[i] = (int) (Math.random() * 1000);
        }
        return array;
    }

    private static long measureExecutionTime(Runnable method) {
        long startTime = System.nanoTime();
        method.run();
        long endTime = System.nanoTime();
        return endTime - startTime;
    }
}