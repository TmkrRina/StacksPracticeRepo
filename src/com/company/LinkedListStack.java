package com.company;

import javax.swing.*;
import java.util.LinkedList;

public class LinkedListStack {
    LinkedList<Integer> stack = new LinkedList<Integer>();

    public boolean isEmpty() {
        return stack.isEmpty();
    }

    public void push(int input) {
        stack.add(input);

    }

    public int peek() {
        return stack.getLast();
    }

    public void pop() {
        System.out.println(peek());
        stack.removeLast();
        System.out.println(stack);
    }

    public int search(int input) {

        if(stack.contains(input)){
            return stack.indexOf(input);
        }
        return -1;
    }



}
