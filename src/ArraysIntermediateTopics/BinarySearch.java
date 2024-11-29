package ArraysIntermediateTopics;
import java.util.Arrays;

public class BinarySearch {
    public static int binarySearch(int[] arr, int target) {
        Arrays.sort(arr);
//        if(arr.length == 0){
//            return -1;
//        }
        int low = 0; int high = arr.length-1;
        while (low <= high){
            int mid = low + (high - low)/2;
            if(target == arr[mid]){
                return mid;
            }

            if(target < arr[mid]){
                high = mid - 1;
            }

            if(target > arr[mid]){
                low = mid + 1;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] arr = {};
        int target = 4;
        System.out.println(binarySearch(arr, target));
    }
}
