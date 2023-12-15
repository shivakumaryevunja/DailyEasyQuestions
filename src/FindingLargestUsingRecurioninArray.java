public class FindingLargestUsingRecurioninArray {
    public static void main(String[] args){
        int [] arr = {22,44,2,6,45,78};
        int largest = largestNumber(arr.length,arr);
        int smallest = smallestNumber(arr.length,arr);
        System.out.println("Largest number is: "+largest);
        System.out.println("Largest number is: "+smallest);
    }
    public static int largestNumber(int n, int[] arr){ // Recursive function to get the largest number
        if(n==1){
            return arr[0];
        }
        return Math.max(arr[n-1] ,largestNumber(n-1,arr));
    }

    public static int smallestNumber(int n,int[] arr){ // Recursive function to get the smallest number
        if(n==1){
            return arr[0];
        }
        return Math.min(arr[n-1], smallestNumber(n-1, arr));
    }
}
