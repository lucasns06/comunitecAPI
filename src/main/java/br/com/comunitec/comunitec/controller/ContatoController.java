package br.com.comunitec.comunitec.controller;

import br.com.comunitec.comunitec.entity.Contato;
import br.com.comunitec.comunitec.service.ContatoService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/Contatos")
public class ContatoController {
    private ContatoService service;

    @GetMapping
    public List<Contato> listar(){
        return service.listar();
    }

    @PostMapping
    public Contato gravar(@RequestBody Contato contato){
        return service.gravar(contato);
    }

    @DeleteMapping
    public void deletar(@RequestBody Contato contato){
        service.deletar(contato);
    }
}
