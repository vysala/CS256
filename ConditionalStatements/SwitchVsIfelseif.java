package ConditionalStatements;
//A grading program that prints the letter grade (A, B, C, D, F) based on the numeric score.
public class SwitchVsIfelseif {
    public static void main(String[] args) {
        
    

    int grade = 85;

if (grade >= 90) {
    System.out.println("A");
} else if (grade >= 80) {
    System.out.println("B");
} else if (grade >= 70) {
    System.out.println("C");
} else if (grade >= 60) {
    System.out.println("D");
} else {
    System.out.println("F");
}

//This if-else if works well when you check ranges, but the conditions can get long and repetitive.

//Using switch (better when checking exact values):

int day = 3;

switch (day) {
    case 1:
        System.out.println("Monday");
        break;
    case 2:
        System.out.println("Tuesday");
        break;
    case 3:
        System.out.println("Wednesday");
        break;
    case 4:
        System.out.println("Thursday");
        break;
    case 5:
        System.out.println("Friday");
        break;
    case 6:
        System.out.println("Saturday");
        break;
    case 7:
        System.out.println("Sunday");
        break;
    default:
        System.out.println("Invalid day number");
}




}
}
