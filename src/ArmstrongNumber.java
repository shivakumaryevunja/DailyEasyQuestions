import java.util.Scanner;

public class ArmstrongNumber {
    //An Armstrong number is a positive m-digit number that is equal to the
    // sum of the mth powers of their digits.
    // It is also known as pluperfect, or Plus Perfect, or Narcissistic number
    //Example: 153: 13 + 53 + 33 = 1 + 125+ 27 = 153 (Armstrong number)
    //         125: 13 + 23 + 53 = 1 + 8 + 125 = 134 (Not an Armstrong Number)
    //         1634: 14 + 64 + 34 + 44 = 1 + 1296 + 81 + 256 = 1643 (Armstrong number)
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int b = in.nextInt();
        for(int i=a;i<b;i++){     //this prints armstrong numbers from a - b
            if(checkArmstrong(i)){
                System.out.print(i+" ");
            }
        }
      }
    public static boolean checkArmstrong(int n){
        int temp =n;
        int j=n,size=0;
        int rem=0,res=0;
        while(j!=0){     //this get the length of the number
            int r=j%10;
            j=j/10;
            size++;
        }
        while(temp!=0){
            rem =temp%10;
            temp=temp/10;
            res = res+(int)Math.pow(rem,size);
        }
        if(res==n){
            return true;
        }
        return false;
    }
}
