//Create a program that asks the user for a password. If the password is right, a secret message is shown to the user.
import java.util.Scanner;


public class exercise1 {
    public static void main(String[] args) {
        String password = "sifra123";
        while (true) {
          

            Scanner myObj = new Scanner(System.in);
            System.out.println("Type the password");
            String enteredPassword = myObj.nextLine();  

            if (password.equals(enteredPassword)) {
                System.out.println("Right!");
                break;
            } else {
                System.err.println("Wrong!");
            }
        }
        System.out.println("Secret message: bravo");
    }
}

