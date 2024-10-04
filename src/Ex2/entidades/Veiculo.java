package Ex2.entidades;

public class Veiculo {
    private String tipo;
    private String cor;
    private int rodas;

    public Veiculo(String tipo, String cor, int rodas) {
        this.tipo = tipo;
        this.cor = cor;
        this.rodas = rodas;
    }

    @Override
    public String toString() {
        return "Veículo: tipo=" + tipo + ", cor=" + cor + ", rodas=" + rodas;
    }
}