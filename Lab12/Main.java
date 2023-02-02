package lab11;
import javax.swing.*;
import lab11.clicker.applicationlogic.*;
import lab11.clicker.ui.CalculatorUI;
import lab11.noticeboard.NoticeBoard;
import java.io.FileNotFoundException;
import java.util.ArrayList;

public class Main {

	public static void main(String[] args) throws Exception {
		//excercise 1
//		FileManager f = new FileManager();
//        	for (String line : f.read("src/testinput1.txt")) {
//        		System.out.println(line);
//        	}
//        
//        f.save("src/testinput1.txt", "Lejla");
//        
//        ArrayList<String> list = new ArrayList<String>();
//        list.add("element1");
//        list.add("element2");
//        list.add("element3");
//        
//        f.save("src/testinput1.txt", list);
        
        //excercise2
//		UserInterface ui = new UserInterface();
//		SwingUtilities.invokeLater(ui);
		
        //excercise3
//		UserInterface2 ui = new UserInterface2();
//		SwingUtilities.invokeLater(ui);
        
        //excercise4
//		NoticeBoard noticeboard = new NoticeBoard();
//		SwingUtilities.invokeLater(noticeboard);
		
		//excercise5
		Calculator calc = new PersonalCalculator(); 
		
		System.out.println("Value: " + calc.giveValue()); 
		calc.increase();
		
		System.out.println("Value: " + calc.giveValue());
		calc.increase();
		
		System.out.println("Value: " + calc.giveValue());
		
		
		CalculatorUI ui = new CalculatorUI(calc);
		SwingUtilities.invokeLater(ui);
	}

}
