package br.com.comunitec.comunitec.repository;

import br.com.comunitec.comunitec.entity.Mensagem;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MensagemRepository extends JpaRepository<Mensagem, Long> {
}
