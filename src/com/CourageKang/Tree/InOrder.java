package com.CourageKang.Tree;

import java.util.ArrayList;
import java.util.Stack;

/**
 * @author CourageKang
 * @data 2020/07/31 - 1:59
 * @Package com.CourageKang.Tree
 */
//二叉树的中序遍历
public class InOrder {

    public static ArrayList<Integer> inOrder(TreeNode root){
        ArrayList<Integer> list = new ArrayList<Integer>();
        Stack<TreeNode> stack = new Stack<TreeNode>();
        TreeNode current = root;
        while(current != null|| !stack.empty()){
            while(current != null){
                stack.add(current);
                current = current.left;
            }
            current = stack.peek();
            stack.pop();
            list.add(current.val);
            current = current.right;

        }
        return list;

    }
}
