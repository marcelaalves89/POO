package atv02_Funcionario_FuncionarioCLT_FuncionarioFreelancer;

class FuncionarioFreelancer extends Funcionario {

    double horasTrabalhadas;
    double valorHora;

    public FuncionarioFreelancer(String nome, double horasTrabalhadas, double valorHora) {
        super(nome);
        this.horasTrabalhadas = horasTrabalhadas;
        this.valorHora = valorHora;
    }

    @Override
    public double calcularSalario() {
        return horasTrabalhadas * valorHora;
    }
}
