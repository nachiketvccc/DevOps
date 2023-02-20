#  Adding of two numbers
# This is java program
import java.util.Scanner; // Import the Scanner class
# This is java import statement

public class MyClass {
    public static void main(String[] args) {
        int x, y, sum;
        Scanner myObj = new Scanner(System.in); // Create a Scanner object
        System.out.println("Type a number:");
        x = myObj.nextInt(); // Read user input

        System.out.println("Type another number:");
        y = myObj.nextInt(); // Read user input

        sum = x + y;
        System.out.println("Sum is: " + sum); // Output user input
    }
}
