package br.com.comunitec.comunitec.controller;

import br.com.comunitec.comunitec.entity.Categoria;
import br.com.comunitec.comunitec.service.CategoriaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/categorias")
public class CategoriaController {

    @Autowired
    private CategoriaService service;

    public List<Categoria> listar(){
        return service.listar();
    };
    public Categoria adicionar(Categoria categoria){
        return service.adicionar(categoria);
    }
    public void deletar(Categoria categoria){
        service.deletar(categoria);
    }

}
