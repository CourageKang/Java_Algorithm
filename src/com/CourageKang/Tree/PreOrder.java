package com.CourageKang.Tree;

import java.util.ArrayList;
import java.util.Stack;

/**
 * @author CourageKang
 * @data 2020/07/31 - 1:58
 * @Package com.CourageKang.Tree
 */
//二叉树的前序遍历
public class PreOrder {

    public static ArrayList<Integer> preOrder(TreeNode root){
        Stack<TreeNode> stack = new Stack<TreeNode>();
        ArrayList<Integer> list = new ArrayList<Integer>();
        if(root == null){
            return list;
        }
        stack.push(root);
        while(!stack.empty()){
            TreeNode node = stack.pop();
            list.add(node.val);
            if(node.right!=null){
                stack.push(node.right);
            }
            if(node.left != null){
                stack.push(node.left);
            }

        }
        return list;
    }

    public static ArrayList<Integer> preOrderReverse(TreeNode root){
        ArrayList<Integer> result = new ArrayList<Integer>();
        preOrder2(root,result);
        return result;

    }

    public static void preOrder2(TreeNode root,ArrayList<Integer> result){
        if(root == null){
            return;
        }
        result.add(root.val);
        preOrder2(root.left,result);
        preOrder2(root.right,result);
    }
}
