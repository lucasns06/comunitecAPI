package br.com.comunitec.comunitec.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.awt.*;
@Getter
@Setter
@Entity
@Table(name = "Categoria")
public class Categoria {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idCategoria")
    private Long id;

    @Column(name = "nomeCategoria")
    private String nome;

    public Categoria(Long id, String nomeCategoria) {
        this.id = id;
        this.nome = nomeCategoria;
    }

    public Categoria(){}

}
