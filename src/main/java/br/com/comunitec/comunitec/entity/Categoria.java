package br.com.comunitec.comunitec.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import lombok.Getter;
import lombok.Setter;

import java.awt.*;
@Getter
@Setter
@Entity
public class Categoria {
    @Id
    private Long id;
    private String texto;
    private Image imagem;

    @ManyToOne
    @JoinColumn(name = "idUsuario")
    private Usuario usuario;
}
