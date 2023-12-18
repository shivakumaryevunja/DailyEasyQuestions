import java.util.Arrays;
import java.util.Scanner;

public class KthSmallestLargestElementinArray {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size of the array: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        System.out.print("Enter the k: ");
        int k = sc.nextInt();
        quicksort(arr,0,arr.length-1);
        System.out.println(Arrays.toString(arr));
        if(k<n) {
            System.out.println("kth smallest element: " + arr[k - 1]);
        }
    }
    public static void quicksort(int[]arr,int start,int end){
        if(start<end) {
            int p = sort(arr, start, end);
            quicksort(arr, start, p - 1);
            quicksort(arr, p + 1, end);
        }
    }
    public static int sort(int[]arr,int start,int end){
        int pivot = arr[end];
        int p=start;
        for(int i=start;i<end;i++){
            if(arr[i]<=pivot){
                int temp = arr[i];
                arr[i] = arr[p];
                arr[p++] = temp;
            }
        }
        int temp = arr[end];
        arr[end] = arr[p];
        arr[p] = temp;

        return p;
    }
}
