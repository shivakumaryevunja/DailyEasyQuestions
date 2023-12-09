import java.util.Scanner;
// Fibonacci series : 0 1 1 2 3 5 8 13 21 34...  we get the series by adding the previous 2 digits
public class FibonacciSeries {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();  //count of the digits in the series
        int a=0,b=1,c=0;
        System.out.print(a+" "+b+" ");
        for(int i=0;i<n-2;i++){
            c=a+b;
            a=b;
            b=c;
            System.out.print(c+" ");
        }
    }
}
