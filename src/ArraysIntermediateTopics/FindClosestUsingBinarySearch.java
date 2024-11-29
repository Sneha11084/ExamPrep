package ArraysIntermediateTopics;

public class FindClosestUsingBinarySearch {
    public static int closestFind(int[] arr, int target) {
        if(arr == null || arr.length == 0){
            return -1;
        }
        int low = 0; int high = arr.length - 1;

        int closest = 0;
        while(low <= high){
            int mid = low + (high - low)/2;
            if(arr[mid] == target){
                closest = mid;
                break;
            }
            else if (Math.abs(arr[closest] - target) > Math.abs(arr[mid] - target)){
                closest = mid;
            }
            else if (target < arr[mid]){
                high = mid - 1;
            }
            else{
                low = mid + 1;
            }
        }
        return closest;
    }

    public static void main(String[] args) {
        int[] arr = {};
        System.out.println(closestFind(arr,-3));
    }
}
