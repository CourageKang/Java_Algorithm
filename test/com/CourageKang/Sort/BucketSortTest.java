package com.CourageKang.Sort;

import org.junit.Test;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;

import static org.junit.Assert.*;

/**
 * @author CourageKang
 * @data 2020/07/29 - 22:35
 * @Package com.CourageKang.Sort
 */
public class BucketSortTest {

    @Test
    public void bucketSort() {
        ArrayList<Integer> nArray = new ArrayList<>(Arrays.asList(2, 4, 6, 9, 5, 3, 1));
        ArrayList<Integer> nResult = BucketSort.bucketSort(nArray,5);
        for (int nElement:nResult) {
            System.out.println(nElement);
        }
    }
}