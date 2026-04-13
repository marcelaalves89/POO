package atv03_Heranca_Sobrecarga;

public class Cachorro extends Animal {

    private String porte;

    // Construtor
    public Cachorro(String nome, int idade, String porte) {
        super(nome, idade);
        this.porte = porte;
    }

    // Getter e Setter
    public String getPorte() {
        return porte;
    }

    public void setPorte(String porte) {
        this.porte = porte;
    }

    // Sobrecarga do método correr
    public void correr() {
        System.out.println(nome + " está correndo.");
    }

    public void correr(int distancia) {
        System.out.println(nome + " correu " + distancia + " metros.");
    }
}
