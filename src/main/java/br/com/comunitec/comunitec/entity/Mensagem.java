package br.com.comunitec.comunitec.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
public class Mensagem {
    @Id
    private Long id;
    private String texto;
    Contato contato;
}
