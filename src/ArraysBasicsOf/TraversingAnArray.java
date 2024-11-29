package ArraysBasicsOf;

public class TraversingAnArray {
    public static void main(String[] args) {
        int[] arr = {10, 20, 30, 40, 50};

        // Using a for loop
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }

        // Using an enhanced for loop
        for (int value : arr) {
            System.out.println(value);
        }
    }
}
