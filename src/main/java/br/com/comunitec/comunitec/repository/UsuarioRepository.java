package br.com.comunitec.comunitec.repository;

import br.com.comunitec.comunitec.entity.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UsuarioRepository extends JpaRepository<Usuario, Long> {

}
