package bin.com.belajar;
//Latihan method non void
public class Mobilku {
    String warna;
    int tahun_produksi;
    int nomorMesin;
    int nomorRangka;
    //Method mengisi variabel instance
    void isi (String warna, int tahun_produksi, int nomorMesin, int nomorRangka){
        this.warna = warna;
        this.tahun_produksi = tahun_produksi;
        this.nomorMesin = nomorMesin;
        this.nomorRangka = nomorRangka;
    }
    //Method menampilkan isi variabel
    String ambil_warna (){
            return warna;
    }
    int tahun_Produksi(){
         return tahun_produksi;
    }
    int ambil_nomorMesin (){
        return nomorMesin;
    }
    int ambil_nomorRangka (){
        return nomorRangka;
    }
    public static void main(String[] args) {
        Mobilku mobilNiaga = new Mobilku();
        //Proses pemanggilan method void
        mobilNiaga.isi("putih", 2018, 23456, 89567);
        System.out.println("warna : " + mobilNiaga.ambil_warna());
        System.out.println("Tahun Produksi : " + mobilNiaga.tahun_Produksi());
        System.out.println("Nomor Mesin : " + mobilNiaga.ambil_nomorMesin());
        System.out.println("Nomor Rangka : " + mobilNiaga.ambil_nomorRangka());

    }









































}
