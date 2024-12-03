package br.com.comunitec.comunitec.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "Contato")
public class Contato {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idContato")
    private Long id;

//    @ManyToOne
//    @JoinColumn(name = "idUsuario")
//    private Usuario usuario;

    @Column(name = "nomeContato")
    private String nome;

    @Column(name = "telefoneContato", columnDefinition = "CHAR")
    private String telefone;

    public Contato(Long id, String nome, String telefone) {
        this.id = id;
        this.nome = nome;
        this.telefone = telefone;
    }

    public Contato() {}
}
