//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        // Associação
        Professor prof = new Professor("Marcela Alves");
        Disciplina disciplina = new Disciplina("POO");
        prof.ministraAula(disciplina);

        // Agregação
        Departamento dti = new Departamento("FEC");
        dti.adicionarProfessor(prof);

        //Composição
        Universidade universidade = new Universidade("Unifesspa");
        universidade.adicionarDepartamento(dti.getDescricao());
        universidade.listarDepartamentos();

        //Composição - Add Instituto
        Instituto instituto = new Instituto("IGE");
        instituto.adicionarDepartamento(dti);

    }
}