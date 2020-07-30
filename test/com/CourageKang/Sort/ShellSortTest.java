package com.CourageKang.Sort;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * @author CourageKang
 * @data 2020/07/29 - 22:05
 * @Package com.CourageKang.Sort
 */
public class ShellSortTest {

    @Test
    public void shellSortTest() {
        int[] nArray = {2,4,6,9,5,3,1};
        int[] nResult = ShellSort.shellSort(nArray);
        for (int nElement:nResult) {
            System.out.println(nElement);
        }
    }
}