package com.example.stringencryption.leetcode;

import java.util.Stack;

public class validParantheses {
    public static void main(String[] args) {
        System.out.println(isValid(")("));
    }

    public static boolean isValid(String str){
        Stack<Character> stack=new Stack<>();
        for (char c:str.toCharArray()){
            if (c=='(')
                stack.push(')');
            else if(c=='{')
                stack.push('}');
            else if(c=='[')
                stack.push(']');
            else if (stack.isEmpty() || stack.pop() != c)
                return false;
        }

        return stack.isEmpty();
    }
}
