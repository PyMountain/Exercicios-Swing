package br.ufsc.ine5605.InterfaceGrafica;

import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class InterfaceGrafica extends JFrame{
    private JLabel label;
    private JButton botao;
    private JButton botao2;
    private JTextField tfNome;
    
    public InterfaceGrafica(){
        
        super("Primeira tela!");
        
        Container container = getContentPane();
        container.setLayout(new FlowLayout());
        
        label = new JLabel();
        botao = new JButton();
        botao2 = new JButton();
        
        label.setText("clica aqui");
        botao.setText("direita");
        botao.setActionCommand("SOLNORABO");
        botao2.setText("esquerda");
        botao2.setActionCommand("MALDAD");
        
        GerenciadorBotoes btnManager = new GerenciadorBotoes();
        botao.addActionListener(btnManager);
        botao2.addActionListener(btnManager);
        
        container.add(label);
        container.add(botao);
        container.add(botao2);
        
        setSize(360, 150);
        
        setVisible( true );
        
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
    }
}
