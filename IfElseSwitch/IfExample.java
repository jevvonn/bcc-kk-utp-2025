package IfElseSwitch;

import java.util.Scanner;

public class IfExample {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String name = scan.nextLine();
        int nilai = scan.nextInt();

        char grade;
        String textLulus;

        if (nilai >= 80) {
            grade = 'A';
        } else if (nilai >= 70) {
            grade = 'B';
        } else if (nilai >= 60) {
            grade = 'C';
        } else if (nilai >= 50) {
            grade = 'D';
        } else {
            grade = 'E';
        }

        switch (grade) {
            case 'A':
            case 'B':
                textLulus = "Lulus Dengan Baik";
                break;
            case 'C':
            case 'D':
                textLulus = "Lulus";
                break;
            default:
                textLulus = "Tidak Lulus";
                break;
        }

        System.out.println("Nama: " + name);
        System.out.println("Nilai: " + nilai);
        System.out.println("Grade: " + grade);

        System.out.println("\nKamu " + textLulus);

        scan.close();
    }
}
