import java.util.LinkedList;
import java.util.Queue;

public class tut5_queue {
    public static void main(String[] args) {
        System.out.println();

        // Creating a Queue
        Queue<Integer> queue = new LinkedList<>();

        // Adding elements to the queue using queue.add(element)
        queue.add(10);
        queue.add(20);
        queue.add(30);

        System.out.print("Queue after pushing elements: ");
        while (!queue.isEmpty()) {
            System.out.print(queue.peek() + " "); // Display the front element
            queue.poll(); // Remove the front element
        }
        System.out.println();

        // Checking if the queue is empty
        if (queue.isEmpty()) {
            System.out.println("The queue is empty.");
        } else {
            System.out.println("The queue is not empty.");
        }

        // Size of the queue
        System.out.println("Size of the queue: " + queue.size());

        // Creating a queue from an array
        int[] arr = {5, 10, 15, 20};
        Queue<Integer> queue2 = new LinkedList<>();
        for (int value : arr) {
            queue2.add(value);
        }

        System.out.print("Queue created from an array: ");
        while (!queue2.isEmpty()) {
            System.out.print(queue2.peek() + " ");
            queue2.poll();
        }
        System.out.println();
    }
}

