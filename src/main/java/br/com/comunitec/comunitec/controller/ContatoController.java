package br.com.comunitec.comunitec.controller;

import br.com.comunitec.comunitec.entity.Contato;
import br.com.comunitec.comunitec.service.ContatoService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/Contatos")
public class ContatoController {
    private ContatoService service;

    public List<Contato> listar(){
        return service.listar();
    }
    public Contato gravar(Contato contato){
        return service.gravar(contato);
    }
    public void deletar(Contato contato){
        service.deletar(contato);
    }
}
