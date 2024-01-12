import java.util.Arrays;
import java.util.HashSet;
//Create a HashSet. For each element of the array
//, get the difference of target sum and the array element.
//If the difference is present in the HashSet, it means that there
//are two integers in the array whose sum is equal to the given target sum.
//Otherwise, push that element to the HashSet and repeat the same
//for the remaining array elements.
public class PairsWithGivenSum {
    public static void main(String[] args){
        int[] arr = {1, 5, 7, -1, 5};
        int n=arr.length;
        Arrays.sort(arr);
        HashSet<Integer> h = new HashSet<>();
        int sum = 6;
        for(int i=0;i<n;i++){
            int a = sum - arr[i];
            if( h.contains(a)){
                System.out.println(a+" "+arr[i]);
            }else{
                h.add(arr[i]);
            }
        }

    }
}
