package Arrays;

public class DisplayArray {
    public static void main(String[] args) {
        String[] nama = new String[5];
        nama[0] = "Andi";
        nama[1] = "Budi";
        nama[2] = "Citra";
        nama[3] = "Dewi";
        nama[4] = "Eka";

        for (int i = 0; i < nama.length; i++) {
            System.out.println("Nama pada indeks ke-" + i + ": " + nama[i]);
        }
    }
}
