package atv03_ArrayList_ListaTarefas_Tarefa;

public class Main {

    public static void main(String[] args) {
        ListaTarefas lista = new ListaTarefas();

        Tarefa tarefa1 = new Tarefa("Estudar Java");
        Tarefa tarefa2 = new Tarefa("Fazer atividade de POO");
        Tarefa tarefa3 = new Tarefa("Revisar conteúdo da aula");

        lista.adicionarTarefa(tarefa1);
        lista.adicionarTarefa(tarefa2);
        lista.adicionarTarefa(tarefa3);

        lista.listarTarefas();
        lista.removerTarefa(tarefa2);
        lista.listarTarefas();
    }
}