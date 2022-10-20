//Create a program that asks the user for two integers and then prints their sum. 
package Lab1;
import java.util.Scanner;
public class exercise4 {
    public static void main(String[] args){
        final Scanner reader = new Scanner(System.in);
        System.out.println("Type a number:");
        int number1= Integer.parseInt(reader.nextLine());
        System.out.println("Type another number:");
        int number2= Integer.parseInt(reader.nextLine());
        int sum= number1+number2;        
        System.out.println("The sum is: "+ sum);
        

    }
}

