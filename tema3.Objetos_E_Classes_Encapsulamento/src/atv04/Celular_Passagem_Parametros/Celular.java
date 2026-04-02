package atv04.Celular_Passagem_Parametros;

public class Celular {

    // Atributos
    String marca;
    double preco;

    // Construtor com 2 parâmetros
    public Celular(String marca, double preco) {
        this.marca = marca;
        this.preco = preco;
    }

    // Metodo para exibir dados
    void mostrarDados() {
        System.out.println("Marca: " + marca);
        System.out.println("Preço: R$ " + preco);
    }
}
