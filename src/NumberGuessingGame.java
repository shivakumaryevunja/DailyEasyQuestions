import java.util.Scanner;
// Guess the number between 1-100 with 5 chances to guess
public class NumberGuessingGame {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int num = 1+(int)(100*Math.random()); //this generates number between 1-100
        int count = 0;
        System.out.println("Guess the number between 1 - 100: ");
        while(count < 5) {

            int userInput = sc.nextInt();
            if(num==userInput){
                System.out.println("Congratulations! Correct Answer: "+ num);
                return;
            } else if (num>userInput) {
                System.out.println(userInput+" is less");
            } else if (num<userInput) {
                System.out.println(userInput+" is greater");
            }
            count++;
        }
            System.out.println("Game Over!!");
            System.out.println("Correct Answer is " + num);

    }
}
