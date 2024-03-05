package br.com.Allan.servicex.Servico;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Table(name = "SERVICOS")
@Id
@Getter
@Setter
@NoArgsConstructor
public class servico {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID_CATEGORIA")

}
