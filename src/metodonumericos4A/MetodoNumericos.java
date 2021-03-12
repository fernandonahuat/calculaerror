package metodonumericos4A;

import javax.swing.JOptionPane;

public class MetodoNumericos {

    public static void main(String[] args) {
        double valorRelativo, valorAbsoluto;
        
        valorRelativo = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el Valor Real"));
        JOptionPane.showMessageDialog(null, valorRelativo);
        valorAbsoluto = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el Valor Aproximado"));
        JOptionPane.showMessageDialog(null, valorAbsoluto);
        
        Errores errores = new Errores(valorRelativo, valorAbsoluto);
        
        JOptionPane.showMessageDialog(null, "El Error Absoluto es: " + errores.ErrorAbsoluto());
        JOptionPane.showMessageDialog(null, "El Error Relativo es: " + errores.ErrorRelativo());
        JOptionPane.showMessageDialog(null, "El Error Relativo Porcentual es: " + errores.ErrorRelativoPorcentual() + "%");

    }

}
