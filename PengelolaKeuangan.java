package bin.com.belajar;

import java.util.Scanner;

public class PengelolaKeuangan {
    @SuppressWarnings("resource")
    public static void main(String[] args) {
        Scanner Scanner = new Scanner(System.in);
        double saldo = 0;

        while (true) {
            System.out.println("Pengelola Keuangan");
            System.out.println("1. Setor uang");
            System.out.println("2. Tarik uang");
            System.out.println("3. Cek saldo");
            System.out.println("4. Keluar");
            System.out.print("Pilih menu: ");
            int pilihan = Scanner.nextInt();

            switch (pilihan) {
                case 1:
                    System.out.print("Masukkan jumlah uang yang ingin disetor: ");
                    double setor = Scanner.nextDouble();
                    saldo += setor;
                    System.out.println("Uang berhasil disetor!");
                    break;
                case 2:
                    System.out.print("Masukkan jumlah uang yang ingin ditarik: ");
                    double tarik = Scanner.nextDouble();
                    if (tarik <= saldo) {
                        saldo -= tarik;
                        System.out.println("Uang berhasil ditarik!");
                    } else {
                        System.out.println("Saldo tidak mencukupi!");
                    }
                    break;
                case 3:
                    System.out.println("Saldo kamu: " + saldo);
                    break;
                case 4:
                    System.out.println("Terima kasih!");
                    return;
                default:
                    System.out.println("Pilihan tidak valid!");
            }
        }
    }
}