package onClass.collectionDemo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;

public class collectionDemo {
    public static void main(String[] args) {
        // Khởi tạo collection chính (dùng ArrayList)
        Collection<String> animals = new ArrayList<>();

        // --- 1. add(Object x) ---
        System.out.println("--- 1. add ---");
        animals.add("Dog");
        animals.add("Cat");
        animals.add("Bird");
        System.out.println("Sau khi add: " + animals); // Output: [Dog, Cat, Bird]

        // --- 2. addAll(Collection c) ---
        System.out.println("\n--- 2. addAll ---");
        Collection<String> otherAnimals = new ArrayList<>();
        otherAnimals.add("Lion");
        otherAnimals.add("Tiger");

        animals.addAll(otherAnimals);
        System.out.println("Sau khi addAll: " + animals); // Output: [Dog, Cat, Bird, Lion, Tiger]

        // --- 3. contains(Object x) ---
        System.out.println("\n--- 3. contains ---");
        boolean hasCat = animals.contains("Cat");
        System.out.println("animals có chứa 'Cat' không? " + hasCat); // Output: true

        // --- 4. containsAll(Collection c) ---
        System.out.println("\n--- 4. containsAll ---");
        Collection<String> checkList = new ArrayList<>(Arrays.asList("Dog", "Bird"));
        boolean hasAll = animals.containsAll(checkList);
        System.out.println("animals có chứa 'Dog' VÀ 'Bird' không? " + hasAll); // Output: true

        // --- 5. isEmpty() ---
        System.out.println("\n--- 5. isEmpty ---");
        System.out.println("animals có rỗng không? " + animals.isEmpty()); // Output: false

        Collection<String> emptyList = new ArrayList<>();
        System.out.println("emptyList có rỗng không? " + emptyList.isEmpty()); // Output: true

        // --- 6. size() ---
        System.out.println("\n--- 6. size ---");
        System.out.println("Số lượng phần tử trong animals: " + animals.size()); // Output: 5

        // --- 7. remove(Object x) ---
        System.out.println("\n--- 7. remove ---");
        animals.remove("Lion");
        System.out.println("Sau khi remove 'Lion': " + animals); // Output: [Dog, Cat, Bird, Tiger]

        // --- 8. removeAll(Collection c) ---
        System.out.println("\n--- 8. removeAll ---");
        // Xóa tất cả phần tử có trong checkList (Dog, Bird) khỏi animals
        animals.removeAll(checkList);
        System.out.println("Sau khi removeAll (Dog, Bird): " + animals); // Output: [Cat, Tiger]

        // --- 9. retainAll(Collection c) ---
        System.out.println("\n--- 9. retainAll ---");
        animals.add("Cat"); // Thêm lại Cat để có 2 con
        animals.add("Zebra");
        System.out.println("Trước khi retainAll: " + animals); // Output: [Cat, Tiger, Cat, Zebra]

        // Chỉ giữ lại những phần tử có trong list [Tiger, Zebra]
        Collection<String> retainList = new ArrayList<>(Arrays.asList("Tiger", "Zebra"));
        animals.retainAll(retainList);
        System.out.println("Sau khi retainAll (Tiger, Zebra): " + animals); // Output: [Tiger, Zebra]

        // --- 10. iterator() ---
        System.out.println("\n--- 10. iterator ---");
        System.out.println("Dùng iterator để duyệt và in:");
        Iterator<String> it = animals.iterator();
        while (it.hasNext()) {
            String animal = it.next();
            System.out.println("Phần tử: " + animal);
            // Bạn cũng có thể dùng it.remove() ở đây để xóa an toàn
        }

        // --- 11. toArray() ---
        System.out.println("\n--- 11. toArray ---");
        Object[] animalArray = animals.toArray();
        System.out.println("Chuyển sang mảng (Array): " + Arrays.toString(animalArray)); // Output: [Tiger, Zebra]

        // --- 12. clear() ---
        System.out.println("\n--- 12. clear ---");
        animals.clear();
        System.out.println("Sau khi clear: " + animals); // Output: []
        System.out.println("animals có rỗng không? " + animals.isEmpty()); // Output: true
    }
}