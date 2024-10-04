import Ex1.builder.PizzaBuilder;
import Ex3.builder.RelatorioBuilder;
import Ex2.builder.VeiculoBuilder;
import Ex1.entidades.Pizza;
import Ex3.entidades.Relatorio;
import Ex2.entidades.Veiculo;

public class Main {
    public static void main(String[] args) {
        Pizza pizza = new PizzaBuilder()
                .setMassa("Fina")
                .setTamanho("grande")
                .addIngrediente("Queijo")
                .addIngrediente("tomate")
                .build();

        System.out.println(pizza);
        System.out.println();

        Veiculo veiculo = new VeiculoBuilder()
                .setTipo("Carro")
                .setCor("vermelho")
                .setRodas(4)
                .build();

        System.out.println(veiculo);
        System.out.println();

        Relatorio relatorio = new RelatorioBuilder()
                .setTitulo("Juliano")
                .setCorpo("Melhor")
                .setRodape("Professor")
                .build();

        System.out.println(relatorio);
    }
}