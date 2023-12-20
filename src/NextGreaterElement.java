import java.util.Arrays;
import java.util.Scanner;
import java.util.Stack;

public class NextGreaterElement {
    //to get the next greater element in the Array using stack
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the array length: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.print("Enter the array Elements: ");
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        System.out.print("NextGreaterElement array: "+ Arrays.toString(NextGreaterElement(arr,n)));
    }
    public static int[] NextGreaterElement(int[] arr,int n){
        int[] nge = new int[n];
        Stack<Integer> stack = new Stack<>();
        for(int i=n-1;i>=0;i--){
            while(!stack.isEmpty() && stack.peek() <arr[i]){
                stack.pop();
            }
            if(stack.isEmpty()){ //here if the stack is empty -1 will be assigned at the last of the array
                nge[i] = -1;
            }else{ // if the stack is not empty then stack value at the top will be assigned to the array
                nge[i] = stack.peek();
            }
            stack.push(arr[i]); // at the end the element will be pushed to the stack
        }
        return nge;
    }
}
