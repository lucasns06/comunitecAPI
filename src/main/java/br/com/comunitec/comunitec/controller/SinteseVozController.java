package br.com.comunitec.comunitec.controller;

import br.com.comunitec.comunitec.entity.SinteseVoz;
import br.com.comunitec.comunitec.service.SinteseVozService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

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
}
