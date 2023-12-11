import java.util.Scanner;

public class FindingFactorial_PowerFactorOfaNumber {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("1 - For Factorial\n2 - For Power of a number\n3 - For Factor of a number");
        int option = sc.nextInt();
        switch (option){
            case 1:
                System.out.println("Enter the number");
                int n = sc.nextInt();
                int fact = 1;
                for(int i = 0;i<n;i++){
                    fact = fact*(n-i);
                }
                System.out.println("Factorial of "+n+" = "+fact);
                break;
            case 2:
                System.out.print("Enter the number: ");
                int p = sc.nextInt();
                System.out.print("Enter the power value: ");
                int m = sc.nextInt();
                int temp = m;
                int result = 1;
                while(temp!=0){
                    result *= p;
                    temp--;
                }
                System.out.println(p+"^"+m+" = "+result);
                break;
            case 3:
                System.out.print("Enter the Number: ");
                int num = sc.nextInt();
                System.out.print("Factors of "+num+": ");
                for(int i=1;i<=num;i++){
                    if(num%i==0){
                        System.out.print(i+" ");
                    }
                }
                break;
            default:
                System.out.println("Invalid option");
                break;
        }
    }
}
