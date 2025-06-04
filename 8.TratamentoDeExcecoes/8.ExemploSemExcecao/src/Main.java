//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Conta conta = new Conta(100.0, 500.0);

        // Tentativas de depósito com retorno de mensagem
        System.out.println(conta.deposita(-50.0)); // valor inválido
        System.out.println(conta.deposita(0));     // valor inválido
        System.out.println(conta.deposita(200.0)); // valor válido

        // Exibe o saldo final
        System.out.println("Saldo atual: R$" + conta.getSaldo());
    }
}