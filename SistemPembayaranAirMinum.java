package bin.com.belajar;
import java.util.Scanner;

public class SistemPembayaranAirMinum {
    public static void main(String[] args) {
        @SuppressWarnings("resource")
        Scanner input = new Scanner(System.in);

        System.out.println("=== Sistem Pembayaran Air Minum ===");

        System.out.print("Masukkan ID Pelanggan            : ");
        String idPelanggan = input.nextLine();

        System.out.print("Masukkan Nama Pelanggan          : ");
        String nama = input.nextLine();

        System.out.print("Masukkan Nomor Telepon Pelanggan : ");
        String nomorTelepon = input.nextLine();

        System.out.print("Masukkan Alamat Pelanggan        : ");
        String alamat = input.nextLine();

        System.out.print("Masukkan Bulan Tagihan           : ");
        String bulan = input.nextLine();

        System.out.print("Masukkan Pemakaian Air (m3)      : ");
        double pemakaian = input.nextDouble();

        double tarif = tentukanTarif(pemakaian);
        String kategori = kategoriPemakaian(pemakaian);

        double biaya = hitungBiaya(pemakaian, tarif);
        double pajak = hitungPajak(biaya);
        double total = biaya + pajak;

        System.out.println("\n--- Rincian Pembayaran ---");
        System.out.println("ID Pelanggan            : " + idPelanggan);
        System.out.println("Nama Pelanggan          : " + nama);
        System.out.println("Nomor Telepon Pelanggan : " + nomorTelepon);
        System.out.println("Alamat Pelanggan        : " + alamat);
        System.out.println("Bulan Tagihan           : " + bulan);
        System.out.println("Kategori                : " + kategori);
        System.out.println("Pemakaian Air           : " + pemakaian + " m3");
        System.out.println("Tarif per m3            : Rp " + tarif);
        System.out.println("Biaya Air               : Rp " + biaya);
        System.out.println("Pajak 10%               : Rp " + pajak);
        System.out.println("Total Pembayaran        : Rp " + total);
    }
    public static double tentukanTarif(double pemakaian) {
        if (pemakaian <= 10) return 1000;
        else if (pemakaian <= 20) return 1500;
        else return 2000;
    }

    public static String kategoriPemakaian(double pemakaian) {
        if (pemakaian <= 10) return "Rendah";
        else if (pemakaian <= 20) return "Sedang";
        else return "Tinggi";
    }

    public static double hitungBiaya(double pemakaian, double tarif) {
        return pemakaian * tarif;
    }

    public static double hitungPajak(double biaya) {
        return biaya * 0.10;
    }
}