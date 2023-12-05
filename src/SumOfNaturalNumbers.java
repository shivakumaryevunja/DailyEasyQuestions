import java.util.Scanner;

public class SumOfNaturalNumbers {
    //to get the sum of natural numbers using recursion
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sum = getSum(n);
        System.out.println("Sum of first "+n+" Natural number are: "+sum);

        int a = 1;
        int b = 5;
        int sum1 = getSumOfnumbers(0,a,b);
        System.out.println("Sum of Natural number from "+a+" to "+b+" is: "+sum1);
    }

    public static int getSum(int n){
        if(n==0){
            return 0;
        }
        int sum = n + getSum(n-1);
        return sum;
    }
    // to get the Natural numbers from range a to b using recursion
    public static int getSumOfnumbers(int sum,int a,int b){
        if(a>b){
            return sum;
        }
        return a+getSumOfnumbers(sum,a+1,b);
    }
}
