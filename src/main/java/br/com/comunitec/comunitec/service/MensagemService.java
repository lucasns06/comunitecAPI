package br.com.comunitec.comunitec.service;

import br.com.comunitec.comunitec.entity.Contato;
import br.com.comunitec.comunitec.repository.MensagemRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MensagemService {
    @Autowired
    private MensagemRepository repository;

    public void mandarMensagem(String texto, Contato contato){

    };
}
