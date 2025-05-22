class Diretor extends Funcionario {
    private String setor;

    public Diretor(String nome, String setor) {
        super(nome);
        this.setor = setor;
    }

    public void tomarDecisao() {
        System.out.println(nome + " está tomando decisões no setor " + setor);
    }
}
