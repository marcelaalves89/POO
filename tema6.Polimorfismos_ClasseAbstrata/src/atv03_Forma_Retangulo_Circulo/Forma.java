package atv03_Forma_Retangulo_Circulo;

abstract class Forma {

    String nome;

    public Forma(String nome) {
        this.nome = nome;
    }

    public abstract double calcularArea();
}
