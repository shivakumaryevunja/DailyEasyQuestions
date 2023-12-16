import java.util.Scanner;
public class HealthCalculator {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println();
        System.out.println("Welcome to Health Calculator :)");
        System.out.println();

        System.out.println("1. For BMI Calculator\n2. For BMR Calculator");
        int option = sc.nextInt();
        switch (option) {
            case 1:
                //The BMI calculator is a useful tool that measures whether you are overweight,
                // underweight, or just right.
                System.out.print("Enter the Weight in kg: ");
                float weight = sc.nextInt();
                System.out.print("Enter the Height in cm: ");
                float height = sc.nextInt();
                float h = height / 100;
                float bmi = weight / (h * h);

                if (bmi <= 18.5) {
                    System.out.println(bmi + " is Underweight try to eat more :)");
                } else if (18.5 < bmi && bmi <= 25) {
                    System.out.println(bmi + " is Normal weight keep up the good work :) ");
                } else if (bmi > 25 && bmi <= 30) {
                    System.out.println(bmi + " is little over weight try control your diet :)");
                } else if (bmi > 30) {
                    System.out.println(bmi + " is Over weight try control your diet and start exercising");
                }
                break;
            case 2:
                //BMR Calculator is a simple tool that helps you calculate how many
                // calories your body needs if you were only to rest for the whole day.
                System.out.print("Enter the Weight in kg: ");
                weight = sc.nextInt();
                System.out.print("Enter the Height in cm: ");
                height = sc.nextInt();
                System.out.print("Enter the age: ");
                int age = sc.nextInt();
                System.out.print("Enter the m - male and f - female : ");
                String gender = sc.next();

                if (gender.equalsIgnoreCase("m")) {
                    float bmr = (float) (10 * weight + 6.25 * height - 5 * age + 5);
                    System.out.println("BMR = " + bmr + "kcal/day");
                } else if (gender.equalsIgnoreCase("f")) {
                    float bmr = (float) (10 * weight + 6.25 * height - 5 * age - 161);
                    System.out.println("BMR = " + bmr + "kcal/day");
                }
                break;
            default:
                System.out.println("Invalid option");


        }
    }
}
