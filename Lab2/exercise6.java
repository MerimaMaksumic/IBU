//Create a method printText that prints the following string of characters: "In the beginning there were the swamp, the hoe and Java." and a line break.
//Develop the program by adding the following feature: the main program should ask the user how many times the text should be printed (meaning how many times the method is called).
import java.util.Scanner;

public class exercise6 {
    public static void printText(int timesOfPrinting){
        for(int i = 0; i < timesOfPrinting; i++) System.out.println("In the beginning there were the swamp, the hoe and Java.");
    }
    public static void main(String[] args) {
        System.out.print("Enter the number for the message to be printed: ");
        printText(new Scanner(System.in).nextInt());
    }
}
