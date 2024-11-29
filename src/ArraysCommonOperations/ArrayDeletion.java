package ArraysCommonOperations;

import java.util.Arrays;

public class ArrayDeletion {
    public static void main(String[] args) {
        int[] arr = {10, 20, 30, 40, 50};
        int index = 2;

        // Shift elements to the left
        for (int i = index; i < arr.length - 1; i++) {
            arr[i] = arr[i + 1];
        }
        arr[arr.length - 1] = 0; // Optional: Reset the last element

        System.out.println(Arrays.toString(arr));
    }
}

