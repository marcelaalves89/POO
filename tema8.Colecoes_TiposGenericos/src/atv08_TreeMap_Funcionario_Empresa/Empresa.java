package atv08_TreeMap_Funcionario_Empresa;
import java.util.Map;
import java.util.TreeMap;

class Empresa {
    private TreeMap<Integer, Funcionario> funcionarios;

    public Empresa() {
        funcionarios = new TreeMap<>();
    }
    public void adicionarFuncionario(Integer codigo, Funcionario funcionario) {
        funcionarios.put(codigo, funcionario);
    }
    public void buscarFuncionario(Integer codigo) {
        System.out.println(funcionarios.get(codigo));
    }
    public void removerFuncionario(Integer codigo) {
        funcionarios.remove(codigo);
    }

    // containsKey() -> verifica chave
    public void verificarCodigo(Integer codigo) {
        System.out.println(funcionarios.containsKey(codigo));
    }
    // firstKey() -> primeira chave
    public void primeiraChave() {
        System.out.println(funcionarios.firstKey());
    }
    // lastKey() -> última chave
    public void ultimaChave() {
        System.out.println(funcionarios.lastKey());
    }
    // size() -> quantidade
    public void quantidadeFuncionarios() {
        System.out.println(funcionarios.size());
    }
    // isEmpty() -> verifica vazio
    public void verificarEmpresaVazia() {
        System.out.println(funcionarios.isEmpty());
    }
    // for-each para percorrer TreeMap
    public void listarFuncionarios() {
        for (Map.Entry<Integer, Funcionario> item : funcionarios.entrySet()) {
            System.out.println(
                    "Código: " + item.getKey()
                            + " | " + item.getValue()
            );
        }
    }
}
