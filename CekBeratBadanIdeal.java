package bin.com.belajar;

import java.util.Scanner;

public class CekBeratBadanIdeal {
    @SuppressWarnings("resource")
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Judul program
        System.out.println("=========================================");
        System.out.println("     PROGRAM CEK BERAT BADAN IDEAL");
        System.out.println("=========================================");

        // Input data pengguna
        System.out.print("Masukkan nama kamu        : ");
        String nama = input.nextLine();

        System.out.print("Masukkan umur kamu (tahun): ");
        int umur = input.nextInt();
        input.nextLine(); // membersihkan enter

        System.out.print("Masukkan jenis kelamin (Pria/Wanita): ");
        String gender = input.nextLine();

        System.out.print("Masukkan tinggi badan (cm): ");
        int tinggi = input.nextInt();

        System.out.print("Masukkan berat badan (kg) : ");
        double berat = input.nextDouble();

        // Hitung berat badan ideal berdasarkan jenis kelamin
        double beratIdeal;
        if (gender.equalsIgnoreCase("Pria")) {
            beratIdeal = (tinggi - 100) - (0.1 * (tinggi - 100));
        } else if (gender.equalsIgnoreCase("Wanita")) {
            beratIdeal = (tinggi - 100) - (0.15 * (tinggi - 100));
        } else {
            System.out.println("Jenis kelamin tidak valid. Gunakan 'Pria' atau 'Wanita'.");
            return;
        }

        // Garis pembatas hasil
        System.out.println("\n-----------------------------------------");
        System.out.println("               HASIL CEK");
        System.out.println("-----------------------------------------");

        // Tampilkan hasil
        System.out.println("Nama             : " + nama);
        System.out.println("Umur             : " + umur + " tahun");
        System.out.println("Jenis Kelamin    : " + gender);
        System.out.println("Tinggi Badan     : " + tinggi + " cm");
        System.out.println("Berat Badan      : " + berat + " kg");
        System.out.printf("Berat Ideal      : %.1f kg\n", beratIdeal);

        // Status berat badan
        if (berat < beratIdeal) {
            System.out.println("Status           : KURUS");
            System.out.println("Saran            : Tambah asupan kalori & olahraga teratur.");
        } else if (berat <= beratIdeal + 2) {
            System.out.println("Status           : IDEAL");
            System.out.println("Saran            : Pertahankan gaya hidup sehat!");
        } else {
            System.out.println("Status           : GEMUK");
            System.out.println("Saran            : Jaga pola makan & perbanyak aktivitas fisik.");
        }

        System.out.println("=========================================");
        System.out.println("   Terima kasih telah menggunakan program");
        System.out.println("=========================================");
    }
}