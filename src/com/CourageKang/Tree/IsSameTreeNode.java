package com.CourageKang.Tree;

/**
 * @author CourageKang
 * @data 2020/07/31 - 1:31
 * @Package com.CourageKang.Tree
 */
//两个二叉树是否完全相同
public class IsSameTreeNode {

    public static boolean isSameTreeNode(TreeNode t1,TreeNode t2){
        if(t1==null&&t2==null){
            return true;
        }
        else if(t1==null||t2==null){
            return false;
        }
        if(t1.val != t2.val){
            return false;
        }
        boolean left = isSameTreeNode(t1.left,t2.left);
        boolean right = isSameTreeNode(t1.right,t2.right);
        return left&&right;

    }
}
