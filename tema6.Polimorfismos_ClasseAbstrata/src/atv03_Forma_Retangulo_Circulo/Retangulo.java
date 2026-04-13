package atv03_Forma_Retangulo_Circulo;

class Retangulo extends Forma {

    double base;
    double altura;

    public Retangulo(String nome, double base, double altura) {
        super(nome);
        this.base = base;
        this.altura = altura;
    }

    @Override
    public double calcularArea() {
        return base * altura;
    }
}
