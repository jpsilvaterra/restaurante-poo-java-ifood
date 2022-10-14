import java.util.List;

public class Restaurante {
    private Long id;
    private String nomeFantasia;
    private String cpnj;
    private List<Produto> catalogo = new Arraylist<>();
    private Endereco endereco;
    
    public void setId(Long id) {
        this.id = id;
    }

    public void setNomeFantasia(String nomeFantasia) {
        this.nomeFantasia = nomeFantasia;
    }

    public void setCnpj(String cpnj){
        this.cpnj;
    }


    @Override
    public String toString() {
        return "Restaurante{" +
        "id=" + id +
        ", nomeFantasia= '" + nomeFantasia + '\'' +
        ", catalogo=" + catalogo +
        ", endereco=" + endereco +
        '}';
    }
}
