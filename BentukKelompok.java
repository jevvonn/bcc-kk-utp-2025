import java.util.Scanner;

public class BentukKelompok {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int jumlah_kelompok = scan.nextInt();
        int[] jumlah_anggota = new int[jumlah_kelompok];

        for (int i = 0; i < jumlah_kelompok; i++) {
            int jumlah = scan.nextInt();
            jumlah_anggota[i] = jumlah;
        }

        String[][] isi_kelompok = new String[jumlah_kelompok][];

        scan.nextLine();
        for (int i = 0; i < jumlah_anggota.length; i++) {
            isi_kelompok[i] = new String[jumlah_anggota[i]];

            for (int j = 0; j < jumlah_anggota[i]; j++) {
                String nama_mahasiswa = scan.nextLine();
                isi_kelompok[i][j] = nama_mahasiswa;
            }
        }

        System.out.println("Banyak Kelompok Terbentuk: " + jumlah_kelompok);
        System.out.println("== List Kelompok ==");
        for (int i = 0; i < isi_kelompok.length; i++) {
            System.out.println("Kelompok " + (i + 1) + " :");

            for (int j = 0; j < isi_kelompok[i].length; j++) {
                System.out.println("-" + isi_kelompok[i][j]);
            }
        }

        scan.close();
    }
}
