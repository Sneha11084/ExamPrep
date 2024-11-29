package ArraysFoundationalProblem;

public class FindtheSecondLargestElemen {
    public static int secLargest(int[] arr) {
        if(arr.length < 2){
            return -1;
        }
        int largest = Integer.MIN_VALUE;
        int secLar = Integer.MIN_VALUE;
        for(int i = 0; i<arr.length; i++){
            if (arr[i] > largest) {
                secLar = largest; // Update second largest
                largest = arr[i]; // Update largest
            } else if (arr[i] > secLar && arr[i] != largest) {
                secLar = arr[i]; // Update second largest if arr[i] is distinct and greater than secLar
            }
        }
        return secLar == Integer.MIN_VALUE? -1 : secLar;
    }

    public static void main(String[] args) {
        int[] arr = {5,5};
        System.out.println(secLargest(arr));
    }
}
