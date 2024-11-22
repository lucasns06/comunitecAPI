package br.com.comunitec.comunitec.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class CategoriaItens {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idItem")
    private Long id;

    @Column(name = "nomeItem")
    private String nome;

    @JoinColumn(name = "idCategoria")
    private Categoria categoria;
}
