import java.util.ArrayList;
import java.util.Collections;

public class tut2_ArrayList {
    public static void main(String[] args) {

        // Initializing ArrayLists
        // 1. Initializing an ArrayList with a fixed size; default values are null
        ArrayList<Integer> list1 = new ArrayList<>(5);
        System.out.println("Default ArrayList value -> " + list1);

        // 2. Initializing an ArrayList with specific values
        ArrayList<Integer> list2 = new ArrayList<>(java.util.Arrays.asList(1, 2, 3, 4, 5));
        System.out.println(list2);

        // 3. Another way to initialize an ArrayList with specific values
        ArrayList<Integer> list3 = new ArrayList<>();
        list3.add(1);
        list3.add(2);
        list3.add(3);
        list3.add(4);
        list3.add(5);
        System.out.println(list3);

        // 4. Initializing an ArrayList with a specific value at each index
        ArrayList<Integer> list4 = new ArrayList<>(java.util.Collections.nCopies(5, 42));
        System.out.println(list4);

        // Basic ArrayList Operations
        ArrayList<Integer> list = new ArrayList<>();
        // Adding elements to the ArrayList using list.add(element)
        System.out.println("\nAdding elements 45, 12, 15, 1, 85 to the ArrayList: ");
        list.add(45);
        list.add(12);
        list.add(15);
        list.add(1);
        list.add(85);
        System.out.println(list);

        // Inserting an element at a specific index using list.add(index, value)
        System.out.println("\nInserting value 10 at index 2: ");
        int index = 2;
        int value = 10;
        list.add(index, value);
        System.out.println(list);

        // Deleting an element from the ArrayList using list.remove(index)
        System.out.println("\nDeleting the element at index 3: ");
        int indexToDelete = 3;
        list.remove(indexToDelete);
        System.out.println(list);

        // Accessing the last element of the ArrayList using list.get(index)
        System.out.println("Last element of the ArrayList: " + list.get(list.size() - 1));

        // Sorting the ArrayList in increasing order
        Collections.sort(list);
        System.out.println("\nSorting the ArrayList in increasing order: ");
        System.out.println(list);

        // Sorting the ArrayList in decreasing order
        Collections.sort(list, Collections.reverseOrder());
        System.out.println("Sorting the ArrayList in decreasing order: ");
        System.out.println(list);

        // Searching for a target value in the ArrayList
        int target = 10;
        if (list.contains(target)) {
            System.out.println("Element " + target + " found in the ArrayList.");
        } else {
            System.out.println("Element " + target + " not found in the ArrayList.");
        }

        // Checking if the ArrayList is empty
        if (list.isEmpty()) {
            System.out.println("The ArrayList is empty.");
        } else {
            System.out.println("The ArrayList is not empty.");
        }

        // Getting the size of the ArrayList
        System.out.println("Size of the ArrayList: " + list.size());

        // Creating an ArrayList from an array
        Integer[] arr1 = {10, 20, 5, 23, 15, 42, 20, 15};
        ArrayList<Integer> arrayListFromArr = new ArrayList<>(java.util.Arrays.asList(arr1));
        System.out.println("\nCreating an ArrayList from an array: ");
        System.out.println(arrayListFromArr);

        // Counting the occurrences of a value in the ArrayList
        int valueToCount = 20;
        System.out.println("Occurrences of " + valueToCount + " in the ArrayList: " +
                Collections.frequency(arrayListFromArr, valueToCount));

        // Cloning the ArrayList or creating a copy
        ArrayList<Integer> copy1 = new ArrayList<>(list);
        ArrayList<Integer> copy2 = new ArrayList<>(list);
        copy2.set(1, 78);
        System.out.println("Original ArrayList: " + list);
        System.out.println("Copy 1: " + copy1);
        System.out.println("Copy 2: " + copy2);
    }
}

