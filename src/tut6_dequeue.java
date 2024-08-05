import java.util.ArrayDeque;
import java.util.Deque;
import java.util.LinkedList;
import java.util.List;

public class tut6_dequeue {
    static void display(Deque<Integer> deque) {
        for (int element : deque) {
            System.out.print(element + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        System.out.println();

        // Creating a Deque
        Deque<Integer> deque = new LinkedList<>();

        deque.add(10);

        // Adding elements to the front and back using deque.addFirst(element) and deque.addLast(element)
        deque.addFirst(5);
        deque.addLast(20);

        System.out.print("Deque after pushing elements: ");
        display(deque);

        // Accessing front and back elements using deque.getFirst() and deque.getLast()
        System.out.println("Front element of the deque: " + deque.getFirst());
        System.out.println("Back element of the deque: " + deque.getLast());

        // Removing elements from the front and back using deque.removeFirst() and deque.removeLast()
        System.out.print("Deque after popping elements: ");
        deque.removeFirst();
        deque.removeLast();
        display(deque);

        // Size of the deque
        System.out.println("Size of the deque: " + deque.size());

        // Checking if the deque is empty
        if (deque.isEmpty()) {
            System.out.println("The deque is empty.");
        } else {
            System.out.println("The deque is not empty.");
        }

        // Use List.contains() to check if the target element is present in the deque
        int target = 30;
        if (deque.contains(target)) {
            System.out.println("Element " + target + " found in the deque.");
        } else {
            System.out.println("Element " + target + " not found in the deque.");
        }

        // Creating a deque from an array
        int[] arr = {5, 10, 15, 20};
        Deque<Integer> deque2 = new ArrayDeque<>();
        for (int value : arr) {
            deque2.add(value);
        }
        System.out.print("Deque created from an array: ");
        display(deque2);

        // Insert elements from the list to the front of the deque
        List<Integer> list = List.of(1, 2, 3, 4, 5);
        Deque<Integer> deque1 = new ArrayDeque<>(list);
        System.out.print("Deque after inserting list elements: ");
        display(deque1);
    }
}

