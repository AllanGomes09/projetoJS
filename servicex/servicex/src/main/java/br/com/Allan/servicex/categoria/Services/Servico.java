package br.com.Allan.servicex.categoria;
import jakarta.persistence.*;
import lombok.Data;
import org.hibernate.annotations.IdGeneratorType;

@Entity
@Table(name = "CATEGORIA")
@Data
public class Categoria {
    public Categoria(Integer idCategoria) {
        this.idCategoria = idCategoria;
    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name ="ID_CATEGORIA" )
    private Integer idCategoria;
    @Column(name = "NOME_CATEGORIA")
    private String nameCategoria;
    @OneToMany(mappedBy = "categoria", cascade = CascadeType.ALL)
    private List<Servico> servicos;

    public Categoria() {
    }

    public Categoria(List<Servico> servicos) {
        this.servicos = servicos;
    }

    public Categoria(String nameCategoria) {
        this.nameCategoria = nameCategoria;
    }
}