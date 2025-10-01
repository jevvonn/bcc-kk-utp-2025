package ForLoop;

import java.util.Scanner;

public class ForExample {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        // for (int i = 0; i < 10; i++) {
        // System.out.println("This is iteration number: " + i);
        // }

        System.out.println("==== Sum of Numbers ====");
        System.out.print("Enter number of operations: ");
        int operations = scan.nextInt();

        int sum = 0;
        for (int i = 1; i <= operations; i++) {
            System.out.print("Enter number " + i + ": ");
            int num = scan.nextInt();
            sum += num;
        }

        System.out.println("The total sum is: " + sum);
        scan.close();
    }
}
