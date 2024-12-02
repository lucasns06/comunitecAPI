package br.com.comunitec.comunitec.repository;

import br.com.comunitec.comunitec.entity.CategoriaItens;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CategoriaItensRepository extends JpaRepository<CategoriaItens, Long> {
}
