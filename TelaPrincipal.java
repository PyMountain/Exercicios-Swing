package br.ufsc.ine5605.InterfaceGrafica;

import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class TelaPrincipal extends JFrame{
    
    private JLabel lbTexto;
    private JButton btOK;
    private JButton btCancel;
    private JTextField tfNome;        
    private GerenciadorBotoes btManager;
    
    public TelaPrincipal(){
        super("TELA PRINCIPAL!");
        btManager = new GerenciadorBotoes();
        configuraTela();
    }

    private void configuraTela() {
        Container container = getContentPane();
        container.setLayout(new GridBagLayout());
        
        GridBagConstraints cons = new GridBagConstraints();
        
        //configura o label de nome
        lbTexto = new JLabel("Nome: ");
        cons.gridx = 0;
        cons.gridy = 0;
        container.add(lbTexto, cons);
        
        //configura espaço para texto
        tfNome = new JTextField();
        cons.gridx = 1;
        cons.gridy = 0;
        cons.fill = GridBagConstraints.HORIZONTAL;
        container.add(tfNome, cons);
        
        //configura botão ok
        btOK = new JButton("OK");
        cons.gridx = 0;
        cons.gridy = 1;
        btOK.addActionListener(btManager);
        container.add(btOK, cons);
        
        //configura botão cancel
        btCancel = new JButton("CANCELAR");
        cons.gridx = 1;
        cons.gridy = 1;
        btCancel.addActionListener(btManager);
        container.add(btCancel, cons);
        
        //configura frame
        setSize(460, 250);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setVisible(true);
    }
    
    public class GerenciadorBotoes implements ActionListener{
        @Override
        public void actionPerformed(ActionEvent e){
            if(e.getSource().equals(btOK) && !tfNome.getText().isEmpty()){
                Controlador.getInstancia().addNome(tfNome.getText());
            } else if (e.getSource().equals(btCancel)){
                System.out.println("cancelado!");
                tfNome.setText(null);
            } else {
                System.out.println("Vazio...");
            }
        }
    }
}
