package com.CourageKang.Tree;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * @author CourageKang
 * @data 2020/07/30 - 6:13
 * @Package com.CourageKang.Tree
 */
public class NumTreeNodeTest {

    private static TreeNode myTreeNode = new TreeNode();

    public void initTreeNode(){
        myTreeNode.val = 1;
        myTreeNode.left = new TreeNode(2,null,null);
        myTreeNode.right = new TreeNode(3,null,null);
        myTreeNode.left.left = new TreeNode(4,null,null);
        myTreeNode.left.right = new TreeNode(5,null,null);
        myTreeNode.right.right = new TreeNode(6,null,null);
        myTreeNode.left.right.left = new TreeNode(7,null,null);
    }

    @Test
    public void numTreeNode() {
        initTreeNode();
        System.out.println(NumTreeNode.numTreeNode(myTreeNode));
    }
}