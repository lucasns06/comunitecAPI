package br.com.comunitec.comunitec.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.awt.*;

@Entity
@Getter
@Setter
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

    @Column(name = "imagemItem")
    private Image imagem;

    @ManyToOne
    @JoinColumn(name = "idUsuario")
    private Usuario usuario;
}
