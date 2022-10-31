//Create a program that asks the user for two words. Then the program tells if the second word is included in the first word. Use the String method indexOf in your program.
import java.util.Scanner;
public class exercise5 {
    public static void main(String[] args) {
        try (Scanner reader = new Scanner(System.in)) {    //try mi vs sam predlaze kao rjesenje resource leap, sa close ne radi
            System.out.println("Enter first word: ");
            String word1 = reader.nextLine();
            System.out.println("Enter second word: ");
            String word2 = reader.nextLine();
            int isFound = word1.indexOf(word2);
            if(isFound != -1){
                System.out.println("The word " + word2 + " is found in word " + word1);
            }else
            {
                System.out.println("The word " + word2 + " is not found in word " + word1);
            }
        }
    }
}
