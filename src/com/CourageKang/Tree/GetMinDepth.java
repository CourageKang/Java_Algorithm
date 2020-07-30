package com.CourageKang.Tree;

/**
 * @author CourageKang
 * @data 2020/07/30 - 6:05
 * @Package com.CourageKang.Tree
 */
//求二叉树的最小深度
public class GetMinDepth {
    public static int getMinDepth(TreeNode root){
        if(root == null){
            return 0;
        }
        return getMin(root);
    }
    public static int getMin(TreeNode root){
        if(root == null){
            return Integer.MAX_VALUE;
        }
        if(root.left == null&&root.right == null){
            return 1;
        }
        return Math.min(getMin(root.left),getMin(root.right)) + 1;
    }
}
