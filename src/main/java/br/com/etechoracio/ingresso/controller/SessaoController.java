package br.com.etechoracio.ingresso.controller;

import br.com.etechoracio.ingresso.dto.FilmeResponseDTO;
import br.com.etechoracio.ingresso.dto.SessaoResponseDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import br.com.etechoracio.ingresso.service.SessaoService;

import java.util.List;

@RestController
@RequestMapping("/sessao")
@CrossOrigin("*")
public class SessaoController {
    @Autowired
    private SessaoService sessaoService;

    @GetMapping
    public List<SessaoResponseDTO> findAll(){
        return sessaoService.findAll();
    }
}
