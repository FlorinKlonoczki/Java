package Intalnirea8;

import java.util.LinkedList;
import java.util.Queue;

public class QueueExemple {
    public static void main(String[] args) {
        Queue<String> queue = new LinkedList<>();

        queue.add("mar");
        queue.add("par");
        queue.add("cires");
        queue.add("visin");

        System.out.println(queue.peek()); //peek il extrage dar nu il sterge

        queue.poll(); ///il extrage si il sterge
        System.out.println(queue.peek());


        while (!queue.isEmpty()) {
            System.out.println("execute " + queue.poll());
        }
    }
}
