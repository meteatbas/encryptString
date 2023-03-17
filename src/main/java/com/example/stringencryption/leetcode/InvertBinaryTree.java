package com.example.stringencryption.leetcode;

import javax.swing.tree.TreeNode;

public class InvertBinaryTree {
    public static void main(String[] args) {
        Nodee root = new Nodee(1);
        root.left = new Nodee(2);
        root.right = new Nodee(3);
        root.left.left = new Nodee(4);
        root.left.right = new Nodee(5);
        root.right.left = new Nodee(6);
        root.right.right = new Nodee(7);

    }

    public static TreeNode invertTree(TreeNode root) {
        if(root == null) return root;
        TreeNode node = root.left;
        root.left = invertTree(root.right);
        root.right = invertTree(node);
        return root;

    }

    public static void swap(Nodee root) {
        if (root == null) {
            return;
        }

        Nodee temp = root.left;
        root.left = root.right;
        root.right = temp;
    }

    public static void preorder(Nodee root) {
        if (root == null) {
            return;
        }

        System.out.print(root.data + " ");
        preorder(root.left);
        preorder(root.right);
    }


}

class Nodee {
    int data;
    Nodee left = null, right = null;

    Nodee(int data) {
        this.data = data;
    }
}
