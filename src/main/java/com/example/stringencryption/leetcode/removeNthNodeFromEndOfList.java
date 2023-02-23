//package com.example.stringencryption.leetcode;
//
//public class removeNthNodeFromEndOfList {
//    public static void main(String[] args) {
//        ListNode dd =new ListNode();
//        dd.val=4;
//        removeNthFromEnd(0,1);
//    }
//
//    public static ListNode removeNthFromEnd(ListNode head, int n) {
//        if (head == null || head.next == null) return null;
//        ListNode start = new ListNode();
//        start.next = head;
//        ListNode fast = start, slow = start;
//        for (int i = 1; i <= n; i++) {
//            fast = fast.next;
//        }
//        while (fast.next != null) {
//            fast = fast.next;
//            slow = slow.next;
//        }
//        slow.next = slow.next.next;
//        return start.next;
//    }
//
//    public ListNode removeNthFromEndd(ListNode head, int n) {
//        ListNode pointer = head;
//        if (pointer == null || pointer.next == null) return null;
//
//        int position = 1;
//        while (pointer.next != null) {
//            pointer = pointer.next;
//            position++;
//        }
//        if (position == n) return head.next;
//
//        ListNode prev = null;
//        pointer = head;
//        for (int i = 0; i < position - n; i++) {
//            prev = pointer;
//            pointer = pointer.next;
//        }
//        prev.next = pointer.next;
//        return head;
//    }
//
//    public static class ListNode {
//        int val;
//        ListNode next;
//
//        ListNode() {
//        }
//
//        ListNode(int val) {
//            this.val = val;
//        }
//
//        ListNode(int val, ListNode next) {
//            this.val = val;
//            this.next = next;
//        }
//    }
//
//}
