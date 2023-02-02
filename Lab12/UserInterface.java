package lab11;
import javax.swing.*;
import java.awt.*;

public class UserInterface implements Runnable {

    public void run() {
        JFrame frame = new JFrame("Swing on");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setMinimumSize(new Dimension(400, 200));

        createComponents(frame.getContentPane());

        frame.pack();
        frame.setVisible(true);
    }

    private void createComponents(Container container) {
        container.setLayout(new FlowLayout());

        JLabel label = new JLabel("Hi!");
        container.add(label);
    }
}

