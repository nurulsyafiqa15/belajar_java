package bin.com.belajar;

import java.util.Scanner;

public class Latihan4 {
    public static void main(String[] args) {
        int idPasien;
        String namaPasien, alamatPasien, keluhan;
        @SuppressWarnings("resource")
        Scanner keyboard = new Scanner (System.in);
        System.out.println("input Data Pasien");
        System.out.println("-----------------");
        System.out.print("ID Pasien : ");
        idPasien = keyboard.nextInt();
        System.out.print("Nama Pasien : ");
        namaPasien = keyboard.next();
        System.out.print("Alamat Pasien : ");
        alamatPasien = keyboard.next();
        System.out.print("Keluhan : ");
        keluhan = keyboard.next();
        //Menampikan data pasien
        System.out.println("Output Data Pasien");
        System.out.println("------------------");
        System.out.println("id Pasien : " + idPasien);
        System.out.println("Nama Pasien : " + namaPasien);
        System.out.println("Alamat Pasien : " + alamatPasien);
        System.out.println("Keluhan : " + keluhan);
    }
    
}
