package com.company;

import java.util.Arrays;

public class ArrayQueue {
    private Integer[] queue;
    private int count;


    public ArrayQueue(int length) {
        queue = new Integer[length];
    }

    public boolean isEmpty() {
        if (queue[0] == null) return true;
        return false;
    }

    public void enqueue(int input) {
        Integer[] newQueue = new Integer[count * 2];
        if (queue.length == count) {
            for (int i = 0; i < count; i++) {
                newQueue[i] = queue[i];
            }
            queue = newQueue;
        }
        queue[count++] = input;
        System.out.println(Arrays.toString(queue));

    }

    public int peek() {
        return queue[0];
    }

    public void dequeue(){
        System.out.println(peek());
        queue[0] = null;
        for(int i = 0; i<queue.length-1; i++){
            queue[i] = queue[i+1];
        }
        count--;
        System.out.println(Arrays.toString(queue));

    }

    public int search(int input){
        for (int i = 0; i < count; i++) {
           if(queue[i] == input){
               return i;
           }
        }
        return -1;
    }

}
