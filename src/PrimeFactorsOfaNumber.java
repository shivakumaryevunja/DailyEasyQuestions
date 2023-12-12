import java.util.Scanner;

public class PrimeFactorsOfaNumber {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number to find its Prime Factors: ");
        int n = sc.nextInt();
        primeFactors(n);
    }

    public static void primeFactors(int n){
        for(int i=2;i<=n;i++){
            if(isPrime(i)==1){
                int x=n;
                while(x%i==0){
                    System.out.print(i+" ");
                    x /= i;
                }
            }
        }
    }

    public static int isPrime(int n){
        if(n<=1){
            return 0;
        }
        for(int i=2;i<=n/2;i++){
            if(n%i==0){
                return 0;
            }
        }
        return 1;
    }
}
