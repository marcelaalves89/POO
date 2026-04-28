package atv04_EquipametosInteligentes_Heranca_Multipla;

public class Main {

    public static void main(String[] args) {

        ProjetorInteligente projetor = new ProjetorInteligente();

        Ligavel equipamentoLigavel = projetor;
        equipamentoLigavel.ligar();

        Conectavel equipamentoConectavel = projetor;
        equipamentoConectavel.conectarInternet();

    }

}
