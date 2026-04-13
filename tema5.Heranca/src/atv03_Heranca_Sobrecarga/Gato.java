package atv03_Heranca_Sobrecarga;

public class Gato extends Animal {

    private String corPelagem;

    // Construtor
    public Gato(String nome, int idade, String corPelagem) {
        super(nome, idade);
        this.corPelagem = corPelagem;
    }

    // Getter e Setter
    public String getCorPelagem() {
        return corPelagem;
    }

    public void setCorPelagem(String corPelagem) {
        this.corPelagem = corPelagem;
    }

    // Sobrecarga do método brincar
    public void brincar() {
        System.out.println(nome + " está brincando.");
    }

    public void brincar(String brinquedo) {
        System.out.println(nome + " está brincando com " + brinquedo);
    }
}
