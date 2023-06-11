package org.example.sortUtil;

import java.util.ArrayList;
import java.util.List;

public class SortUtilImplement implements SortUtil {
    /**
     * BubbleSort : sorted by compare the next 2 values
     */
    @Override
    public int[] bubbleSort(int[] array) {
        for (int i = 0; i < array.length - 1; i++) {
            for (int j = 0; j < array.length - 1; j++) {
                if (array[j] >= array[j + 1]) {
                    var buff = array[j + 1];
                    array[j + 1] = array[j];
                    array[j] = buff;
                }
            }
        }
        return array;
    }
    @Override
    public int[] quickSort(int arr[], int begin, int end) {
        if (begin < end) {
            int partitionIndex = partition(arr, begin, end);

            quickSort(arr, begin, partitionIndex-1);
            quickSort(arr, partitionIndex+1, end);
        }
        return arr;
    }

    private int partition(int arr[], int begin, int end) {
        int pivot = arr[end];
        int i = (begin-1);

        for (int j = begin; j < end; j++) {
            if (arr[j] <= pivot) {
                i++;

                int swapTemp = arr[i];
                arr[i] = arr[j];
                arr[j] = swapTemp;
            }
        }

        int swapTemp = arr[i+1];
        arr[i+1] = arr[end];
        arr[end] = swapTemp;

        return i+1;
    }
}
