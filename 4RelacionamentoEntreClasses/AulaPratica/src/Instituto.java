import java.util.ArrayList;
import java.util.List;
import java.util.ArrayList;
import java.util.List;

public class Instituto {
    private String descricao;
    private List<Departamento> departamentos;

    public Instituto(String descricao) {
        this.descricao = descricao;
        this.departamentos = new ArrayList<>();
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
    public void adicionarDepartamento(Departamento departamento) {
        departamentos.add(departamento);
        System.out.println("Departamentos do Instituto: "+descricao);
        for (Departamento d : departamentos) {
            System.out.println(" - " + departamento.getDescricao());
        }
    }
}
