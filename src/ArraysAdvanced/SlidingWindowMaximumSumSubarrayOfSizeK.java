package ArraysAdvanced;

public class SlidingWindowMaximumSumSubarrayOfSizeK {
    public static void main(String[] args) {
        int[] arr = {1,8,3,3,5,6,7};
        int k = 4;
        int max = 0;
        int curr = 0;
        int s = 0;
        int e = k-1;
        for(int i = 0; i < k; i++){
            curr += arr[i];
        }
        max = curr;
        for(int i = 1; i <= arr.length - k; i++){
            curr = curr - arr[i-1] + arr[i+k-1];
            if(curr > max){
                max = curr;
                s = i;
                e = i+k-1;
            }
        }
        System.out.println(max + " "+s+" "+e);
    }
}
