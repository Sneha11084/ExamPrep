package ArraysFoundationalProblem;

public class MinMax {
    public static void main(String[] args) {
        int[] arr = {5, 8, 2, 9, 3};
        int min = arr[0], max = arr[0];

        for (int num : arr) {
            if (num < min) min = num;
            if (num > max) max = num;
        }

        System.out.println("Minimum: " + min);
        System.out.println("Maximum: " + max);
    }
}

