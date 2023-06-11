package org.example;

import junit.framework.Assert;
import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;
import org.example.sortUtil.SortUtilImplement;

import java.util.Arrays;

/**
 * Unit test for simple App.
 */
public class AppTest extends TestCase {
    private static final SortUtilImplement sortUtilImplement = new SortUtilImplement();

    public void testBubbleSort() {
        int[] input = {5, 4, 3, 2, 6, 2, 1};
        int[] actual = sortUtilImplement.bubbleSort(input);
        Arrays.sort(input);
        int[] expected = {1,2,2,3,4,5,6};
        assertTrue(Arrays.equals(expected, actual));
    }
    public void testQuickSort(){
//        int[] input = {5, 4, 3, 2, 6, 2, 1};
        int[] input = {9, -3, 5, 2, 6, 8, -6, 1, 3};
        int[] actual = sortUtilImplement.quickSort(input, 0, input.length-1);
        int[] expected = {1,2,2,3,4,5,6};
        assertTrue(Arrays.equals(expected, actual));
    }
}
