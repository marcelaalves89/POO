package atv03_Forma_Retangulo_Circulo;

public class Main {

    public static void main(String[] args) {

        Forma forma1 = new Retangulo("Retângulo", 5, 4);
        Forma forma2 = new Circulo("Círculo", 3);

        System.out.println("Área do " + forma1.nome + ": " + forma1.calcularArea());
        System.out.println("Área do " + forma2.nome + ": " + forma2.calcularArea());
    }
}
