package entities;

import java.util.Objects;

public class AparelhoTelefonico {

    private String statusLigando;

    public AparelhoTelefonico() {}

    public void Ligar(Integer numero){
            System.out.println("Ligando para " + numero);
        }


    public void Atender(String status){
       if(status.equals("sim")){
           System.out.println("Ligação atendida");
       }else if(status.equals("nao")){
           System.out.println("Ligação recusada");
       }else{
           System.out.println("Continua tocando...");
       }
    }
    public void iniciarCorreioVoz(){
          System.out.println("Iniciando gravação para correio de voz");
    }
}
