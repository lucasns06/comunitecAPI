package br.com.comunitec.comunitec.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.awt.*;

@Entity
@Getter
@Setter
@Table(name = "Categoria_Itens")
public class CategoriaItens {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idItem")
    private Long id;

    @ManyToOne
    @JoinColumn(name = "idCategoria")
    private Categoria categoria;

    @Column(name = "nomeItem")
    private String nome;

    public CategoriaItens(Long id, Categoria categoria, String nome) {
        this.id = id;
        this.categoria = categoria;
        this.nome = nome;
    }

    public CategoriaItens(){}
}
