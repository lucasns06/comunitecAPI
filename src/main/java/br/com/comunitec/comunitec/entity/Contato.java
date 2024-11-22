package br.com.comunitec.comunitec.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
public class Contato {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @JoinColumn(name = "idContato")
    private Long id;

    @JoinColumn(name = "nomeContato")
    private String nome;

    @JoinColumn(name = "telefoneContato")
    private char telefone;

    @ManyToOne
    @JoinColumn(name = "idUsuario")
    private Usuario usuario;
}
