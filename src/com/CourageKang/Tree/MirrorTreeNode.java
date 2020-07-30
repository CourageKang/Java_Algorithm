package com.CourageKang.Tree;

/**
 * @author CourageKang
 * @data 2020/07/31 - 1:37
 * @Package com.CourageKang.Tree
 */
//翻转二叉树or镜像二叉树
public class MirrorTreeNode {

    public static TreeNode mirrorTreeNode(TreeNode root){
        if(root == null){
            return null;
        }
        TreeNode left = mirrorTreeNode(root.left);
        TreeNode right = mirrorTreeNode(root.right);
        root.left = right;
        root.right = left;
        return root;
    }
}
