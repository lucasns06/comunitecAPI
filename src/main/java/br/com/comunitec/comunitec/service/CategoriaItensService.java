package br.com.comunitec.comunitec.service;

import br.com.comunitec.comunitec.entity.CategoriaItens;
import br.com.comunitec.comunitec.repository.CategoriaItensRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Service
public class CategoriaItensService {
    @Autowired
    private CategoriaItensRepository repository;

    @GetMapping
    public List<CategoriaItens> listar(){
        return repository.findAll();
    }

}
