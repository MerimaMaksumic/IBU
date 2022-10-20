//5. Create a program that asks the user for a number and tells if the number is positive (i.e. greater than zero).
package Lab1;

import java.util.Scanner;
public class exercise5 {

    public static void main(String[] args) {
        Scanner reader= new Scanner (System.in);
        System.out.println("Type a number: ");
        int num=Integer.parseInt(reader.nextLine());

        if (num>0){
             System.out.println("Number is positive" );
        }

        else{
             System.out.println("Number is negative");
        }        
    }
}   
