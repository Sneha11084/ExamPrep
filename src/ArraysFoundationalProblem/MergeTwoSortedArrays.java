package ArraysFoundationalProblem;
import java.util.Arrays;
public class MergeTwoSortedArrays {
    public static int[] mergeSorted(int[] arr1, int[] arr2) {
        int l1 = arr1.length; int l2 = arr2.length;
        int[] merged = new int[l1 + l2];
        int o = 0; int t = 0; int m = 0;
        while (o < l1 && t < l2){
            if(arr1[o] < arr2[t]){
                merged[m] = arr1[o];
                m++;
                o++;
            }
            else{
                merged[m] = arr2[t];
                m++;
                t++;
            }
        }
        while(o < l1){
            merged[m] = arr1[o];
            m++;
            o++;
        }
        while(t < l2){
            merged[m] = arr2[t];
            m++;
            t++;
        }
        return merged;
    }

    public static void main(String[] args) {
        int[] arr1 = {1,2,3};
        int[] arr2 = {4,5,6};
        System.out.println(Arrays.toString(mergeSorted(arr1,arr2)));

    }
}
