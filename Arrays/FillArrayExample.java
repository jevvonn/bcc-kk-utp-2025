package Arrays;

public class FillArrayExample {
    public static void main(String[] args) {
        int[] nilai = new int[5];
        nilai[0] = 80;
        nilai[1] = 90;
        nilai[2] = 75;
        nilai[3] = 85;
        nilai[4] = 95;

        nilai[2] = 78; // Mengubah nilai pada indeks ke-2
        nilai[4] = 88; // Mengubah nilai pada indeks ke-4

        System.out.println("Nilai pada indeks ke-2: " + nilai[2]);
        System.out.println("Nilai pada indeks ke-4: " + nilai[4]);

        String[] nama = new String[5];
        nama[0] = "Andi";
        nama[1] = "Budi";
        nama[2] = "Citra";
        nama[3] = "Dewi";
        nama[4] = "Eka";
    }
}
