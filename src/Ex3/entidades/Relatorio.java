package Ex3.entidades;

public class Relatorio {
    private String titulo;
    private String corpo;
    private String rodape;

    public Relatorio(String titulo, String corpo, String rodape) {
        this.titulo = titulo;
        this.corpo = corpo;
        this.rodape = rodape;
    }

    @Override
    public String toString() {
        return "Relatório: titulo=" + titulo + " corpo=" + corpo + (rodape != null ? " rodape=" + rodape : "");
    }
}