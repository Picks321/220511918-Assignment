import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;

public class ComputerNetworkMonitor {

    public ComputerNetworkMonitor() {

        JFrame frame = new JFrame();

        JLabel label = new JLabel("IP Address");
        JTextField textField = new JTextField("10.0.0.1");
        JLabel label1 = new JLabel("IP Address");
        JTextField textField1 = new JTextField("10.0.0.2");
        JLabel label2 = new JLabel("Value");
        JTextField textField2 = new JTextField("5000");
        JLabel label3 = new JLabel("Value");
        JTextField textField3 = new JTextField("7000");
        JButton button = new JButton("Add Computer");
        button.addActionListener((ActionListener) this);
        JButton button1 = new JButton("Show Computers");
        button.addActionListener((ActionListener) this);
        JButton button2 = new JButton("Cancel");
        button.addActionListener((ActionListener) this);
        JButton button3 = new JButton("Exit App");
        button.addActionListener((ActionListener) this);


        JPanel panel = new JPanel();
        panel.setBorder(BorderFactory.createEmptyBorder(30, 10, 30, 30));
        panel.setLayout(new GridLayout(0, 1));
        panel.add(label);
        panel.add(textField);
        panel.add(label1);
        panel.add(textField1);
        panel.add(label2);
        panel.add(textField2);
        panel.add(label3);
        panel.add(textField3);
        panel.add(button);
        panel.add(button1);
        panel.add(button2);
        panel.add(button3);



        frame.add(panel, BorderLayout.CENTER);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setTitle("Lab App");
        frame.pack();
        frame.setVisible(true);

    }

    public static void main(String[] args) {

        new ComputerNetworkMonitor();
    }
}
