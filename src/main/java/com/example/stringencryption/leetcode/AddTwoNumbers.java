package com.example.stringencryption.leetcode;

public class AddTwoNumbers {


//    public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
//        new ListNode();
//
//        return ListNode;
//    }

    //    public static void main(String[] args) {
//        int[] arr = {2, 4, 3};
//        int[] arr1 = {5, 6, 4};
//
//        LinkedList l1 = new LinkedList();
//        l1.inse
//
//
//    }
    public static class Node {
        int data;
        Node next;

        Node(int x) {
            data = x;
            next = null;
        }
    }

    // A linked list class
    public static class LinkedList {

        // head and tail pointer of Node
        Node head = null;
        Node tail = null;

        // Non-parameterized constructor
        LinkedList() {
            head = tail = null;
        }

        // Copy constructor to copy the data
        // members of one list into another
        LinkedList(LinkedList list) {
            if (list.head == null) {
                head = tail = null;
                return;
            }

            // Make a Node pointer temp and
            // initialize it to the head of list
            Node temp = list.head;

            // This loop is creating the new
            // linked list by copying the
            // data of list
            while (temp != null) {
                Node newNode = new Node(temp.data);

                if (head == null) {
                    head = newNode;
                    tail = newNode;
                } else {
                    tail.next = newNode;
                    tail = newNode;
                }
                temp = temp.next;
            }
        }

        // This function insert create a node
        // with given value and inserts the
        // node at the end of linked list
        void insert(int x) {
            // Allocate the temp Node and
            // put x as data into it
            Node temp = new Node(x);

            // Check if the head is NULL
            if (head == null) {
                head = temp;
                return;
            } else {
                Node t = head;
                while (t.next != null) {
                    t = t.next;
                }
                t.next = temp;
            }
        }

        // This function prints contents of
        // linked list starting from head
        void print() {
            if (head == null) {
                System.out.println("List is empty");
                return;
            }
            Node temp = head;
            while (temp != null) {
                System.out.print(temp.data + " ");
                temp = temp.next;
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        // Creating object l1 of linked list
        LinkedList l1 = new LinkedList();
        LinkedList l2 = new LinkedList();

//        addTwoNumbers(new ListNode(0,0))

        int[] arr = {2, 4, 3};
        int[] arr1 = {5, 6, 4};

        StringBuilder stringBuilder = new StringBuilder();
        StringBuilder stringBuilder1 = new StringBuilder();

        for (int i = 0; i < arr.length; i++) {
            l1.insert(arr[i]);
            stringBuilder.append(arr[i]);
        }

        for (int j = 0; j < arr1.length; j++) {
            l2.insert(arr[j]);
            stringBuilder1.append(arr1[j]);
        }

        System.out.println(Integer.valueOf(stringBuilder1.toString()));
        System.out.println(Integer.valueOf(stringBuilder.toString()) + Integer.valueOf(stringBuilder1.toString()));

    }

    public static class ListNode {
        int val;
        ListNode next;

        ListNode() {
        }

        ListNode(int val) {
            this.val = val;
        }

        ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }
    }

    public static ListNode addTwoNumbers(ListNode list1,ListNode list2){

        ListNode listNode=new ListNode();
        ListNode temp = listNode;
        int carry=0;

        while(list1!=null || list2!=null || carry!=0){
            int sum=0;
            if(list1!=null){
                sum+=list1.val;
                list1 = list1.next;
            }
            if(list2!=null){
                sum+=list2.val;
                list2 = list2.next;
            }
            sum+=carry;  //adding carry to the sum
            carry=sum/10;  //getting carry by sum, for 16 it will be 1

            ListNode ll = new ListNode(sum%10);  //adding leftover after taking carry in the new linked list, i.e from 16, 6 will be added in the linked list
            temp.next = ll;  //increasing the pointer of address so as to store the data
            temp = temp.next;  //continuing the iteration
        }

        return listNode.next;
    }
}
