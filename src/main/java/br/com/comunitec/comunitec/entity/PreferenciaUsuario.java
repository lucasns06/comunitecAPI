package br.com.comunitec.comunitec.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
public class PreferenciaUsuario {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idPreferenciaUsuario")
    private Long id;

    @OneToOne
    @JoinColumn(name = "idUsuario")
    private Usuario usuario;

    @Column(name = "tema")
    private TemaEnum tema;

    @Column(name = "tomVoz")
    private tomVozEnum voz;

}
