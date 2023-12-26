import java.util.LinkedList;
import java.util.*;
import java.util.Queue;
//in this we are checking the string is palindrome or not using Queue
public class ReveseStringusingQueue {
    public static void main(String[] args){
        System.out.print("Enter thr string to check: ");
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        reverse(str);
    }

    public static void reverse(String str){
        Queue q = new LinkedList();
        int n = str.length();
        for(int i=n-1;i>=0;i--){  //iterating from the back and adding the character to Queue
            q.add(str.charAt(i));
        }
        String reverseString = "";
        while(!q.isEmpty()){  // removing from the Queue and concatenating to the string variable
            reverseString += q.remove();
        }

        if(str.equalsIgnoreCase(reverseString)){
            System.out.println("The given string is Palindrome");
        }else{
            System.out.println("NOT Palindrome");
        }
    }
}
