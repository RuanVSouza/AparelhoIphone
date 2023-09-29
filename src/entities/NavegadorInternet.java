package entities;

public class NavegadorInternet {

    private String paginaAtual;

    public NavegadorInternet() {
    }

    public void exibirPagina(){
        if(paginaAtual != null){
            System.out.println("Exibindo pagina atual: " + paginaAtual);
        }else {
            System.out.println("Selecione uma pagina");
        }
    }

    public void adicionarNovaPagina(String url){
        if(url != null ){
            this.paginaAtual = url;
            System.out.println("Página carregada: " + paginaAtual);
        } else {
            System.out.println("URL inválida. Nenhuma página carregada.");
        }
    }

    public void atualizarPagina(boolean statusPagina){
        if(statusPagina){
            System.out.println("Pagina recarregada");
        }
    }
}


