package br.unifesspa.poo.atv01_janela;

import javax.swing.*;

public class Teste01 extends JFrame {

    public Teste01() {
        // Define o título da janela
        super("Primeira janela");

        this.setSize(320, 240);   // Define o tamanho da janela
        this.setVisible(true);    // Torna a janela visível
    }
    public static void main(String[] args) {
        Teste01 janela = new Teste01();
    }
}
