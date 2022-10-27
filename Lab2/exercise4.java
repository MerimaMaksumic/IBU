//Create a program that asks the user for the first number and the last number and then prints all numbers between those two. Use a while loop. 
import java.util.Scanner;

public class exercise4 {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("Type the fisrt number:");
        int first = Integer.parseInt(reader.nextLine());
        
        System.out.println("Type the second number:");
        int end = Integer.parseInt(reader.nextLine());
        
        while(first < end){
            System.out.println(first);
            first++;
        }
    }
}