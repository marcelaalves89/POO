package atv04_Composicao_PlacaMaeComputador;

public class Computador {
    private String marca;
    private String modelo;
    private String processador;
    private int memoriaRam;
    private PlacaMae placaMae;

    public Computador(String marca, String modelo, String processador, int memoriaRam,
                      String fabricantePlaca, String chipset, int slots, String tipoMemoria) {
        this.marca = marca;
        this.modelo = modelo;
        this.processador = processador;
        this.memoriaRam = memoriaRam;

        // Composição: a placa-mãe é criada junto com o computador
        this.placaMae = new PlacaMae(fabricantePlaca, chipset, slots, tipoMemoria);
    }

    public void exibirComputadorCompleto() {
        System.out.println("=== Informações do Computador ===");
        System.out.println("Marca: " + marca);
        System.out.println("Modelo: " + modelo);
        System.out.println("Processador: " + processador);
        System.out.println("Memória RAM: " + memoriaRam + "GB");
        placaMae.exibirInformacoes();
    }

    public void atualizarProcessador(String novoProcessador) {
        this.processador = novoProcessador;
        System.out.println("Processador atualizado para: " + novoProcessador);
    }

    public void expandirMemoria(int adicional) {
        this.memoriaRam += adicional;
        System.out.println("Memória expandida. Total atual: " + memoriaRam + "GB");
    }

    public void atualizarPlacaMae(String novoChipset, String novoTipoMemoria) {
        placaMae.atualizarChipset(novoChipset);
        placaMae.definirTipoMemoria(novoTipoMemoria);
    }
}
