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

}
