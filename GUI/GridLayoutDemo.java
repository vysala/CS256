package GUI;

import javax.swing.*;
import java.awt.*;

public class GridLayoutDemo {
    public static void main(String[] args) {

        JFrame frame = new JFrame("GridLayout Example");

        // Create a 2 rows × 2 columns grid
        frame.setLayout(new GridLayout(3, 3, 10, 10)); 
        // (rows, cols, hgap, vgap)

        // Create four buttons
        JButton b1 = new JButton("Button 1");
        JButton b2 = new JButton("Button 2");
        JButton b3 = new JButton("Button 3");
        JButton b4 = new JButton("Button 4");

        // Add buttons to the frame
        frame.add(b1);
        frame.add(b2);
        frame.add(b3);
        frame.add(b4);

        // Final window settings
        frame.setSize(300, 200);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}
