package com.CourageKang.Tree;

import java.util.ArrayList;

/**
 * @author CourageKang
 * @data 2020/07/31 - 2:16
 * @Package com.CourageKang.Tree
 */

/*
二叉树的搜索区间
        给定两个值 k1 和 k2（k1 < k2）和一个二叉查找树的根节点。
        找到树中所有值在 k1 到 k2 范围内的节点。
        即打印所有x (k1 <= x <= k2) 其中 x 是二叉查找树的中的节点值。返回所有升序的节点值。
*/

public class SearchRange {

    public static ArrayList<Integer> result;

    public static ArrayList<Integer> searchRange(TreeNode root,int k1,int k2){
        result = new ArrayList<Integer>();
        searchHelper(root,k1,k2);
        return result;
    }

    public static void searchHelper(TreeNode root,int k1,int k2){
        if(root == null){
            return;
        }
        if(root.val>k1){
            searchHelper(root.left,k1,k2);
        }
        if(root.val>=k1&&root.val<=k2){
            result.add(root.val);
        }
        if(root.val<k2){
            searchHelper(root.right,k1,k2);
        }
    }
}
