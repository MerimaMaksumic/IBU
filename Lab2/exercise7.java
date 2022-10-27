//Create a method printStars that prints the given amount of stars and a line break. Create the method in the following body:
public class exercise7 {
    public static void printStars(int amount){
        for(int i = 0; i < amount; i++) System.out.print("*");
        System.out.print("\n");
    }
    public static void main(String[] args) {
        printStars(5);
        printStars(3);
        printStars(9);
    }
}