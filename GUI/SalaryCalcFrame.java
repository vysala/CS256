/* ActionListener is an interface used in GUI programming.

It contains one method: public void actionPerformed(ActionEvent e);
If a class implements ActionListener then java requires the class to override and write code for actionperformed().
*/

package GUI;

import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class SalaryCalcFrame extends JFrame implements ActionListener {
   private JLabel wageLabel;     // Label for hourly salary
   private JLabel salLabel;      // Label for yearly salary
   private JTextField salField;  // Displays hourly salary 
   private JTextField wageField; // Displays yearly salary


   /* Constructor creates GUI components and adds GUI components
      using a GridBagLayout. */
   SalaryCalcFrame() {
      // Used to specify GUI component layout
      GridBagConstraints layoutConst = null;

      // Set frame's title
      setTitle("Salary");

      wageLabel = new JLabel("Hourly wage:");
      salLabel = new JLabel("Yearly salary:");

      // Set hourly and yearly salary
      wageField = new JTextField(15);
      wageField.setEditable(true);
      wageField.setText("0");
      wageField.addActionListener(this); /* this class is listening for an action on the wageField text field. When 
                                           the user presses Enter while typing in that text field, the program will 
                                           automatically call the actionPerformed() method in this class. */

      salField = new JTextField(15);
      salField.setEditable(false);

      // Use a GridBagLayout
      setLayout(new GridBagLayout());
      layoutConst = new GridBagConstraints();

      // Specify component's grid location
      layoutConst.gridx = 0;
      layoutConst.gridy = 0;

      // 10 pixels of padding around component
      layoutConst.insets = new Insets(10, 10, 10, 10);

      // Add component using the specified constraints
      add(wageLabel, layoutConst);

      layoutConst = new GridBagConstraints();
      layoutConst.gridx = 1;
      layoutConst.gridy = 0;
      layoutConst.insets = new Insets(10, 10, 10, 10);
      add(wageField, layoutConst);

      layoutConst = new GridBagConstraints();
      layoutConst.gridx = 0;
      layoutConst.gridy = 1;
      layoutConst.insets = new Insets(10, 10, 10, 10);
      add(salLabel, layoutConst);

      layoutConst = new GridBagConstraints();
      layoutConst.gridx = 1;
      layoutConst.gridy = 1;
      layoutConst.insets = new Insets(10, 10, 10, 10);
      add(salField, layoutConst);
   }

   /* Method is automatically called when an event 
    occurs (e.g, Enter key is pressed) */
   @Override
   public void actionPerformed(ActionEvent event) { // Actionevent object contains information about the event that happened.

      String userInput;      // User specified hourly wage
      int hourlyWage;        // Hourly wage

      // Get user's wage input
      userInput = wageField.getText();
      
      // Convert from String to an integer
      hourlyWage = Integer.parseInt(userInput);

      // Display calculated salary
      salField.setText(Integer.toString(hourlyWage * 40 * 50));
   }

     
   /* Creates a SalaryCalculatorFrame object and makes it visible */
   public static void main(String[] args) {
      // Creates SalaryCalcFrame object will call the constructor and thus initialize frame and its components
      SalaryCalcFrame myFrame = new SalaryCalcFrame();

      myFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      myFrame.pack();
      myFrame.setVisible(true);
   }
}
