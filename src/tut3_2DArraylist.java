import java.util.ArrayList;

public class tut3_2DArraylist {
    // Function to display the contents of a 2D ArrayList
    static void display2D(ArrayList<ArrayList<Integer>> list) {
        for (ArrayList<Integer> row : list) {
            for (int element : row) {
                System.out.print(element + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        System.out.println();

        // Initializing 2D ArrayLists

        // 1. Initializing a 2D ArrayList with a fixed size; default values are null
        ArrayList<ArrayList<Integer>> list1 = new ArrayList<>();
        for (int i = 0; i < 3; i++) {
            list1.add(new ArrayList<>(java.util.Collections.nCopies(4, 0)));
        }
        System.out.println("Default 2D ArrayList value -> ");
        display2D(list1);

        // 2. Initializing a 2D ArrayList with specific values
        ArrayList<ArrayList<Integer>> list2 = new ArrayList<>();
        list2.add(new ArrayList<>(java.util.Arrays.asList(1, 2, 3)));
        list2.add(new ArrayList<>(java.util.Arrays.asList(4, 5, 6)));
        list2.add(new ArrayList<>(java.util.Arrays.asList(7, 8, 9)));
        System.out.println("2D ArrayList initialized with specific values -> ");
        display2D(list2);

        // 3. Initializing a 2D ArrayList with specific values using nested ArrayLists
        ArrayList<ArrayList<Integer>> list3 = new ArrayList<>();
        list3.add(new ArrayList<>(java.util.Arrays.asList(1, 2, 3)));
        list3.add(new ArrayList<>(java.util.Arrays.asList(4, 5)));
        list3.add(new ArrayList<>(java.util.Arrays.asList(6, 7, 8)));
        System.out.println("2D ArrayList initialized with nested ArrayLists -> ");
        display2D(list3);

        // Basic 2D ArrayList Operations

        // Adding rows to a 2D ArrayList
        ArrayList<ArrayList<Integer>> arrayList = new ArrayList<>();
        arrayList.add(new ArrayList<>(java.util.Arrays.asList(1, 2, 3)));
        arrayList.add(new ArrayList<>(java.util.Arrays.asList(4, 5, 6)));
        arrayList.add(new ArrayList<>(java.util.Arrays.asList(7, 8, 9)));
        System.out.println("2D ArrayList after adding rows -> ");
        display2D(arrayList);

        // Accessing elements of a 2D ArrayList
        System.out.println("Accessing elements of the 2D ArrayList: ");
        System.out.println("Element at row 1, column 2: " + arrayList.get(1).get(2));

        // Modifying elements of a 2D ArrayList
        arrayList.get(0).set(1, 20);
        System.out.println("2D ArrayList after modifying element -> ");
        display2D(arrayList);

        // Creating a jagged 2D ArrayList
        ArrayList<ArrayList<Integer>> jagged = new ArrayList<>();
        jagged.add(new ArrayList<>(java.util.Arrays.asList(1, 2, 3)));
        jagged.add(new ArrayList<>(java.util.Arrays.asList(4, 5)));
        jagged.add(new ArrayList<>(java.util.Arrays.asList(6, 7, 8, 9)));
        System.out.println("Jagged 2D ArrayList -> ");
        display2D(jagged);
    }
}
