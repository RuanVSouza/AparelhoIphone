package entities;

public class ReprodutorMusical {

    private String musicaAtual;

    public ReprodutorMusical() {
    }

    public void tocar() {
        System.out.println("Tocando: " + musicaAtual);
    }

    public void pausar() {
            System.out.println(musicaAtual + " pausada");
    }

    public void selecionarMusica(String novaMusica) {
        this.musicaAtual = novaMusica;
        System.out.println("Musica selecionada: " + musicaAtual);
    }
}




