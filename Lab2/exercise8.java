//STEP 1: The program that comes with the exercise contains a command called drawNumber. It draws a number, which is in the range 0 to 100 (both 0 and 100 are possible). Create a program that draws a number. Then the user has the chance to guess once, what the number is. The program should print "The number is lesser", "The number is greater" or "Congratulations, your guess is correct!" depending on the number the user typed.
//STESTEP 3: Develop your program by adding the following functionality: the program needs to include a variable of type int, which is used to count the guesses the user has made. The program should always print the number of guesses along with the answer.P 2: Develop your program by adding the following functionality: the guessing should be made repeatedly until the user types the right number. Note that you need to draw the number by using the drawNumber command before the repetition. Why? What happens if you draw the number inside the repetition?
//
import java.util.Scanner;

public class exercise8 {
    public static int drawNumber() {
        return (int) (Math.random() * 100); 
    }

    public static void main(String[] args) {
        int number = drawNumber();
        int guess;
        int count=0;
        
        while (true) {
            count++;
            System.out.print("Guess the number: ");
            guess = new Scanner(System.in).nextInt();
            if (guess > number) System.out.println("The number is lesser! guess made: " +count);
            else if (guess < number) System.out.println("The number is greater! guess made " +count);
            else {
                System.out.println("Congratulations, your number is correct! guess made: " +count);
                break;
            }
        }
    }
}
