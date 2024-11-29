package ArraysCommonOperations;
import java.util.Arrays;

public class ArrayInsertion {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        int index = 2, value = 99;

        // Shift elements to the right
        for (int i = arr.length - 1; i > index; i--) {
            arr[i] = arr[i - 1];
        }
        arr[index] = value;

        System.out.println(Arrays.toString(arr));
    }
}

