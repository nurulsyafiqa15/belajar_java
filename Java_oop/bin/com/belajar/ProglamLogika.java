package bin.com.belajar;

import java.util.Scanner;
public class ProglamLogika {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input tahun dari pengguna
        System.out.print("Masukkan tahun: ");
        int tahun = scanner.nextInt();

        // Logika if untuk menentukan tahun kabisat
        if ((tahun % 4 == 0 && tahun % 100 != 0) || (tahun % 400 == 0)) {
            System.out.println(tahun + " adalah tahun kabisat.");
        } else {
            System.out.println(tahun + " bukan tahun kabisat.");
        }

        scanner.close();
    }
}
    

