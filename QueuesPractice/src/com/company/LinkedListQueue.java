package com.company;

import java.util.ArrayList;
import java.util.LinkedList;

public class LinkedListQueue {
    LinkedList<Integer> queue = new LinkedList<Integer>();

    public boolean isEmpty() {
        return queue.isEmpty();
    }

    public void enqueue(int input) {
        queue.add(input);
    }

    public int peek(){
        if(queue.isEmpty()){
            return -1;
        }
        return queue.get(0);
    }

    public void dequeue() {
        System.out.println(peek());
        queue.removeFirst();

        System.out.println(queue);
    }

    public int search(int input) {

        if(queue.contains(input)){
            return queue.indexOf(input);
        }
        return -1;
    }



}





