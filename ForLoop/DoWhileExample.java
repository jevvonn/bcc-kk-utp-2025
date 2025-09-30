package ForLoop;

import java.util.Scanner;

public class DoWhileExample {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int numInput;
        do {
            numInput = scan.nextInt();

            System.out.println("You entered: " + numInput);
            System.out.print("Enter a number (greater than 5 to exit): ");
        } while (numInput <= 5);

        System.out.println("Exiting the program. Goodbye!");
        scan.close();
    }
}
