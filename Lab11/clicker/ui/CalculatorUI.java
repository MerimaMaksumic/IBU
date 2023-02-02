package lab11.clicker.ui;
import java.awt.*;
import javax.swing.*;
import lab11.clicker.applicationlogic.Calculator;

public class CalculatorUI implements Runnable {
    private JFrame frame;
    private Calculator calculator;

    public CalculatorUI(Calculator c) {
        this.calculator = c;
    }

    @Override
    public void run() {
        frame = new JFrame("Click Effect");
        frame.setPreferredSize(new Dimension(200, 100));

        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        createComponents(frame.getContentPane());

        frame.pack();
        frame.setVisible(true);
    }

    private void createComponents(Container container) {
        container.setLayout(new BorderLayout());

        JLabel label = new JLabel(String.valueOf(this.calculator.giveValue()));
        JButton clickButton = new JButton("Click");

        ClickListener listener = new ClickListener(this.calculator, label);
        clickButton.addActionListener(listener);

        container.add(label, BorderLayout.WEST);
        container.add(clickButton, BorderLayout.SOUTH);
    }
}
