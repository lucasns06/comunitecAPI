package br.com.comunitec.comunitec.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
@Entity
public class Tema {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idTema")
    private Long id;

    @Column(name = "nome")
    private String nome;

    @Column(name = "corFundo")
    private String corFundo;

    @Column(name = "corTexto")
    private String corTexto;

    public Tema(Long id, String nome, String corFundo, String corTexto) {
        this.id = id;
        this.nome = nome;
        this.corFundo = corFundo;
        this.corTexto = corTexto;
    }

    public Tema() {
    }
}
