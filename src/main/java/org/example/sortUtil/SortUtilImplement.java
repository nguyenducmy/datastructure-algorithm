package org.example.sortUtil;

import java.util.ArrayList;
import java.util.List;

public class SortUtilImplement implements SortUtil {
    /**
    *   BubbleSort : sorted by compare the next 2 values
    */
    @Override
    public int[] bubbleSort(int[] array) {
        for (int i = 0; i < array.length-1; i++) {
            for (int j = 0; j < array.length-1; j++) {
                if(array[j] >= array[j+1]){
                    var buff = array[j+1];
                    array[j+1] = array[j];
                    array[j] = buff;
                }
            }
        }
        return array;
    }

    @Override
    public int[] quickSort(int[] array) {
        return new int[0];
    }
}
