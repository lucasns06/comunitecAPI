package br.com.comunitec.comunitec.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

@Entity
public class Contato {
    @Id
    private Long id;

    private String nome;
    private char telefone;

    @ManyToOne
    @JoinColumn(name = "idUsuario")
    private Usuario usuario;
}
