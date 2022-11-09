//Class Dice that has the following functionality: (HW)
//The constructor Dice(int numberOfSides) creates a new dice object that has the amount of sides defined by the argument.
//The method roll tells the result of a roll (which depends on the number of its sides)


public class exercise2 {
    public static void main(String[] args) {
        Dice dice = new Dice(6);
        int i = 0;
        while ( i < 10 ) {
            System.out.println( dice.roll() );
            i++;
        }
    }

}
