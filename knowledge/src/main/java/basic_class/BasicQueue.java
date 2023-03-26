package basic_class;

import java.util.PriorityQueue;
import java.util.Queue;

public class BasicQueue {
    public static void main(String[] args) {
        Queue<Integer> queue = new PriorityQueue<>();
        queue.add(3);
        queue.add(6);
        queue.add(2);
        queue.add(5);

        System.out.println(queue.poll());
    }
}
