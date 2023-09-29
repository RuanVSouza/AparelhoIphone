import entities.AparelhoTelefonico;
import entities.NavegadorInternet;
import entities.ReprodutorMusical;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        NavegadorInternet nav = new NavegadorInternet();
        ReprodutorMusical rep = new ReprodutorMusical();
        AparelhoTelefonico apt = new AparelhoTelefonico();

        /************* Navegador  ***************************************/
        System.out.print("Digite a pagina que deseja encontrar: ");
        String url = sc.next();
        nav.adicionarNovaPagina(url);
        nav.exibirPagina();
        nav.atualizarPagina(true);



        /************* Aparelho telefonico *****************************************/
         System.out.println("*************************************************************");
        System.out.println("Digite o numero para quem deseja ligar: ");
        Integer numero = sc.nextInt();
            apt.Ligar(numero);

        System.out.println("Deseja atender a ligação(sim/nao)? ");
        String status = sc.next().toLowerCase();
            if (status.equals("nao")) {
                apt.Atender(status);
                apt.iniciarCorreioVoz();
            }else if(status.equals("sim")){
                apt.Atender(status);
            }



        /************* Aparelho telefonico *****************************************/
        System.out.println("*************************************************************");
        System.out.print("Digite a musica que deseja ouvir: ");
        String novaMusica = sc.next();
        rep.selecionarMusica(novaMusica);
        rep.tocar();
        rep.pausar();
    }
}