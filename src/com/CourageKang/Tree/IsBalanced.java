package com.CourageKang.Tree;

/**
 * @author CourageKang
 * @data 2020/07/30 - 23:16
 * @Package com.CourageKang.Tree
 */
//判断二叉树是否是平衡二叉树
public class IsBalanced {
    public static boolean isBalanced(TreeNode node){
        return maxDepth2(node)!=-1;
    }
    public static int maxDepth2(TreeNode node){
        if(node == null){
            return 0;
        }
        int left = maxDepth2(node.left);
        int right = maxDepth2(node.right);
        if(left==-1||right==-1||Math.abs(left-right)>1){
            return -1;
        }
        return Math.max(left, right) + 1;
    }
}
