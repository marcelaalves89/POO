
package view; // Define que esta classe pertence ao pacote view

import controller.PessoaController; // Importa a classe de controle
import model.Pessoa; // Importa a classe Pessoa

import javax.swing.*; // Importa os componentes gráficos do Swing

// Classe da tela que herda funcionalidades de JFrame
public class JanelaCadastrarPessoa extends JFrame {
    // Objeto responsável por controlar as ações da aplicação
    private PessoaController controller = new PessoaController();
    // Rótulo que exibirá o texto "Nome"
    private JLabel labelNome;
    // Botão para cadastrar uma pessoa
    private JButton botaoCadastrar;
    // Botão para consultar uma pessoa
    private JButton botaoConsultar;
    // Campo de texto para digitar o nome
    private JTextField textoNome;
    // Área de texto para exibir resultados
    private JTextArea textoResultado;
    // Construtor da janela
    public JanelaCadastrarPessoa() {
        // Chama o metodo responsável por montar a interface
        initComponents();
    }
    // Metodo responsável por criar e configurar todos os componentes da tela
    private void initComponents() {
        // Cria o rótulo Nome
        labelNome = new JLabel();
        // Cria o campo de texto Nome
        textoNome = new JTextField();
        // Cria o campo de texto Idade
        botaoCadastrar = new JButton();
        // Cria o botão Consultar
        botaoConsultar = new JButton();
        // Cria a área de resultados
        textoResultado = new JTextArea();
        // Fecha o programa ao clicar no X da janela
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        // Define o título da janela
        setTitle("Cadastro de Pessoa");
        // Define que os componentes serão posicionados manualmente
        setLayout(null);
        // Define o texto do rótulo Nome
        labelNome.setText("Nome:");
        // Define a posição e o tamanho do componente/rótulo.
        //30 = posição horizontal (X) - O rótulo ficará a 30 pixels da esquerda.
        //30 = posição vertical (Y) - O rótulo ficará a 30 pixels do topo.
        //60 = largura - Terá 60 pixels de largura.
        //25 = altura - Terá 25 pixels de altura.
        labelNome.setBounds(30, 30, 60, 25); //Onde fica?
        // Adiciona o rótulo Nome na tela
        add(labelNome);//Mostra na tela.
        // Define o tamanho do campo Nome
        textoNome.setColumns(20);
        // Adiciona o campo Nome na tela
        textoNome.setBounds(90, 30, 180, 25);
        add(textoNome);
        // Define o texto do botão
        botaoCadastrar.setText("Cadastrar");
        // Programa o que acontecerá ao clicar no botão
        botaoCadastrar.addActionListener(evt -> {
            // Obtém o nome digitado
            String nome = textoNome.getText();
            // Verifica se o campo está vazio
//            if (nome.trim().isEmpty()) {
//                JOptionPane.showMessageDialog(
//                        this,
//                        "Por favor, informe um nome!"
//                );
//                return;
//            }
            // Envia os dados para o Controller realizar o cadastro
            controller.cadastrarPessoa(nome);
            // Exibe mensagem de sucesso
            JOptionPane.showMessageDialog(
                    this,
                    "Pessoa cadastrada com sucesso!"
            );
        });
        // Adiciona o botão Cadastrar na tela
        botaoCadastrar.setBounds(30, 120, 110, 30);
        add(botaoCadastrar);
        // Define o texto do botão
        botaoConsultar.setText("Consultar");
        // Programa o que acontecerá ao clicar no botão Consultar
        botaoConsultar.addActionListener(evt -> {
            // Obtém o nome digitado
            String nome = textoNome.getText();
            // Solicita ao Controller a consulta da pessoa
            Pessoa pessoa = controller.consultarPessoa(nome);
            // Verifica se a pessoa foi encontrada
            if (pessoa != null) {
                // Exibe os dados encontrados
                textoResultado.setText(
                        "ID: " + pessoa.getId()
                                + "\nNome: " + pessoa.getNome()
                );

            } else {
                // Exibe mensagem caso não encontre a pessoa
                textoResultado.setText(
                        "Pessoa não encontrada."
                );
            }
        });
        // Adiciona o botão Consultar na tela
        botaoConsultar.setBounds(160, 120, 110, 30);
        add(botaoConsultar);
        // Define a quantidade de colunas da área de texto
        textoResultado.setColumns(20);
        // Define a quantidade de linhas da área de texto
        textoResultado.setRows(5);
        // Adiciona a área de resultado na tela
        textoResultado.setBounds(30, 170, 240, 100);
        add(textoResultado);
        // Define o tamanho da janela
        setSize(330, 350);
        // Centraliza a janela na tela
        setLocationRelativeTo(null);
    }
}