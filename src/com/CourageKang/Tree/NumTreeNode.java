package com.CourageKang.Tree;

/**
 * @author CourageKang
 * @data 2020/07/30 - 6:12
 * @Package com.CourageKang.Tree
 */
//求二叉树中节点的个数
public class NumTreeNode {
    public static int numTreeNode(TreeNode root){
        if(root == null){
            return 0;
        }
        int left = numTreeNode(root.left);
        int right = numTreeNode(root.right);
        return left + right + 1;
    }
}
