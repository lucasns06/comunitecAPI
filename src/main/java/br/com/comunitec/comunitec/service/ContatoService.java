package br.com.comunitec.comunitec.service;

import br.com.comunitec.comunitec.entity.Contato;
import br.com.comunitec.comunitec.repository.ContatoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

@Service
public class ContatoService {
    @Autowired
    private ContatoRepository repository;

    @GetMapping
    public List<Contato> listar(){
        return repository.findAll();
    }

    @PostMapping
    public Contato gravar(@RequestBody Contato contato) {
        return repository.save(contato);
    }
    @DeleteMapping
    public void deletar(@RequestBody Contato contato) {
        repository.delete(contato);
    }

}
