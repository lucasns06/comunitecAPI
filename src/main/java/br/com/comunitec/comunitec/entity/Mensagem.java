package br.com.comunitec.comunitec.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
public class Mensagem {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
//    @Column(name = "idMensagem")
    private Long id;

//    @Column(name = "textoMensagem")
    private String texto;

//    @JoinColumn(name = "idUsuario")
    private Contato contato;
}
