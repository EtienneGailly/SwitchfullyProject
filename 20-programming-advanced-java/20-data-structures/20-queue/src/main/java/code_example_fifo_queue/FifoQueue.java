package code_example_fifo_queue;

import java.util.ArrayDeque;
import java.util.LinkedList;
import java.util.Queue;
import java.util.concurrent.ArrayBlockingQueue;

public class FifoQueue {

    public static void main(String[] args) {
        fifoQueueUsingLinkedList();
        System.out.println("-----------");
        fifoQueueUsingArrayBlockingQueue();
        System.out.println("-----------");
        fifoQueueUsingArrayDeque();
    }

    private static void fifoQueueUsingLinkedList() {
        Queue<String> fifoQ = new LinkedList<>();

        fifoQ.add("James");
        fifoQ.add("Hannah");
        fifoQ.add("Dirk");
        fifoQ.add("Kurk");

        System.out.println(fifoQ.poll());
        System.out.println(fifoQ.poll());
        System.out.println(fifoQ.poll());
        System.out.println(fifoQ.poll());
    }

    private static void fifoQueueUsingArrayBlockingQueue() {
        Queue<String> fifoQ = new ArrayBlockingQueue<>(4);

        fifoQ.add("James");
        fifoQ.add("Hannah");
        fifoQ.add("Dirk");
        fifoQ.add("Kurk");

        System.out.println(fifoQ.poll());
        System.out.println(fifoQ.poll());
        System.out.println(fifoQ.poll());
        System.out.println(fifoQ.poll());
    }

    private static void fifoQueueUsingArrayDeque() {
        Queue<String> fifoQ = new ArrayDeque<>();

        fifoQ.add("James");
        fifoQ.add("Hannah");
        fifoQ.add("Dirk");
        fifoQ.add("Kurk");

        System.out.println(fifoQ.poll());
        System.out.println(fifoQ.poll());
        System.out.println(fifoQ.poll());
        System.out.println(fifoQ.poll());
    }


}
