package lab11.noticeboard;
import java.awt.*;
import javax.swing.*;

public class NoticeBoard implements Runnable{
    private JFrame frame;

    public NoticeBoard() {}

    @Override
    public void run() {
        frame = new JFrame("");
        frame.setPreferredSize(new Dimension(400, 300));

        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        createComponents(frame.getContentPane());

        frame.pack();
        frame.setVisible(true);
    }

    private void createComponents(Container container) {
        GridLayout layout = new GridLayout(3, 1);
        container.setLayout(layout);

        JTextField textField = new JTextField();
        JLabel label = new JLabel();
        JButton copyButton = new JButton("Copy!");

        ActionEventListener listener = new ActionEventListener(textField, label);
        copyButton.addActionListener(listener);

        container.add(textField);
        container.add(copyButton);
        container.add(label);
    }
}