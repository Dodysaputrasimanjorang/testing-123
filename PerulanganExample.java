import java.util.Scanner;

public class PerulanganExample {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Meminta pengguna memasukkan sebuah angka
        System.out.print("Masukkan sebuah angka: ");
        int angka = scanner.nextInt();

        // Menampilkan tabel perkalian untuk angka tersebut hingga 10 kali
        System.out.println("Tabel Perkalian untuk " + angka + ":");
        for (int i = 1; i <= 10; i++) {
            System.out.println(angka + " x " + i + " = " + (angka * i));
        }

        scanner.close();
    }
}