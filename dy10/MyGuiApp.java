import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MyGuiApp {

    public static void main(String[] args) {
        // Create a new frame
        JFrame frame = new JFrame("Hello World!");
        frame.setSize(400, 200);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Create a panel to hold the components
        JPanel panel = new JPanel();
        frame.add(panel);
        placeComponents(panel);

        // Set the frame to be visible
        frame.setVisible(true);
    }

    private static void placeComponents(JPanel panel) {
        // Set layout to null to manually position components
        panel.setLayout(null);

        // Create a label
        JLabel label = new JLabel("Hello World");
        label.setBounds(10, 20, 200, 25);
        panel.add(label);

        // Create a button
        JButton button = new JButton("Click Me!");
        JButton button2 = new JButton("Click Me1!");
        JButton button3 = new JButton("Click Me2!");

        button.setBounds(10, 60, 120, 25);
        panel.add(button);
        button2.setBounds(10, 260, 120, 25);


        panel.add(button2);

        button3.setBounds(10, 460, 120, 25);
        panel.add(button3);

        // Add button action listener
        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                label.setText("Button clicked!");
            }
        });
    }
}