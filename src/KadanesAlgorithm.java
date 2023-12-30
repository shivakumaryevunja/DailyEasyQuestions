public class KadanesAlgorithm {
    //Given an array arr[] of size N.
    // The task is to find the sum of the contiguous subarray within a arr[] with the largest sum.
    public static void main(String[] args){
        int[] arr = {-2, -3, 4, -1, -2, 1, 5, -3};
        System.out.println("Maximum contiguous sum is = "+largestSum(arr));
    }

    public static int largestSum(int[] arr){
        int n= arr.length;
        int max_ending_here = 0,max_so_far = Integer.MIN_VALUE;
        for(int i=0;i<n;i++){
            max_ending_here = max_ending_here + arr[i];
            if(max_so_far<max_ending_here){
                max_so_far = max_ending_here;
            }
            if(max_ending_here <0){
                max_ending_here = 0;
            }
        }
        return max_so_far;
    }


}
