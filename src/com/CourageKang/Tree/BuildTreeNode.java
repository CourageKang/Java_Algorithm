package com.CourageKang.Tree;

/**
 * @author CourageKang
 * @data 2020/07/31 - 2:01
 * @Package com.CourageKang.Tree
 */
//前序遍历和后序遍历构造二叉树
public class BuildTreeNode {

    public static TreeNode buildTreeNode(int[] preorder,int[] inorder){
        if(preorder.length!=inorder.length){
            return null;
        }
        return myBuildTree(inorder,0,inorder.length-1,preorder,0,preorder.length-1);
    }

    public static TreeNode myBuildTree(int[] inorder,int instart,int inend,int[] preorder,int prestart,int preend){
        if(instart>inend){
            return null;
        }
        TreeNode root = new TreeNode(preorder[prestart]);
        int position = findPosition(inorder,instart,inend,preorder[start]);
        root.left = myBuildTree(inorder,instart,position-1,preorder,prestart+1,prestart+position-instart);
        root.right = myBuildTree(inorder,position+1,inend,preorder,position-inend+preend+1,preend);
        return root;
    }

    public static int findPosition(int[] arr,int start,int end,int key){
        int i;
        for(i = start;i<=end;i++){
            if(arr[i] == key){
                return i;
            }
        }
        return -1;
    }
}
