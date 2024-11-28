package br.com.comunitec.comunitec.service;

import br.com.comunitec.comunitec.entity.Categoria;
import br.com.comunitec.comunitec.repository.CategoriaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

@Service
public class CategoriaService {
    @Autowired
    private CategoriaRepository repository;

    @GetMapping
    public List<Categoria> listar(){
        return repository.findAll();
    };

    @PostMapping
    public Categoria adicionar(@RequestBody Categoria categoria){
        return repository.save(categoria);
    }
    @DeleteMapping
    public void deletar(Categoria categoria){
        repository.delete(categoria);
    }

}
