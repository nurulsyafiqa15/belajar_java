package bin.com.belajar;
import java.util.Scanner;

public class KasirDenganItemTetap {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Daftar barang dan harga
        String[] daftarBarang = {
            "Sabun", "Sikat Gigi", "Shampoo", "Pasta Gigi",
            "Minyak Goreng 1L", "Beras 5kg", "Gula Pasir 1kg",
            "Teh Celup", "Kopi Bubuk 200g", "Susu UHT 1L"
        };

        double[] hargaBarang = {
            5000, 12000, 25000, 15000, 18500, 65000, 14000, 7500, 22000, 20000
        };

        // Menampilkan daftar barang
        System.out.println("===== DAFTAR BARANG =====");
        for (int i = 0; i < daftarBarang.length; i++) {
            System.out.printf("%d. %-20s Rp %,.2f%n", (i + 1), daftarBarang[i], hargaBarang[i]);
        }
        System.out.println("=========================");

        // Memilih barang
        double totalBelanja = 0;
        int jumlahItem;
        
        System.out.print("Masukkan jumlah item yang dibeli: ");
        jumlahItem = scanner.nextInt();

        int[] jumlahBeli = new int[daftarBarang.length]; // Menyimpan jumlah tiap barang yang dibeli

        for (int i = 0; i < jumlahItem; i++) {
            System.out.print("Pilih nomor item (1-10): ");
            int pilihan = scanner.nextInt();

            if (pilihan < 1 || pilihan > daftarBarang.length) {
                System.out.println("Pilihan tidak valid, coba lagi.");
                i--; // Mengulang input jika salah
                continue;
            }

            System.out.print("Masukkan jumlah " + daftarBarang[pilihan - 1] + ": ");
            int qty = scanner.nextInt();
            jumlahBeli[pilihan - 1] += qty;
            totalBelanja += hargaBarang[pilihan - 1] * qty;
        }

        // Menampilkan struk belanja
        System.out.println("\n===== STRUK BELANJA =====");
        System.out.println("No  Nama Barang         Harga        Jumlah   Total");
        System.out.println("------------------------------------------------------");
        for (int i = 0; i < daftarBarang.length; i++) {
            if (jumlahBeli[i] > 0) {
                double totalHargaItem = hargaBarang[i] * jumlahBeli[i];
                System.out.printf("%-3d %-18s Rp %,-9.2f %-6d Rp %,-10.2f%n",
                        (i + 1), daftarBarang[i], hargaBarang[i], jumlahBeli[i], totalHargaItem);
            }
        }
        System.out.println("------------------------------------------------------");
        System.out.printf("Total Belanja: Rp %,.2f%n", totalBelanja);

        // Input jumlah uang yang dibayar
        double uangDibayar;
        do {
            System.out.print("Masukkan jumlah uang yang dibayar: ");
            uangDibayar = scanner.nextDouble();
            if (uangDibayar < totalBelanja) {
                System.out.println("Uang yang dibayar kurang. Silakan masukkan jumlah yang cukup.");
            }
        } while (uangDibayar < totalBelanja);

        // Menghitung kembalian
        double kembalian = uangDibayar - totalBelanja;
        System.out.printf("Kembalian: Rp %,.2f%n", kembalian);

        scanner.close();
    }
}