package com.CourageKang.Tree;

/**
 * @author CourageKang
 * @data 2020/07/30 - 3:15
 * @Package com.CourageKang.Tree
 */
public class TreeNode {
    public int val;
    //左孩子
    public TreeNode left;
    //右孩子
    public TreeNode right;

    public TreeNode(){
        this.val = 0;
        this.left = null;
        this.right = null;
    }

    public TreeNode(int val){
        this.val = val;
        this.left = null;
        this.right = null;
    }

    public TreeNode(int val,TreeNode left, TreeNode right){
        this.val = val;
        this.left = left;
        this.right = right;
    }
}




