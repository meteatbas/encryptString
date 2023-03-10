package com.example.stringencryption.leetcode;

import java.util.HashSet;
import java.util.Set;

public class HappyNumber {
    public static void main(String[] args) {
        System.out.println(isHappyd(82));
    }

    public static boolean isHappy(int n) {


        if (n == 1 || n == 7)
            return true;
        int sum = n, x = n;

        while (sum > 9) {
            sum = 0;

            while (x > 0) {
                int d = x % 10;
                sum += d * d;
                x /= 10;
            }
            if (sum==1)
                return true;

            x=sum;
        }
        if (sum == 7)
            return true;
        return false;

    }

    public static boolean isHappyd(int n) {
        Set<Integer> set = new HashSet<Integer>();
        while(n!=1 && !set.contains(n)){
            set.add(n);
            n=getNext(n);
        }
        return n==1;
    }
    public static int getNext(int n){
        int sum=0;
        while(n>0){
            int d = n%10;
            sum+=d*d;
            n=n/10;
        }
        return sum;
    }
}
