import java.util.Map;

class Pair<K, V> {
    private K key;
    private V value;

    public Pair(K key, V value) {
        this.key = key;
        this.value = value;
    }

    public K getKey() {
        return key;
    }

    public V getValue() {
        return value;
    }
}

public class tut9_Pair {
    public static void show(Pair<?, ?> g) {
        System.out.println(g.getKey() + "   " + g.getValue());
    }

    public static void main(String[] args) {
        // Initializing pairs
        // 1. Initializing with values
        Pair<Integer, Integer> p1 = new Pair<>(1, 2);
        show(p1);

        // 2. Initializing with values
        Pair<Integer, Character> p2 = new Pair<>(1, 'c');
        show(p2);

        // 3. Initializing with values
        Pair<Integer, Integer> p3 = new Pair<>(1, 2);
        show(p3);

        // 4. Initializing and assigning values
        Pair<Integer, String> p4 = new Pair<>(1, "chandan");
        show(p4);

        // Default pair
        // Default-initialized pair has null values for both key and value
        Pair<Integer, Integer> g = new Pair<>(null, null);
        show(g);

        // Swap two pairs
        Pair<Integer, Integer> pair1 = new Pair<>(11, 12);
        Pair<Integer, Integer> pair2 = new Pair<>(85, 98);
        Pair<Integer, Integer> temp = pair1;
        pair1 = pair2;
        pair2 = temp;
        show(pair1);
        show(pair2);

        // Clone the pair
        Pair<Integer, Character> pc1 = new Pair<>(1, 'c');
        Pair<Integer, Character> pc2 = new Pair<>(pc1.getKey(), pc1.getValue());
        pc2 = new Pair<>(78, pc2.getValue());
        show(pc2);
        show(pc1);

        // Unboxing a pair using individual variables
        Pair<Integer, Integer> u = new Pair<>(1, 2);
        int a = u.getKey();
        int b = u.getValue();
        System.out.println(a + " " + b);
    }
}
