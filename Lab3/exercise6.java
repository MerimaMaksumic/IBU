//Create a program that asks the user to input words until the user gives the same word twice. Use an ArrayList structure in your program. ArrayList is defined like this:
import java.util.ArrayList;
import java.util.Scanner;
public class exercise6 {
    public static void main(String[] args) {
        try (Scanner reader = new Scanner(System.in)) {
            ArrayList<String> words= new ArrayList<String>();
            String user;
            while(true ){
                System.out.println("Type a word: ");
                user=reader.nextLine();
                if(words.contains(user)){
                    break;
                }
                else {
                    words.add(user);
                }
            }
        }
        System.out.println("Word is entered twice!");

    }
}
