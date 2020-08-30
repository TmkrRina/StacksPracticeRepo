package com.company;

import java.util.ArrayList;
import java.util.LinkedList;

public class Main {

    public static void main(String[] args) {
//        ArrayQueue queue =  new ArrayQueue(5);
//        ArrayListQueue listQueue = new ArrayListQueue();
//        listQueue.enqueue(4);
//        listQueue.enqueue(8);
//        listQueue.enqueue(5);
//        listQueue.enqueue(2);
//        listQueue.dequeue();
//        listQueue.dequeue();
//        listQueue.dequeue();
//
//        System.out.println( listQueue.isEmpty());

        LinkedListQueue linkedListQueue = new LinkedListQueue();
        linkedListQueue.enqueue(4);
        linkedListQueue.enqueue(8);
        linkedListQueue.enqueue(5);
        linkedListQueue.enqueue(2);
        System.out.println( linkedListQueue.search(5));
        linkedListQueue.dequeue();
        linkedListQueue.dequeue();
        linkedListQueue.dequeue();

        System.out.println( linkedListQueue.search(5));


        System.out.println( linkedListQueue.isEmpty());


    }
}
