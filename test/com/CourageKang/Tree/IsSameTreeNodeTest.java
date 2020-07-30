package com.CourageKang.Tree;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * @author CourageKang
 * @data 2020/07/31 - 1:31
 * @Package com.CourageKang.Tree
 */
public class IsSameTreeNodeTest {

    private static TreeNode myTreeNode1 = new TreeNode();
    private static TreeNode myTreeNode2 = new TreeNode();
    private static TreeNode myTreeNode3 = new TreeNode();

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

        myTreeNode3.val = 3;
        myTreeNode3.left = new TreeNode(2,null,null);
        myTreeNode3.right = new TreeNode(3,null,null);
        myTreeNode3.left.left = new TreeNode(4,null,null);
        myTreeNode3.left.right = new TreeNode(5,null,null);
        myTreeNode3.right.right = new TreeNode(6,null,null);
        myTreeNode3.left.right.left = new TreeNode(7,null,null);
    }

    @Test
    public void isSameTreeNode() {
        initTreeNode();
        System.out.println(IsSameTreeNode.isSameTreeNode(myTreeNode1,myTreeNode2));
        System.out.println(IsSameTreeNode.isSameTreeNode(myTreeNode1,myTreeNode3));
    }
}