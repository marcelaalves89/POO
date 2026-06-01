package atv03_FlowLayout;

import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        //Agenda uma tarefa para ser executada na Event Dispatch Thread (EDT)
        //A EDT é a thread responsável por:desenhar janelas;responder cliques;
        //new Runnable()-Cria um objeto que implementa a interface Runnable.
        SwingUtilities.invokeLater(new Runnable() {
            //Tudo dentro do run() será executado pela EDT.
            public void run() {
                new ExemploFlowLayout();
            }
        });
    }
}
