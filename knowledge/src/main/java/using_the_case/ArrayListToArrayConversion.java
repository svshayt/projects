package using_the_case;

import java.util.ArrayList;
import java.util.List;

public class ArrayListToArrayConversion {
    public static void main(String[] args) {
        List<Integer> al = new ArrayList<>();
        al.add(10);
        al.add(20);
        al.add(30);
        al.add(40);

        // Method 1: Using Object[] toArray() method
        Object[] objects = al.toArray();

        // Printing array of objects
        for (Object obj : objects)
            System.out.print(obj + " ");

        // Method 2: Using T[] toArray(T[] a)
        Integer[] arr2 = new Integer[al.size()];
        arr2 = al.toArray(arr2);

        for (Integer x : arr2)
            System.out.print(x + " ");

        // Method 3: Manual method to convert ArrayList using get() method
        Integer[] arr3 = new Integer[al.size()];

        // ArrayList to Array Conversion
        for (int i = 0; i < al.size(); i++)
            arr3[i] = al.get(i);

        for (Integer x : arr3)
            System.out.print(x + " ");

        // Method 4: Using streams API of collections in java 8 to convert to array of primitive int type
        // ArrayList to Array Conversion
        int[] arr = al.stream().mapToInt(i -> i).toArray();

        for (int x : arr)
            System.out.print(x + " ");
    }
}
