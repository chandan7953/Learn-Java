import java.util.Comparator;
import java.util.PriorityQueue;

public class tut8_heapPriorityQueue {
    public static void main(String[] args) {
        System.out.println();

        // Min Priority Queue (default behavior)
        PriorityQueue<Integer> minHeap = new PriorityQueue<>();

        minHeap.add(5);
        minHeap.add(10);
        minHeap.add(3);
        minHeap.add(8);

        System.out.print("Min Priority Queue (Min-Heap): ");
        while (!minHeap.isEmpty()) {
            System.out.print(minHeap.poll() + " ");
        }
        System.out.println();

        // Max Priority Queue (using custom comparator)
        PriorityQueue<Integer> maxHeap = new PriorityQueue<>(Comparator.reverseOrder());

        maxHeap.add(5);
        maxHeap.add(10);
        maxHeap.add(3);
        maxHeap.add(8);

        System.out.print("Max Priority Queue (Max-Heap): ");
        while (!maxHeap.isEmpty()) {
            System.out.print(maxHeap.poll() + " ");
        }
        System.out.println();
    }
}
