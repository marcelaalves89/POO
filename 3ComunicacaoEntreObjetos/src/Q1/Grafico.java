package Q1;

public class Grafico {
    public boolean preenchido;
    public char caractere;


    public Grafico(boolean preenchido, char caractere) {
        this.preenchido = preenchido;
        this.caractere = caractere;
    }


    void plota(int valor) {
        for (int i = 1; i < valor; i++) {
            //usa o operador ternário, que é uma forma compacta de escrever uma estrutura if-else
//            if (preenchido) {
//                System.out.print(caractere);
//            } else {
//                System.out.print(' ');
//            }
            System.out.print((preenchido) ? caractere : ' ');
        }
        System.out.println(caractere);// quebra de linha após plotar
    }
}

