package com.company;

import java.util.Arrays;

public class ArrayStack {
    private Integer[] stack;
    private int count;


    public ArrayStack(int length) {
        stack = new Integer[length];
    }

    public boolean isEmpty() {
        if (stack[0] == null) return true;
        return false;
    }

    public void push(int input) {
        Integer[] newStack = new Integer[count * 2];
        if (stack.length == count) {
            for (int i = 0; i < count; i++) {
                newStack[i] = stack[i];


            }
            stack = newStack;
        }
        stack[count++] = input;

    }

    public int peek() {
        return stack[count-1];
     }

     public void pop(){
         stack[count-1] = null;
         count--;
         System.out.println(Arrays.toString(stack));

     }


}
