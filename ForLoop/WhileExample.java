package ForLoop;

import java.util.Scanner;

public class WhileExample {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int i = 1;
        while (i <= 10) {
            System.out.println(i);
            i++;
        }

        // While loop with break statement
        while (true) {
            System.out.print("Enter a number: ");
            int num = scan.nextInt();

            if (num == 0) {
                break;
            }

            System.out.println("You entered: " + num + " (Enter 0 to exit)");
        }

        scan.close();
    }
}
