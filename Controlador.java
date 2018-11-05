package br.ufsc.ine5605.InterfaceGrafica;

public class Controlador {
    private TelaPrincipal tela;
    private static Controlador ctrl;
    
    private Controlador(){
        tela = new TelaPrincipal();
    }
    
    public void inicia(){
        tela.setVisible(true);
    }
    
    public static Controlador getInstancia(){
        if(ctrl == null){
            ctrl = new Controlador();
        }
        
        return ctrl;
    }
    
    public void addNome(String texto){
        System.out.println("Nome: "+texto+" adicionado!!");
    }
}
