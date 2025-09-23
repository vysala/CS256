
/* example of a atsimple tax system th calculates taxes based on the following salary ranges and percentages:

Annual Salary	      Tax Rate
0 to 20000	            10%
Above 20000 to 50000	20%
Above 50000 to 100000	30%
Above 100000	        40% */

package Arrays;

import java.util.Scanner;
/* program calculates how much tax a person needs to pay based on their annual salary. */
public class IncomeTax {                         
public static void main (String [] args) {    
    final int MAX_ELEMENTS = 4;
    Scanner scnr = new Scanner(System.in);
    int annualSalary;
    double taxRate;
    int taxToPay;
    int totalSalaries;
    int totalTaxes;
    int numSalaries;
    boolean keepLooking;
    int i;

    int []    salaryBase     = { 20000,     50000,     100000,     999999999 };
    double [] taxBase        = {   .10,       .20,        .30,           .40 };
    int []    annualSalaries = new int[MAX_ELEMENTS];
    int []    taxesToPay     = new int[MAX_ELEMENTS];
        
    numSalaries = 0;

    System.out.println("\nEnter annual salary (0 to exit): ");
    annualSalary = scnr.nextInt();

    while ((annualSalary > 0) && (numSalaries < MAX_ELEMENTS)) { 
        i = 0;
        taxRate = 0;
        keepLooking = true;

        // Search for appropriate table row for given annualSalary
        while ((i < salaryBase.length) && keepLooking) {
            /*  if Salary = 55000
                Check 20,000 → too small
                Check 50,000 → too small
                Check 100,000 → fits here → taxRate = 0.30 */
        if (annualSalary <= salaryBase[i]) {
            taxRate = taxBase[i];
            keepLooking = false;
        }
        else {
            ++i;
        }
        } // End inner while loop (search for appropriate table row)

        taxToPay = (int)(annualSalary * taxRate); //Multiply the salary by the tax rate to calculate the tax to be paid.
        //  Truncate tax to an integer amount
        annualSalaries[numSalaries] = annualSalary;
        taxesToPay[numSalaries] = taxToPay;
        //Display the Result
        System.out.println("Annual salary: " + annualSalaries[numSalaries] +
                        "\tTax rate: " + taxRate +
                        "\tTax to pay: " + taxesToPay[numSalaries]);
        ++numSalaries;
        
        // Get the next annual salary
        if (numSalaries < MAX_ELEMENTS) {
        System.out.println("\nEnter annual salary  (0 to exit): ");
        annualSalary = scnr.nextInt();
        }
    } // End outer while loop (valid annualSalary entered)

    // Sum the annual salaries and taxes to pay and print the totals
    totalSalaries = 0;
    totalTaxes = 0;
    
    for (i = 0; i < numSalaries; ++i) {
        totalSalaries += annualSalaries[i];
        totalTaxes    += taxesToPay[i];
    }
    System.out.println("\nTotal salaries: " + totalSalaries +
                        "\tTotal taxes: " + totalTaxes);
}
}