package ArraysFoundationalProblem;

/*Reverse the entire array.
Reverse the first k elements.
Reverse the remaining n-k elements.
*/
public class RotateanArraybykPositions {
    public static void rotateArray(int[] arr, int k) {
        int n = arr.length;
        if (n == 0 || k <= 0) return;

        k = k % n; // Handle cases where k > n

        reverse(arr, 0, n - 1);      // Step 1: Reverse the whole array
        reverse(arr, 0, k - 1);      // Step 2: Reverse the first k elements
        reverse(arr, k, n - 1);      // Step 3: Reverse the rest of the elements
    }

    private static void reverse(int[] arr, int start, int end) {
        while (start < end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        int k = 2;
        rotateArray(arr, k);
        System.out.println("Rotated Array: " + java.util.Arrays.toString(arr));
    }

}
