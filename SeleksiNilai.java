import java.util.Scanner;

public class SeleksiNilai {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Meminta pengguna memasukkan nilai ujian
        System.out.print("Masukkan nilai ujian Anda (0-100): ");
        int nilai = scanner.nextInt();

        // Menggunakan if-else untuk menentukan grade
        if (nilai >= 90 && nilai <= 100) {
            System.out.println("Grade: A");
        } else if (nilai >= 80 && nilai < 90) {
            System.out.println("Grade: B");
        } else if (nilai >= 70 && nilai < 80) {
            System.out.println("Grade: C");
        } else if (nilai >= 60 && nilai < 70) {
            System.out.println("Grade: D");
        } else if (nilai >= 0 && nilai < 60) {
            System.out.println("Grade: F");
        } else {
            System.out.println("Nilai tidak valid!");
        }

        // Menggunakan switch-case untuk memberikan komentar berdasarkan grade
        char grade;
        if (nilai >= 90 && nilai <= 100) {
            grade = 'A';
        } else if (nilai >= 80 && nilai < 90) {
            grade = 'B';
        } else if (nilai >= 70 && nilai < 80) {
            grade = 'C';
        } else if (nilai >= 60 && nilai < 70) {
            grade = 'D';
        } else if (nilai >= 0 && nilai < 60) {
            grade = 'F';
        } else {
            grade = 'X'; // untuk nilai tidak valid
        }

        switch (grade) {
            case 'A':
                System.out.println("Luar biasa! Pertahankan prestasimu.");
                break;
            case 'B':
                System.out.println("Bagus! Tetap semangat.");
                break;
            case 'C':
                System.out.println("Cukup baik, tapi perlu lebih giat belajar.");
                break;
            case 'D':
                System.out.println("Perlu lebih banyak usaha. Kamu bisa lebih baik.");
                break;
            case 'F':
                System.out.println("Tidak lulus. Ayo coba lagi di kesempatan berikutnya.");
                break;
            default:
                System.out.println("Tidak ada komentar untuk nilai tidak valid.");
                break;
        }

        scanner.close();
    }
}