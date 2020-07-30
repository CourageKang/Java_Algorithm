package com.CourageKang.Tree;

/**
 * @author CourageKang
 * @data 2020/07/31 - 1:34
 * @Package com.CourageKang.Tree
 */
//两个二叉树是否互为镜像
public class IsMirror {

    public static boolean isMirror(TreeNode t1,TreeNode t2){
        if(t1==null&&t2==null){
            return true;
        }
        if(t1==null||t2==null){
            return false;
        }
        if(t1.val != t2.val){
            return false;
        }
        return isMirror(t1.left,t2.right)&&isMirror(t1.right,t2.left);

    }
}
