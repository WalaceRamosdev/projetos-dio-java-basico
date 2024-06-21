package AparelhoTelefonico;

public class Chamada implements Atendendo, CorreioDeVoz, Ligacao {

    public void atender() {
        System.out.println("Recebendo uma ligacao");
    }

    public void iniciarCorreioDeVoz() {
        System.out.println("Iniciando Correio de Voz");
    }

    public  void ligar() {
        System.out.println("Iniciando uma ligacao");
    }
    
}
