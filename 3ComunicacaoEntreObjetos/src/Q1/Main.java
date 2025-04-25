package Q1;

public class Main {
    public static void main (String args[]){
        Circulo circ = new Circulo (5,3,10);
        System.out.println("Identidade: " + circ);


        Grafico g1 = new Grafico(true, '#');
//        g1.plota(1);
//        g1.plota(2);
//        g1.plota(4);
//        g1.plota(8);


        Grafico g2 = new Grafico(false, '*');
//        g2.plota(4);
//        g2.plota(5);
//        g2.plota(10);


        Potencia p = new Potencia(1,7);
        p.conecta(g1);
        p.apresenta();
        p.conecta(g2);
        p.apresenta();
    }
}
