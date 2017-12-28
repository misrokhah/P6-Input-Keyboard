import javax.swing.JOptionPane;

public class GetJOptionPane {
    public static void main(String[] args) {
        String nim, nama, tempat, tgllahir;

        nama= JOptionPane.showInputDialog("Masukan  nama  anda : ");
        nim= JOptionPane.showInputDialog("Masukan  nim  anda : ");
        tempat= JOptionPane.showInputDialog("Masukan  Tempat Lahir  anda : ");
        tgllahir= JOptionPane.showInputDialog("Masukan  Tanggal Lahir  anda : ");

        
        String nama = " Hello " + nama +\n ;
        JOptionPane.showMessageDialog(null, nama, nim, tempat, tgllahir);  
    }
}