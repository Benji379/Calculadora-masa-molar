package Modelo;

import java.awt.event.KeyEvent;
import javax.swing.JScrollPane;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

public class UIController {

    public static void removerBordeBlanco(JScrollPane scrollPane) {
        scrollPane.setBorder(new EmptyBorder(0, 0, 0, 0));
    }

    public static void limitacionEspacio(JTextField txtField, KeyEvent evt) {
        int key = evt.getKeyChar();
        boolean espacio = key == KeyEvent.VK_SPACE;

        if (espacio) {
            evt.consume();
        }
    }

    public static void limitacionNumeros(JTextField txtField, KeyEvent evt, int CantNumeros, String caracterAdicionalPermitir) {
        int key = evt.getKeyChar();
        boolean numeros = (key >= 48 && key <= 57) || key == 46; // Permitir números y el punto (.)
        boolean espacio = key == KeyEvent.VK_SPACE;

        String text = txtField.getText();
        boolean tienePunto = text.contains(caracterAdicionalPermitir);

        if (!numeros || (tienePunto && key == 46) || espacio) {
            evt.consume();
        } else {
            if (text.length() >= CantNumeros) {
                evt.consume();
            }
        }
    }

}
