package ArraysIntermediateTopics;

public class LastOccuranceUsingBinarySearch {
    public static int lastOccur(int[] arr, int target) {
        int ans1 = -1;
        int low = 0; int high = arr.length-1;
        while(low <= high){
            int mid = low + (high - low)/2;
            if (target == arr[mid]){
                ans1 = mid;
                low = mid + 1;
            }
            else if (target < arr[mid]){
                high = mid - 1;
            }
            else{
                low = mid + 1;
            }
        }
        return ans1;
    }

    public static void main(String[] args) {
        int[] arr = {1,2,4,5,6};
        int target = 3;
        System.out.println(lastOccur(arr,target));
    }
}