package br.com.comunitec.comunitec.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "PreferenciaUsuario")
public class PreferenciaUsuario {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idPreferenciaUsuario")
    private Long id;

    @Column(name = "tema")
    private String tema;

    @Column(name = "tomVoz")
    private String voz;

}
