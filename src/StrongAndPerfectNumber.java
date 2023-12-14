public class StrongAndPerfectNumber {
    public static void main(String[] args){
        int n = 2;
    int result = strongNumber(n);
    if(result == n) {
        System.out.println(n + " is a Strong number");
    }else{
        System.out.println(n + " is NOT a Strong number");
    }
    int a = 6;
    if(perfectNum(a)){
        System.out.println(a+" is Perfect number");
    }else{
        System.out.println(a+" is NOT a Perfect number");
    }
    }

    public static int strongNumber(int n){ //A Number that can be represented as the sum of the factorial
                                           // of its individual digits is known as a Strong Number.
                                           // example:  1! + 4! + 5! = 145
                                           // examples od Strong number : 1, 2, 145, 40585
        int temp = n;
        int rem=0,sum=0;
        while(temp!=0){
            rem = temp%10;
            sum = sum+ fact(rem);
            temp = temp/10;
        }
        return sum;
    }

    public static int fact(int n){
        int fact = 1;
        for(int i=n;i>=1;i--){
            fact *= i;
        }
        return fact;
    }

    public static boolean perfectNum(int n){ //a number whose sum of its divisor(Excluding the number itself)
                                         // is equal to the number itself
                                         // example 1 + 2 + 3 = 6, 1 + 2 + 4 + 7 + 14 = 28
        int sum = 0;
        for(int i=1;i<n;i++){
            if(n%i==0){
                sum += i;
            }
        }
        return sum == n;
    }
}
