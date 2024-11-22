package br.com.comunitec.comunitec.repository;

import br.com.comunitec.comunitec.entity.Contato;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ContatoRepository extends JpaRepository<Contato, Long> {
    int gerarCodigo();

}
