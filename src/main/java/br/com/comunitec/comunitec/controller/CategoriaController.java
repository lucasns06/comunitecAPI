package br.com.comunitec.comunitec.controller;

import br.com.comunitec.comunitec.entity.Categoria;
import br.com.comunitec.comunitec.service.CategoriaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/Categorias")
public class CategoriaController {

    @Autowired
    private CategoriaService service;

    @GetMapping
    public List<Categoria> listar(){
        return service.listar();
    };

//    @GetMapping("/{id}")
//    public Categoria listarPorId(@PathVariable Long id){
//        return service.listarPorId(id);
//    }
    @GetMapping("/{id}")
    public ResponseEntity<String> listarPorId(@PathVariable Long id) {
        try {
            Categoria categoria = service.listarPorId(id);
            return ResponseEntity.ok("Categoria encontrada: " + categoria.getNomeCategoria());
        } catch (RuntimeException e) {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body("404 Not Found \nID não encontrado: " + id);
        }
    }

    @PostMapping
    public Categoria adicionar(@RequestBody Categoria categoria){
        return service.adicionar(categoria);
    }
    @DeleteMapping("/{id}")
    public ResponseEntity<Categoria> excluir(@PathVariable("id") Long id){
        if(service.listarPorId(id) != null) {
            service.deletarPorId(id);
            return ResponseEntity.ok().build();
        }
        else{
            return ResponseEntity.notFound().build();
        }
    }

}
