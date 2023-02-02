package lab11;
import java.awt.*;
import javax.swing.*;

public class UserInterface2 implements Runnable{
	private JFrame frame;
    
    @Override
    public void run() {
        frame = new JFrame("Survey");
        frame.setPreferredSize(new Dimension(200, 300));

        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        createComponents(frame.getContentPane());

        frame.pack();
        frame.setVisible(true);
    }

    private void createComponents(Container container) {
        BoxLayout layout = new BoxLayout(container, BoxLayout.Y_AXIS);
        container.setLayout(layout);

        container.add(new JLabel("Are you?"));

        JCheckBox checkbox1 = new JCheckBox("Yes!");
        JCheckBox checkbox2 = new JCheckBox("No!");

        container.add(checkbox1);
        container.add(checkbox2);

        container.add(new JLabel("Why?"));

        JRadioButton button1 = new JRadioButton("No reason");
        JRadioButton button2 = new JRadioButton("Because it is fun!");

        ButtonGroup buttonGroupRadio = new ButtonGroup();
        buttonGroupRadio.add(button1);
        buttonGroupRadio.add(button2);

        container.add(button1);
        container.add(button2);

        JButton button = new JButton("Done!");
        container.add(button);
    }

}
