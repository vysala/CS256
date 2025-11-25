/* GridBagLayOut Example 
GridBagConstraints controls position and spacing of each component.
gridx = column number
gridy = row number
Insets = padding around the component
A new GridBagConstraints object is created each time to avoid overlapping settings. */

package GUI;

import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class SalaryLabelGUI {

   public static void main(String[] args) {
      int hourlyWage;             
      JFrame topFrame = null;                // Application window
      JLabel wageLabel = null;               // Label for hourly salary
      JLabel salLabel = null;                // Label for yearly salary
      JTextField salField = null;            // Displays hourly salary 
      JTextField wageField = null;           // Displays yearly salary
      GridBagConstraints layoutConst = null; // GUI component layout

      hourlyWage = 20;

      // Set hourly and yearly salary
      wageLabel = new JLabel("Hourly wage:");
      salLabel = new JLabel("Yearly salary:");

      wageField = new JTextField(15);
      wageField.setEditable(false);
      wageField.setText(Integer.toString(hourlyWage)); // here the value is set to the wageField using setText() method

      salField = new JTextField(15);
      salField.setEditable(false);
      salField.setText(Integer.toString((hourlyWage * 40 * 50)));

      // Create frame and add components using GridBagLayout
      topFrame = new JFrame("Salary");
      
      // Use a GridBagLayout
      topFrame.setLayout(new GridBagLayout());

      // GridBagConstraints object is created 
      layoutConst = new GridBagConstraints();
      // Specify component's grid location [ Place wagelabel at (0,0)]
      layoutConst.gridx = 0; // column 0
      layoutConst.gridy = 0; // row 0
      // 10 pixels of padding around component
      layoutConst.insets = new Insets(10, 10, 10, 10);
      // Add component using the specified constraints, it will be placed at (0,0)
      topFrame.add(wageLabel, layoutConst); // wageLabel goes in row 0, column 0.

      layoutConst = new GridBagConstraints();
      layoutConst.gridx = 1; // column 1
      layoutConst.gridy = 0; // row 0
      layoutConst.insets = new Insets(10, 10, 10, 10);
      topFrame.add(wageField, layoutConst); //wageField goes in row 0, column 1, next to the label.

      // Place salLabel at (0,1)
      layoutConst = new GridBagConstraints();
      layoutConst.gridx = 0;
      layoutConst.gridy = 1;
      layoutConst.insets = new Insets(10, 10, 10, 10);
      topFrame.add(salLabel, layoutConst);

      //Place salField at (1,1)
      layoutConst = new GridBagConstraints();
      layoutConst.gridx = 1;
      layoutConst.gridy = 1;
      layoutConst.insets = new Insets(10, 10, 10, 10);
      topFrame.add(salField, layoutConst);

      // Terminate program when window closes
      topFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      
      // Resize window to fit components
      topFrame.pack();
      
      // Display window
      topFrame.setVisible(true);
   }
}