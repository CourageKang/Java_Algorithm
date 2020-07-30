package com.CourageKang.Tree;

/**
 * @author CourageKang
 * @data 2020/07/31 - 2:20
 * @Package com.CourageKang.Tree
 */

/*
不同的二叉树
        给出 n，问由 1...n 为节点组成的不同的二叉查找树有多少种？
*/

public class NumTrees {

    public static int numTrees(int n ){
        int[] counts = new int[n+2];
        counts[0] = 1;
        counts[1] = 1;
        for(int i = 2;i<=n;i++){
            for(int j = 0;j<i;j++){
                counts[i] += counts[j] * counts[i-j-1];
            }
        }
        return counts[n];
    }
}
