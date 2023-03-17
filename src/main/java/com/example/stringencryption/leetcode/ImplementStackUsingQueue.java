package com.example.stringencryption.leetcode;

import java.util.LinkedList;
import java.util.Queue;

public class ImplementStackUsingQueue {

    public static void main(String[] args) {
        MyStack myStack=new MyStack();
        myStack.push(1);
        myStack.push(2);
        myStack.top();
        myStack.pop();
        System.out.println(myStack.empty());
//        myStack.empty();
    }
}

class MyStack {

    private Queue<Integer> queue = new LinkedList<>();

    public void push(int x) {
        queue.add(x);
        for(int i = 1;i<queue.size();i++) {
            queue.add(queue.remove());
        }
    }

    public int pop() {
        return queue.remove();
    }

    public int top() {
        return queue.peek();
    }

    public boolean empty() {
        return queue.isEmpty();
    }

    // public void push(int x) {

    // }
}