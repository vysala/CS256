public class PrintingVars {

    public static void main(String[] args) {
        String firstLine = "Hello, again!"; // tells java that we are storing a text, variable name is firstLine
        System.out.println(firstLine);

        System.out.print("The value of firstLine is ");
        System.out.println(firstLine);
           
        //print() stays on the same line. println() prints something and then moves to the next line.
        int hour = 11;
        int minute = 59;
        System.out.print("The current time is ");
        System.out.print(hour);
        System.out.print(":");
        System.out.print(minute);
        System.out.println(".");

        System.out.print("Number of minutes since midnight: ");
        System.out.println(hour * 60 + minute);   // Java can perform calculations. There are 60 minutes in an hour. Thus based on the given value, 11*60+59 = 660+59=719.

         // The concept to note here is integer division ( When both minute and 60 are integers, java will do an integer division. So it dicards the decimal portion.
        System.out.print("Fraction of the hour that has passed: ");
        System.out.println(minute / 60);   //To get the decimal number do: System.out.println((double) minute / 60); then it won't discard the decimal part, which is called type casting.  59/60 will should be 0.98333, not 0. 


        System.out.print("Percent of the hour that has passed: ");
        System.out.println(minute * 100 / 60);
    }

}
