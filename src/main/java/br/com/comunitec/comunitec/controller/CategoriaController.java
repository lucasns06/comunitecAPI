package br.com.comunitec.comunitec.controller;

import br.com.comunitec.comunitec.entity.Categoria;
import br.com.comunitec.comunitec.service.CategoriaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/categorias")
public class CategoriaController {

    @Autowired
    private CategoriaService service;

    @GetMapping
    public List<Categoria> listar(){
        return service.listar();
    };
    @GetMapping("/{id}")
    public Categoria listarPorId(Long id){
        return service.listarPorId(id);
    }
    @PostMapping
    public Categoria adicionar(Categoria categoria){
        return service.adicionar(categoria);
    }

    @DeleteMapping
    public void deletar(Categoria categoria){
        service.deletar(categoria);
    }

}
