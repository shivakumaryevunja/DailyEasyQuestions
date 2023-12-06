public class FindingDuplicate {
    public static void main(String[] args){
        int[] arr = {1,2,3,4,5,6,7,4,3,2};
        duplicate(arr);
    }
    public static void duplicate(int[]arr){
        int n = arr.length;
        int[]count = new int[n-1];
        for(int i=0;i<n;i++){
            int a = arr[i]-1;
            count[a]++;
            if(count[a]>1){
                System.out.println(arr[i]+" is repeated "+count[a]+" times");
            }
        }
    }
}
/* In this we are finding the duplicate values using O(n) time complexity with extra space*/
