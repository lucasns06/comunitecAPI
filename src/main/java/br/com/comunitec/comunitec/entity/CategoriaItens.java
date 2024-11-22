package br.com.comunitec.comunitec.entity;

import jakarta.persistence.Entity;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class CategoriaItens {
    private Long id;
    private String nome;
    Categoria categoria;
}
