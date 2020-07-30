package com.CourageKang.Sort;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * @author CourageKang
 * @data 2020/07/29 - 22:14
 * @Package com.CourageKang.Sort
 */
public class QuickSortTest {

    @Test
    public void quickSortTest() {
        int[] nArray = {2,4,6,9,5,3,1};
        int[] nResult = QuickSort.quickSort(nArray,0,nArray.length-1);
        for (int nElement:nResult) {
            System.out.println(nElement);
        }
    }
}