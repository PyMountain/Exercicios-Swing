package br.ufsc.ine5605.InterfaceGrafica;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;

public class GerenciadorBotoes implements ActionListener{
    @Override
    public void actionPerformed(ActionEvent e){
        JOptionPane.showMessageDialog(null, "Botao Pressionado: " + 
                e.getActionCommand(), "titulo", 2);
    }
}
