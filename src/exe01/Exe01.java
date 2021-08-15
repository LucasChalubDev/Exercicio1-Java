package exe01;

import javax.swing.JOptionPane;
        
public class Exe01 {
    public static void main(String[] args) {
        int numero;
        String numeroS;
        String result = "";
        
        numeroS = JOptionPane.showInputDialog("Digite o numero: ");
        numero = Integer.parseInt(numeroS);
        
        for (int i = 0; i <= numero; i ++){
            for (int j = 1; j <= i; j ++){
                result += ""+j;
            }
            result += "\n";
        }
        JOptionPane.showMessageDialog(null, result);
    }
}