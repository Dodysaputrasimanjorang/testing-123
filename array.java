import java.util.Scanner;

public class array {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Meminta pengguna memasukkan jumlah nilai ujian
        System.out.print("Masukkan jumlah nilai ujian: ");
        int jumlah = scanner.nextInt();

        // Membuat array untuk menyimpan nilai-nilai ujian
        int[] nilaiUjian = new int[jumlah];

        // Meminta pengguna memasukkan nilai ujian dan menyimpannya dalam array
        for (int i = 0; i < jumlah; i++) {
            System.out.print("Masukkan nilai ujian ke-" + (i + 1) + ": ");
            nilaiUjian[i] = scanner.nextInt();
        }

        // Menghitung nilai rata-rata
        int total = 0;
        for (int nilai : nilaiUjian) {
            total += nilai;
        }
        double rataRata = (double) total / jumlah;

        // Menentukan nilai maksimum dan minimum
        int nilaiMax = nilaiUjian[0];
        int nilaiMin = nilaiUjian[0];
        for (int nilai : nilaiUjian) {
            if (nilai > nilaiMax) {
                nilaiMax = nilai;
            }
            if (nilai < nilaiMin) {
                nilaiMin = nilai;
            }
        }

        // Menampilkan hasil
        System.out.println("Nilai rata-rata: " + rataRata);
        System.out.println("Nilai maksimum: " + nilaiMax);
        System.out.println("Nilai minimum: " + nilaiMin);

        scanner.close();
    }
}