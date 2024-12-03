package br.com.comunitec.comunitec.service;

import br.com.comunitec.comunitec.entity.Categoria;
import br.com.comunitec.comunitec.repository.CategoriaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Service
public class CategoriaService {
    @Autowired
    private CategoriaRepository repository;

    public List<Categoria> listar(){
        return repository.findAll();
    };

    public Categoria listarPorId(Long id){
        var existe = repository.findById(id);
        if(existe.isPresent())
            return existe.get();
        throw new RuntimeException();
    }
    public Categoria buscarPorNome(String nome){
        return repository.findByNome(nome);
    }
    public Categoria adicionar(Categoria categoria){
        return repository.save(categoria);
    }

    public Categoria editar(Categoria categoria)
    {
        var existe = listarPorId(categoria.getId());
        if (existe != null)
        {
            return repository.save(categoria);
        }else{
            return null;
        }
    }

    public void deletarPorId(Long id){
        var existe = repository.findById(id);
        if(existe != null)
            repository.deleteById(id);
    }
}
