package com.CourageKang.Tree;

import java.util.ArrayList;

/**
 * @author CourageKang
 * @data 2020/07/31 - 2:01
 * @Package com.CourageKang.Tree
 */
//二叉树的后序遍历
public class PostOrder {

    public static ArrayList<Integer> postOrder(TreeNode root){
        ArrayList<Integer> list = new ArrayList<Integer>();
        if(root == null){
            return list;
        }
        list.addAll(postOrder(root.left));
        list.addAll(postOrder(root.right));
        list.add(root.val);
        return list;
    }
}
