package bin.com.belajar;
import javax.swing.JOptionPane;
public class Latihan5 {
    public static void main(String[] args) {
        String nama = "nama";
        nama = JOptionPane.showInputDialog("Silahkan masukan nama Anda");
        String msg = "Hello " + nama + "!";
        JOptionPane.showMessageDialog(null, msg);

        
    }


}
