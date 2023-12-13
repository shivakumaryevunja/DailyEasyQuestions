import java.util.Scanner;
public class FindHCFandLCM {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.println("HCF of "+a+" and "+b+" = "+findHCF(a,b));
        System.out.println("LCM of "+a+" and "+b+" = "+findLCM(a,b));
    }
    public static int findHCF(int a,int b) { // HCF: to find the highest possible value which can completely to divided
                                                  // by both the number
        int hcf = 1;
        for(int i=1;i<=Math.min(a, b);i++) {
            if(a%i==0 && b%i==0) {
                hcf = i;
            }
        }
        return hcf;
    }

    public static int findLCM(int a,int b) {  // LCM: to find the value which is a divisible of both given numbers
        int lcm = Math.max(a, b);
        for(int i=lcm;i<=a*b;i++) {
            if(i%a==0 && i%b==0) {
                lcm = i;
                break;
            }
        }
        return lcm;
    }
}
