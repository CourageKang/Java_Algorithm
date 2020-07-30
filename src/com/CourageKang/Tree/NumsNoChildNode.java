package com.CourageKang.Tree;

/**
 * @author CourageKang
 * @data 2020/07/30 - 22:52
 * @Package com.CourageKang.Tree
 */
//求二叉树中叶子节点的个数
public class NumsNoChildNode {

    public static int numsNoChildNode(TreeNode root){
        if(root == null){
            return 0;
        }
        if(root.left==null&&root.right==null){
            return 1;
        }
        return numsNoChildNode(root.left)+numsNoChildNode(root.right);
    }
}
