package com.CourageKang.Sort;

import org.junit.Test;

import static com.CourageKang.Sort.BubbleSort.bubbleSort;

/**
 * @author CourageKang
 * @data 2020/07/29 - 17:33
 * @Package com.CourageKang.Sort
 */
public class BubbleSortTest {

    @Test
    public void bubbleSortTest(){
        int[] nArray = {2,4,6,9,5,3,1};
        int[] nResult = BubbleSort.bubbleSort(nArray);
        for (int nElement:nResult) {
            System.out.println(nElement);
        }
    }

}
