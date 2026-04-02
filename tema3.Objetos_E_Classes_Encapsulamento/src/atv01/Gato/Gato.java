package atv01.Gato;

class Gato {

    String nome;
    int qtdComidaDisponivel;
    boolean sono;

    void dormir() {
        sono = true;
        System.out.println(nome + " dormiu 😴");
    }

    void comer() {
        if (qtdComidaDisponivel > 0) {
            qtdComidaDisponivel -= 1;
            System.out.println(nome + " comeu. Comida restante: " + qtdComidaDisponivel);
        } else {
            System.out.println(nome + " está sem comida!");
        }
    }
}
