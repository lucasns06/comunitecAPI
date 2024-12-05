package br.com.comunitec.comunitec.service;

import br.com.comunitec.comunitec.entity.Contato;
import br.com.comunitec.comunitec.repository.ContatoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ContatoService {
    @Autowired
    private ContatoRepository repository;

    public List<Contato> listar(){
        return repository.findAll();
    }
    public Contato gravar(Contato contato) {
        return repository.save(contato);
    }
    public void deletar(Contato contato) {
        repository.delete(contato);
    }
    public Contato listarPorId(Long id){
        var existe = repository.findById(id);
        if(existe.isPresent())
            return existe.get();
        throw new RuntimeException();
    }
    public void deletarPorId(Long id){
        var existe = repository.findById(id);
        if(existe != null)
            repository.deleteById(id);
    }
    public Contato editar(Contato contato){
        var existe = repository.findById(contato.getId());
        if(existe.isPresent())
            return repository.save(contato);
        return null;
    }
}
