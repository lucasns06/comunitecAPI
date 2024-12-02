package br.com.comunitec.comunitec.controller;

import br.com.comunitec.comunitec.entity.Categoria;
import br.com.comunitec.comunitec.entity.CategoriaItens;
import br.com.comunitec.comunitec.service.CategoriaItensService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/CategoriaItens")
public class CategoriaItensController {
    @Autowired
    private CategoriaItensService service;

    @GetMapping
    public List<CategoriaItens> listar(){
        return service.listar();
    }

    @GetMapping("/{id}")
    public CategoriaItens listarPorId(@PathVariable Long id){
        return service.listarPorId(id);
    }

    @PostMapping
    public CategoriaItens adicionar(@RequestBody CategoriaItens categoriaItens){
        return service.adicionar(categoriaItens);
    }
    @DeleteMapping
    public void deletar(@RequestBody CategoriaItens categoriaItens){
        service.deletar(categoriaItens);
    }

}
