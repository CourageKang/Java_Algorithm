package com.CourageKang.Tree;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * @author CourageKang
 * @data 2020/07/31 - 1:34
 * @Package com.CourageKang.Tree
 */
public class IsMirrorTest {

    private static TreeNode myTreeNode1 = new TreeNode();
    private static TreeNode myTreeNode2 = new TreeNode();

    public void initTreeNode(){
        myTreeNode1.val = 1;
        myTreeNode1.left = new TreeNode(2,null,null);
        myTreeNode1.right = new TreeNode(3,null,null);
        myTreeNode1.left.left = new TreeNode(4,null,null);
        myTreeNode1.left.right = new TreeNode(5,null,null);
        myTreeNode1.right.right = new TreeNode(6,null,null);
        myTreeNode1.left.right.left = new TreeNode(7,null,null);

        myTreeNode2.val = 1;
        myTreeNode2.left = new TreeNode(2,null,null);
        myTreeNode2.right = new TreeNode(3,null,null);
        myTreeNode2.left.left = new TreeNode(4,null,null);
        myTreeNode2.left.right = new TreeNode(5,null,null);
        myTreeNode2.right.right = new TreeNode(6,null,null);
        myTreeNode2.left.right.left = new TreeNode(7,null,null);

    }

    @Test
    public void isMirror() {
        initTreeNode();
        System.out.println(IsMirror.isMirror(myTreeNode1,myTreeNode2));
    }
}