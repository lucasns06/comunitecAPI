package br.com.comunitec.comunitec.controller;

import br.com.comunitec.comunitec.entity.CategoriaItens;
import br.com.comunitec.comunitec.service.CategoriaItensService;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/CategoriaItens")
public class CategoriaItensController {
    CategoriaItensService service;

    public List<CategoriaItens> listar(){
        return service.listar();
    }
    public CategoriaItens adicionar(CategoriaItens categoriaItens){
        return service.adicionar(categoriaItens);
    }
    public void deletar(CategoriaItens categoriaItens){
        service.deletar(categoriaItens);
    }

}
