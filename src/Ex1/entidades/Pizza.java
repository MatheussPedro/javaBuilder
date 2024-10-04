package Ex1.entidades;

import java.util.List;

public class Pizza {
    private String massa;
    private String tamanho;
    private List<String> ingredientes;

    public Pizza(String massa, String tamanho, List<String> ingredientes) {
        this.massa = massa;
        this.tamanho = tamanho;
        this.ingredientes = ingredientes;
    }

    @Override
    public String toString() {
        return "Pizza: massa=" + massa + ", tamanho=" + tamanho + ", ingredientes=" + ingredientes;
    }
}

