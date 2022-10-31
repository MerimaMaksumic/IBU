//Create a program that asks for the user's name and says how many characters the name contains.
import java.util.Scanner;
public class exercise2 {
    public static void main(String[] args) {
        try (Scanner reader = new Scanner(System.in)) {
            System.out.println("Enter your name: ");
            String name = reader.nextLine();
            System.out.println("Number of characters in your name is: " + name.length());
        }
    }
}
