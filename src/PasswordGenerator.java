import java.util.Scanner;

public class PasswordGenerator {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the no. of digits: ");
        int n = sc.nextInt();
        System.out.println("Enter 1 if Capital letters are required: ");
        int caps = sc.nextInt();
        System.out.println("Enter 1 if special characters are required: ");
        int spl = sc.nextInt();

        String capitalLetters = "QWERTYUIOPASDFGHJKLZXCVBNM";
        String smallLetters = "qwertyuiopasdfghjklzxcvbnm";
        String specialLetters = "@#$%";

        String password = "";
        if(caps == 1) {
            password += capitalLetters.charAt((int) (capitalLetters.length() * Math.random()));
            n--;
        }
        if(spl == 1) {
            password += specialLetters.charAt((int) (specialLetters.length() * Math.random()));
            n--;
        }
        for(int i=0;i<n;i++){
            int rand = (int) (3 * Math.random());

            switch (rand){
                case 0:
                    password += String.valueOf((int)(9 * Math.random()));
                    break;
                case 1:
                    password += capitalLetters.charAt((int) (capitalLetters.length() * Math.random()));
                    break;
                case 2:
                    password += smallLetters.charAt((int) (smallLetters.length() * Math.random()));
                    break;
            }
        }
        System.out.println(password);
    }
}
