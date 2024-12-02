package br.com.comunitec.comunitec.service;

import br.com.comunitec.comunitec.entity.Categoria;
import br.com.comunitec.comunitec.entity.CategoriaItens;
import br.com.comunitec.comunitec.repository.CategoriaItensRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

@Service
public class CategoriaItensService {
    @Autowired
    private CategoriaItensRepository repository;

    public CategoriaItensService(CategoriaItensRepository repository) {
        this.repository = repository;
    }

    public List<CategoriaItens> listar(){
        return repository.findAll();
    }
    public CategoriaItens listarPorId(Long id){
        var existe = repository.findById(id);
        if(existe.isPresent())
            return existe.get();
        throw new RuntimeException();
    }
    public CategoriaItens adicionar(CategoriaItens categoriaItens){
        return repository.save(categoriaItens);
    }
    public void deletar(CategoriaItens categoriaItens){
        repository.delete(categoriaItens);
    }
}
