package com.CourageKang.Sort;

/**
 * @author CourageKang
 * @data 2020/07/29 - 22:04
 * @Package com.CourageKang.Sort
 */

/*
4.1 算法分析
        最佳情况：T(n) = O(nlog2 n)
        最坏情况：T(n) = O(nlog2 n)
        平均情况：T(n) =O(nlog2n)
*/

public class ShellSort {

    /**
     * 希尔排序
     *
     * @param array
     * @return
     */
    public static int[] shellSort(int[] array) {
        int len = array.length;
        int temp, gap = len / 2;
        while (gap > 0) {
            for (int i = gap; i < len; i++) {
                temp = array[i];
                int preIndex = i - gap;
                while (preIndex >= 0 && array[preIndex] > temp) {
                    array[preIndex + gap] = array[preIndex];
                    preIndex -= gap;
                }
                array[preIndex + gap] = temp;
            }
            gap /= 2;
        }
        return array;
    }
}
