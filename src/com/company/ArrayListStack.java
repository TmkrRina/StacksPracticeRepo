package com.company;

import java.util.ArrayList;

public class ArrayListStack {
    ArrayList<Integer> stack = new ArrayList<Integer>();


    public boolean isEmpty() {
        return stack.isEmpty();
    }

    public void push(int input) {
        stack.add(input);

    }

    public int peek() {
        return stack.get(stack.size() - 1);
    }

    public void pop() {
        System.out.println(peek());
        stack.remove(stack.size() - 1);
        System.out.println(stack);
    }

    public int search(int input) {

        if(stack.contains(input)){
            return stack.indexOf(input);
        }
        return -1;
    }



}




