package br.com.comunitec.comunitec.service;

import br.com.comunitec.comunitec.entity.Categoria;
import br.com.comunitec.comunitec.repository.CategoriaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CategoriaService {
    @Autowired
    private CategoriaRepository repository;
    public List<Categoria> listar(){
        return repository.findAll();
    };
}
