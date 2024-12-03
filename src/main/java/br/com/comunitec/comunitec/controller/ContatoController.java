package br.com.comunitec.comunitec.controller;

import br.com.comunitec.comunitec.entity.Contato;
import br.com.comunitec.comunitec.service.ContatoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/Contatos")
public class ContatoController {
    @Autowired
    private ContatoService service;

    @GetMapping
    public List<Contato> listar(){
        return service.listar();
    }

    @PostMapping
    public Contato gravar(@RequestBody Contato contato){
        return service.gravar(contato);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Contato> deletar(@PathVariable Long id){
        if(service.listarPorId(id) != null) {
            service.deletarPorId(id);
            return ResponseEntity.ok().build();
        }
        else{
            return ResponseEntity.notFound().build();
        }
    }

}
