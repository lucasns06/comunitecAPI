package br.com.comunitec.comunitec.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
@Entity
public class SinteseVoz {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idsinteseVoz")
    private Long id;

    @Column(name = "texto")
    private String texto;

    public SinteseVoz(String texto, Long id) {
        this.texto = texto;
        this.id = id;
    }

    public SinteseVoz() {
    }
}
