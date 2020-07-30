package com.CourageKang.Sort;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * @author CourageKang
 * @data 2020/07/29 - 21:59
 * @Package com.CourageKang.Sort
 */
public class InsertionSortTest {

    @Test
    public void insertionSortTest() {
        int[] nArray = {2,4,6,9,5,3,1};
        int[] nResult = InsertionSort.insertionSort(nArray);
        for (int nElement:nResult) {
            System.out.println(nElement);
        }
    }
}