import javax.swing.JOptionPane;

public class DemoJOptionPane {
    public static void main(String[] args) {
        String nama;

        nama= JOptionPane.showInputDialog("Inputkan nama  anda : ");
        String msg = " Hello " + nama + "!";
        JOptionPane.showMessageDialog(null, msg);  
    }
}