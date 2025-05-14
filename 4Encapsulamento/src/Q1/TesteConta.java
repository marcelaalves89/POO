package Q1;

class TestaConta {
    public static void main(String[] args) {
        Cliente cliente = new Cliente("Flavia");
        Conta conta1 = new Conta(101, 1500.0, cliente);

        conta1.saca(1000);
        System.out.println("Nome do Cliente: "+cliente.nome +" Saldo: "+conta1.getSaldo());
        cliente.setNome("Juliana");
        System.out.println(cliente.getNome());
        cliente.setNome("Jamil");
        System.out.println(conta1.getTitular().getNome());

        Cliente novaCliente1 = new Cliente("Fatima");
        conta1.setTitular(novaCliente1);
        System.out.println(conta1.getTitular().getNome());
        int saqueFatima = 100;
        conta1.saca(saqueFatima);
        System.out.println(conta1.getTitular().getNome()+" sacou " +saqueFatima+ " e agora possui saldo de " + conta1.getSaldo());




    }
}

