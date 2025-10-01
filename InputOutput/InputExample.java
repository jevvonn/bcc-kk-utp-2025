package InputOutput;

import java.util.Scanner;

public class InputExample {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukkan nama Anda: ");
        String name = scanner.nextLine();

        System.out.print("Masukkan umur Anda: ");
        int age = scanner.nextInt();

        // scanner.nextLine(); // newline yang tersisa
        System.out.print("Masukkan prodi Anda: ");
        String prodi = scanner.nextLine();

        System.out.print("Masukkan tinggi badan Anda (dalam cm): ");
        double height = scanner.nextDouble();

        System.out.print("Apakah Anda seorang mahasiswa? (true/false): ");
        boolean isStudent = scanner.nextBoolean();

        System.out.println("\nData yang Anda masukkan:");
        System.out.println("Nama: " + name);
        System.out.println("Umur: " + age);
        System.out.println("Prodi: " + prodi);
        System.out.println("Tinggi Badan: " + height + " cm");
        System.out.println("Mahasiswa: " + isStudent);

        scanner.close();
    }
}
