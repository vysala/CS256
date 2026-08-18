//Below is the syntax highlighted version of UseArgument.java from §1.1 Hello World.



/******************************************************************************
 *  Compilation:  javac UseArgument.java
 *  Execution:    java UseArgument name
 *
 *  Prints "Hi, Bob. How are you?" where "Bob" is replaced by the
 *  command-line argument.
 *
 *  % java UseArgument Bob
 *  Hi, Bob. How are you?
 *
 *  % java UseArgument Alice
 *  Hi, Alice. How are you?
 * 
 * public static void main(String[] args)
 * String[] means an array of text values (Strings).
 * args is the name of that array.
 * Java automatically creates this array to store command-line arguments—values entered when the program starts.
 * Think of args as a box that can hold words typed by the user before the program begins running.
 ******************************************************************************/

public class UseArgument {

    public static void main(String[] args) {
        System.out.print("Hi, ");
        System.out.print(args[0]);
        System.out.println(". How are you?");
    }

}