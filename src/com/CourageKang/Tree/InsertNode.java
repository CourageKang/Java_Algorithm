package com.CourageKang.Tree;

/**
 * @author CourageKang
 * @data 2020/07/31 - 2:13
 * @Package com.CourageKang.Tree
 */
//在二叉树中插入节点
public class InsertNode {

    public static TreeNode insertNode(TreeNode root,TreeNode node){
        if(root == node){
            return node;
        }
        TreeNode tmp = new TreeNode();
        tmp = root;
        TreeNode last = null;
        while(tmp!=null){
            last = tmp;
            if(tmp.val>node.val){
                tmp = tmp.left;
            }else{
                tmp = tmp.right;
            }
        }
        if(last!=null){
            if(last.val>node.val){
                last.left = node;
            }else{
                last.right = node;
            }
        }
        return root;
    }
}
