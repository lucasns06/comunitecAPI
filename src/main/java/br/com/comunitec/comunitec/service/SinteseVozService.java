package br.com.comunitec.comunitec.service;

import br.com.comunitec.comunitec.entity.SinteseVoz;
import br.com.comunitec.comunitec.repository.SinteseVozRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SinteseVozService {
    @Autowired
    private SinteseVozRepository repository;

    public List<SinteseVoz> listar() {
        return repository.findAll();
    }
    public void deletarPorId(Long id){
        var existe = repository.findById(id);
        if(existe != null)
            repository.deleteById(id);
    }

    public SinteseVoz listarPorId(Long id) {
        var existe = repository.findById(id);
        if(existe.isPresent())
            return existe.get();
        throw new RuntimeException();
    }
}
