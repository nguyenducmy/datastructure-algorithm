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
    public void testBubbleSort() {
        int[] input = {5, 4, 3, 2, 6, 2, 1};
        int[] actual = new SortUtilImplement().bubbleSort(input);
        int[] expected = {1,2,2,3,4,5,6};
        assertTrue(Arrays.equals(expected, actual));
    }
}
