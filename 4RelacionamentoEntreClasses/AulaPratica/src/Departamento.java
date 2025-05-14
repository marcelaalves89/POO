
import java.util.ArrayList;
import java.util.List;

public class Departamento {
    private String descricao;
    private List<Professor> professor;

    public Departamento(String descricao) {
        this.descricao = descricao;
        this.professor = new ArrayList<>();
    }
    public void setDescricao(String descricao){
        this.descricao = descricao;
    }
    public String getDescricao(){
        return descricao;
    }
    public void adicionarProfessor(Professor p) {
        professor.add(p);
        System.out.println("Faculdade: "+descricao+" da professor(a): "+professor.get(0).getNome());
    }
}
