import java.util.ArrayList;
import java.util.List;

public class Universidade {
    private String descricao;
    private List<Departamento> departamentos;

    public Universidade(String descricao) {
        this.descricao = descricao;
        this.departamentos = new ArrayList<>();//Inicia 1vez
    }
    public void setDescricao(String descricao){
        this.descricao = descricao;
    }
    public String getDescricao(){
        return descricao;
    }
    public void setDepartamentos(List<Departamento> departamento){
        this.departamentos = departamento;
    }
    public List<Departamento> getDepartamentos(){
        return departamentos;
    }

    public void adicionarDepartamento(String descricao) {
        departamentos.add(new Departamento(descricao));
    }
    //A responsabilidade de listar os departamentos pertence à entidade que os contém,
    // ou seja, a Universidade.
    public void listarDepartamentos(){
        System.out.println("Departamentos da universidade " + descricao + ":");
        for (Departamento departamento : departamentos) {
            System.out.println(" - " + departamento.getDescricao());
        }
    }
}
