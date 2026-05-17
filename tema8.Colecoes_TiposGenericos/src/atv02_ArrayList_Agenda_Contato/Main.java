package atv02_ArrayList_Agenda_Contato;

public class Main {

    public static void main(String[] args) {

        Agenda agenda = new Agenda();

        Contato contato1 = new Contato("Ana");
        Contato contato2 = new Contato("Carlos");
        Contato contato3 = new Contato("Juliana");

        agenda.adicionarContato(contato1);
        agenda.adicionarContato(contato2);
        agenda.adicionarContato(contato3);

        agenda.listarContatos();
        agenda.removerContato(contato2);
        agenda.listarContatos();

    }
}