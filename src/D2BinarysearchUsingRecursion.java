import java.util.Arrays;
import java.util.Scanner;

public class D2BinarysearchUsingRecursion {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[]arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        int key = sc.nextInt();
        System.out.println("initial array: "+ Arrays.toString(arr));
        int result = search(arr,key);
        if(result>=0){
            System.out.println("The "+key+" is at postion: "+result+"th index");
        }else{
            System.out.println("The key is NOT present in the array");
        }

    }

    public static int search(int[]arr,int key){
        return binarySearch(0,arr.length-1,arr,key);
    }

    public static int binarySearch(int start,int end,int[]arr,int key){
        if(start<=end){
            int mid = start+(end-start)/2;
            if(arr[mid]==key){
                return mid;
            } else if (arr[mid]<key) {
                return binarySearch(mid+1,end,arr,key);
            }else{
                return binarySearch(start,mid-1,arr,key);
            }
        }
        return -1;
    }
}
