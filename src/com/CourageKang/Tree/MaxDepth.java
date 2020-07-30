package com.CourageKang.Tree;

/**
 * @author CourageKang
 * @data 2020/07/30 - 3:14
 * @Package com.CourageKang.Tree
 */
//求二叉树的最大深度
public class MaxDepth {
    public static int maxDepth(TreeNode node){
        if(node==null){
            return 0;
        }
        int left = maxDepth(node.left);
        int right = maxDepth(node.right);
        return Math.max(left,right) + 1;
    }
}
