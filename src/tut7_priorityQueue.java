import java.util.PriorityQueue;
import java.util.Vector;

public class tut7_priorityQueue {
    static void display(PriorityQueue<Integer> pq) {
        while (!pq.isEmpty()) {
            System.out.print(pq.peek() + " ");
            pq.poll();
        }
        System.out.println();
    }

    public static void main(String[] args) {
        System.out.println();

        // Creating a Priority Queue
        PriorityQueue<Integer> pq = new PriorityQueue<>(); // Min-heap

        // Adding elements to the priority queue using pq.add(element)
        pq.add(10);
        pq.add(5);
        pq.add(20);

        System.out.print("Priority Queue after pushing elements: ");
        display(pq);

        // Accessing the top element using pq.peek()
        System.out.println("Top element of the priority queue: " + pq.peek());

        // Removing the top element using pq.poll()

        pq.poll();

        System.out.print("Priority Queue after popping elements: ");
        display(pq);

        // Checking if the priority queue is empty
        if (pq.isEmpty()) {
            System.out.println("The priority queue is empty.");
        } else {
            System.out.println("The priority queue is not empty.");
        }

        // Size of the priority queue
        System.out.println("Size of the priority queue: " + pq.size());

        // Use contains() to check if the target element is present in the priority queue
        int target = 20;
        PriorityQueue<Integer> pq2 = new PriorityQueue<>(pq); // Creating a copy of the priority queue
        boolean found = false;
        while (!pq2.isEmpty()) {
            if (pq2.peek() == target) {
                System.out.println("Element " + target + " found in the priority queue.");
                found = true;
                break;
            }
            pq2.poll();
        }
        if (!found) {
            System.out.println("Element " + target + " not found in the priority queue.");
        }

        // Creating a priority queue from a vector
        Vector<Integer> vec = new Vector<>(java.util.Arrays.asList(10, 20, 5, 15, 30));
        PriorityQueue<Integer> pq3 = new PriorityQueue<>(vec); // Min-heap
        System.out.print("Priority Queue created from a vector: ");
        display(pq3);
    }
}

