package bin.com.belajar;

import java.util.Scanner;

public class TagihanPDAM {
    public static void main(String[] args) {
        @SuppressWarnings("resource")
        Scanner input = new Scanner(System.in);

        // Input nama pelanggan
        System.out.print("Masukkan nama pelanggan: ");
        String namaPelanggan = input.nextLine();

        // Input jumlah pemakaian air
        System.out.print("Masukkan jumlah pemakaian air (m³): ");
        double pemakaian = input.nextDouble();

        // Input tarif per meter kubik
        System.out.print("Masukkan tarif air per m³: ");
        double tarifPerKubik = input.nextDouble();

        // Hitung total tagihan
        double totalTagihan = pemakaian * tarifPerKubik;
        System.out.println("Total Tagihan PDAM: Rp " + String.format("%,.2f", totalTagihan));

        // Variabel untuk menyimpan total pembayaran
        double totalPembayaran = 0;

        // Loop hingga pembayaran cukup atau pelanggan membatalkan transaksi
        while (totalPembayaran < totalTagihan) {
            System.out.print("Masukkan jumlah pembayaran: Rp ");
            double pembayaran = input.nextDouble();
            totalPembayaran += pembayaran; // Menambahkan pembayaran baru

            // Jika pembayaran masih kurang, beri opsi untuk lanjut atau batal
            if (totalPembayaran < totalTagihan) {
                double kekurangan = totalTagihan - totalPembayaran;
                System.out.println("Pembayaran kurang! Sisa tagihan: Rp " + String.format("%,.2f", kekurangan));

                // Pilihan lanjut atau batal
                System.out.print("Apakah ingin melanjutkan pembayaran? (ya/tidak): ");
                String pilihan = input.next().toLowerCase();

                if (pilihan.equals("tidak")) {
                    System.out.println("Transaksi dibatalkan. Silakan coba lagi nanti.");
                    return; // Menghentikan program
                }
            }
        }

        // Hitung kembalian jika ada
        double kembalian = totalPembayaran - totalTagihan;

        // Tampilkan struk pembayaran
        System.out.println("\n===== STRUK PEMBAYARAN =====");
        System.out.println("Nama Pelanggan   : " + namaPelanggan);
        System.out.println("Pemakaian Air    : " + pemakaian + " m³");
        System.out.println("Tarif per m³     : Rp " + String.format("%,.2f", tarifPerKubik));
        System.out.println("Total Tagihan    : Rp " + String.format("%,.2f", totalTagihan));
        System.out.println("Total Pembayaran : Rp " + String.format("%,.2f", totalPembayaran));

        // Cek apakah ada kembalian
        if (kembalian > 0) {
            System.out.println("Kembalian        : Rp " + String.format("%,.2f", kembalian));
        }

        System.out.println("Status           : Lunas");

        input.close();
    }
}