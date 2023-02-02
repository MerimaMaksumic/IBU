package lab11.clicker.ui;
import java.awt.event.*;
import javax.swing.*;
import lab11.clicker.applicationlogic.Calculator;

public class ClickListener implements ActionListener {
    private Calculator calculator;
    private JLabel label;

    public ClickListener(Calculator calculator, JLabel label) {
        this.calculator = calculator;
        this.label = label;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        this.calculator.increase();
        this.label.setText(Integer.toString(calculator.giveValue()));
    }
    
}
