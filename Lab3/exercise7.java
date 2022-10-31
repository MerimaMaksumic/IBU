//Create the method lengths that gets a list of String variables as a parameter and returns an ArrayList that contains the lengths of the Strings in the same order as the original list.
import java.util.ArrayList;

public class exercise7 {
    public static void main(String[] args){
        ArrayList<String> list = new ArrayList<String>();
        list.add("Hallo");
        list.add("Moi");
        list.add("Merima!");
        list.add("lab lab lab ");
        ArrayList<Integer> lengths = lengths(list);
        System.out.println("The lengths of words is: " + lengths);
        }
    public static ArrayList<Integer> lengths(ArrayList<String> list) {
        ArrayList<Integer> lengths = new ArrayList<Integer>();
        for (String words : list) {
            lengths.add(words.length());
        }
        return lengths;
    }
}
