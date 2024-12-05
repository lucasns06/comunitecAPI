package br.com.comunitec.comunitec.controller;

import br.com.comunitec.comunitec.entity.SinteseVoz;
import br.com.comunitec.comunitec.service.SinteseVozService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/SinteseVoz")
public class SinteseVozController {
    @Autowired
    private SinteseVozService service;

    @GetMapping
    public List<SinteseVoz> listar(){
        return service.listar();
    }
    @DeleteMapping("/{id}")
    public ResponseEntity<SinteseVoz> deletar(@PathVariable Long id){
        if(service.listarPorId(id) != null) {
            service.deletarPorId(id);
            return ResponseEntity.ok().build();
        }
        else{
            return ResponseEntity.notFound().build();
        }
    }
}
