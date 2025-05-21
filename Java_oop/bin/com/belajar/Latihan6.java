package bin.com.belajar;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Latihan6 {
    public static void main(String[] args) {
        String nama;
        int umur;

        // membuat objek InputStreamReader
        InputStreamReader isr = new InputStreamReader(System.in);
        // membuat objek BufferedReader
        BufferedReader br = new BufferedReader(isr);

        try {
            // mengisi variabel nama dengan BufferedReader
            System.out.print("Inputkan nama Anda : ");
            nama = br.readLine();

            System.out.print("Inputkan umur Anda : ");
            umur = Integer.parseInt(br.readLine());

            // Tampilkan output isi variabel nama dan umur
            System.out.println("Nama Anda adalah " + nama);
            System.out.println("Umur Anda adalah " + umur);

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
