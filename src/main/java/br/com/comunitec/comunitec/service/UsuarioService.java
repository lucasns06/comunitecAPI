package br.com.comunitec.comunitec.service;
import br.com.comunitec.comunitec.entity.Usuario;
import br.com.comunitec.comunitec.repository.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UsuarioService {
    @Autowired
    private UsuarioRepository repository;

    public List<Usuario> listar(){
        return repository.findAll();
    }
}
