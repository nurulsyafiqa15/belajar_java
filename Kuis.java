package bin.com.belajar;
    import java.util.Scanner;

public class Kuis {
    @SuppressWarnings("resource")
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int skor = 0;

        System.out.println("Selamat datang di kuis!");
        System.out.println("Pertanyaan 1: Ibu kota Indonesia adalah?");
        System.out.println("A. Jakarta");
        System.out.println("B. Bandung");
        System.out.println("C. Surabaya");
        System.out.print("Masukkan jawaban: ");
        String jawaban1 = scanner.nextLine();
        if (jawaban1.equalsIgnoreCase("A")) {
            skor++;
            System.out.println("Jawaban benar!");
        } else {
            System.out.println("Jawaban salah!");
        }

        System.out.println("Pertanyaan 2: Siapa presiden pertama Indonesia?");
        System.out.println("A. Soekarno");
        System.out.println("B. Soeharto");
        System.out.println("C. Jokowi");
        System.out.print("Masukkan jawaban: ");
        String jawaban2 = scanner.nextLine();
        if (jawaban2.equalsIgnoreCase("A")) {
            skor++;
            System.out.println("Jawaban benar!");
        } else {
            System.out.println("Jawaban salah!");
        }

        System.out.println("Skor kamu: " + skor);
    }
}

