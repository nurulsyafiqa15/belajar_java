package bin.com.belajar;

import java.util.Scanner;

public class ProglamPenjualan {
   public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Kategori barang dan daftar barang di setiap kategori
        String[] kategori = {"Pangan", "Kebutuhan Rumah", "Elektronik"};
        
        String[][] barang = {
            {"Beras", "Gula", "Minyak Goreng", "Sayur", "Telur"}, // Kategori Pangan
            {"Sabun Cuci", "Sikat Gigi", "Shampoo", "Tissue"},    // Kebutuhan Rumah
            {"TV", "Kulkas", "AC", "Laptop", "Blender"}           // Kategori Elektronik
        };
        
        double[][] hargaBarang = {
            {12000, 15000, 18000, 5000, 20000}, // Harga per unit untuk kategori Pangan
            {8000, 5000, 15000, 10000},         // Harga per unit untuk kategori Kebutuhan Rumah
            {2500000, 5000000, 7000000, 8000000, 1500000} // Harga per unit untuk kategori Elektronik
        };

        // Variabel untuk total pembayaran
        double totalPembayaran = 0;

        System.out.println("==== Program Penjualan Barang di Pasar ====");
        
        // Menampilkan kategori barang
        System.out.println("\nPilih Kategori Barang:");
        for (int i = 0; i < kategori.length; i++) {
            System.out.println((i + 1) + ". " + kategori[i]);
        }
        
        // Pilih kategori barang
        System.out.print("\nMasukkan nomor kategori (1-3): ");
        int pilihanKategori = scanner.nextInt() - 1;
        scanner.nextLine(); // untuk menangkap baris kosong setelah input angka

        if (pilihanKategori < 0 || pilihanKategori >= kategori.length) {
            System.out.println("Pilihan kategori tidak valid!");
              
        }

        System.out.println("\nDaftar Barang di Kategori " + kategori[pilihanKategori] + ":");
        for (int i = 0; i < barang[pilihanKategori].length; i++) {
            System.out.println((i + 1) + ". " + barang[pilihanKategori][i] + " - Rp " + hargaBarang[pilihanKategori][i] + "/unit");
        }

        // Loop untuk memilih barang dan jumlahnya
        while (true) {
            System.out.print("\nMasukkan nomor barang yang ingin dibeli (1-" + barang[pilihanKategori].length + ", atau ketik 'selesai' untuk keluar): ");
            String input = scanner.nextLine();

            if (input.equalsIgnoreCase("selesai")) {
                break;
            }

            try {
                int pilihanBarang = Integer.parseInt(input) - 1;

                if (pilihanBarang < 0 || pilihanBarang >= barang[pilihanKategori].length) {
                    System.out.println("Pilihan barang tidak valid. Silakan coba lagi.");
                    continue;
                }

                System.out.print("Masukkan jumlah barang yang ingin dibeli: ");
                int jumlah = scanner.nextInt();
                scanner.nextLine(); // untuk menangkap baris kosong setelah input angka

                // Hitung total harga untuk barang yang dibeli
                double totalHarga = hargaBarang[pilihanKategori][pilihanBarang] * jumlah;
                totalPembayaran += totalHarga;

                // Tampilkan rincian barang yang dibeli
                System.out.println("\n===== Rincian Pembelian =====");
                System.out.println("Nama Barang: " + barang[pilihanKategori][pilihanBarang]);
                System.out.println("Harga per Unit: Rp " + hargaBarang[pilihanKategori][pilihanBarang]);
                System.out.println("Jumlah: " + jumlah);
                System.out.println("Total Harga: Rp " + totalHarga);
                
            } catch (NumberFormatException e) {
                System.out.println("Input tidak valid. Silakan coba lagi.");
                scanner.nextLine(); // clear input buffer
            }
        }

        // Menampilkan total pembayaran
        System.out.println("\n===== Total Pembayaran =====");
        System.out.println("Total Harga: Rp " + totalPembayaran);

        // Opsi Pembayaran
        System.out.println("\nPilih Metode Pembayaran:");
        System.out.println("1. Tunai");
        System.out.println("2. Kartu Kredit");
        System.out.print("Masukkan pilihan (1-2): ");
        int metodePembayaran = scanner.nextInt();

        if (metodePembayaran == 1) {
            System.out.println("Pembayaran berhasil dengan tunai. Terima kasih!");
        } else if (metodePembayaran == 2) {
            System.out.println("Pembayaran berhasil dengan kartu kredit. Terima kasih!");
        } else {
            System.out.println("Metode pembayaran tidak valid!");
        }

        scanner.close();
    }
}
   