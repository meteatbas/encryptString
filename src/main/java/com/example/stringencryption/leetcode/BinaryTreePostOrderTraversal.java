//package com.example.stringencryption.leetcode;
//
//import javax.swing.tree.TreeNode;
//import java.util.LinkedList;
//import java.util.List;
//import java.util.Stack;
//
//public class BinaryTreePostOrderTraversal {
//    public static void main(String[] args) {
//        TreeNode p = new TreeNode(1, left: new TreeNode(val:2));
//
//        postorderTraversal(root);
//    }
//
//    public static List<Integer> postorderTraversal(TreeNode root) {
//        LinkedList<Integer> ans = new LinkedList<>();
//        Stack<TreeNode> stack = new Stack<>();
//        if (root == null) return ans;
//
//        stack.push(root);
//        while (!stack.isEmpty()) {
//            TreeNode cur = stack.pop();
//            ans.addFirst(cur.val);
//            if (cur.left != null) {
//                stack.push(cur.left);
//            }
//            if (cur.right != null) {
//                stack.push(cur.right);
//            }
//        }
//        return ans;
//    }
//
//    static class Node {
//        String value;
//        Node left, right;
//
//        public Node(String value) {
//            this.value = value;
//        }
//    }
//}
