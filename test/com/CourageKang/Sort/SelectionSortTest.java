package com.CourageKang.Sort;

import org.junit.Test;

/**
 * @author CourageKang
 * @data 2020/07/29 - 18:16
 * @Package com.CourageKang.Sort
 */
public class SelectionSortTest {

    @Test
    public void selectionSortTest() {
        int[] nArray = {12,4,6,9,5,3,1};
        int[] nResult = SelectionSort.selectionSort(nArray);
        for (int nElement:nResult) {
            System.out.println(nElement);
        }
    }
}