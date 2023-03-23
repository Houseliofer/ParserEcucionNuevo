package org.main;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class frmParser extends JFrame {
    private JPanel panel;
    private JTextField textField1;
    private JButton RESOLVERButton;
    private JButton LIMPIARButton;
    private JLabel lblResultado;

    public frmParser(){
        RESOLVERButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String texto = textField1.getText();
                if(texto.equals(""))
                    JOptionPane.showMessageDialog(null, "Por favor ingresa algo", "Mensaje", JOptionPane.WARNING_MESSAGE);
                else {

                    Parseador Parseador = new Parseador();

                    String p = Parseador.obtenerOperador(texto);

                    RESOLVERButton.setEnabled(false);
                    textField1.setEnabled(false);
                    lblResultado.setText("El Operador es: " + String.valueOf(p));
                }
            }
        });
        LIMPIARButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                RESOLVERButton.setEnabled(true);
                textField1.setText("");
                textField1.setEnabled(true);
                lblResultado.setText("");
            }
        });
        setLocationRelativeTo(null);
    }

    public static void main(String[] args) {
        frmParser panel = new frmParser();
        panel.setContentPane(new frmParser().panel);
        panel.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        panel.setVisible(true);
        panel.pack();
    }
}

