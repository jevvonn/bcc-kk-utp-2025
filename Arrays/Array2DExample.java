package Arrays;

public class Array2DExample {
    public static void main(String[] args) {
        // Matrix example 2D array
        int[][] matrix = {
                { 1, 2, 3 },
                { 4, 5, 6 },
                { 7, 8, 9 }
        };

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }

        // Other example of 2D array
        String[][] anggota_kelompok = {
                { "Andi", "Budi", "Citra" },
                { "Dewi", "Eka", "Fajar", "Wi" },
                { "Gina", "Hadi", "Intan", "Joko", "Hana" }
        };

        for (int i = 0; i < anggota_kelompok.length; i++) {
            System.out.println("Kelompok " + (i + 1) + ":");

            for (int j = 0; j < anggota_kelompok[i].length; j++) {
                System.out.println("- " + anggota_kelompok[i][j]);
            }
        }
    }
}
