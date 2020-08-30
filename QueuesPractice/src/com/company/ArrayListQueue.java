package com.company;

import java.util.ArrayList;

public class ArrayListQueue {

ArrayList<Integer> queue = new ArrayList<Integer>();

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
        queue.remove(0);

        System.out.println(queue);
    }

    public int search(int input) {

        if(queue.contains(input)){
            return queue.indexOf(input);
        }
        return -1;
    }



}




