package br.com.comunitec.comunitec.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.awt.*;
@Getter
@Setter
@Entity
public class Categoria {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @JoinColumn(name = "idCategoria")
    private Long id;

    @JoinColumn(name = "nomeCategoria")
    private String texto;

    @JoinColumn(name = "imagemCategoria")
    private Image imagem;

    @ManyToOne
    @JoinColumn(name = "idUsuario")
    private Usuario usuario;
}
