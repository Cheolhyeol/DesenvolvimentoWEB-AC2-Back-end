package com.example.ac2.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.example.ac2.DTO.DadosProjetoDTO;
import com.example.ac2.DTO.ProjetoDTO;
import com.example.ac2.services.ProjetoService;

@RestController
@RequestMapping("/projetos")
public class ProjetoController {

    @Autowired
    private ProjetoService projetoService;

    @PostMapping
    public ProjetoDTO adicionar(@RequestBody ProjetoDTO dto) {
        return projetoService.salvar(dto);
    }

    @GetMapping("/{id}")
    public DadosProjetoDTO buscarProjetoPorId(@PathVariable Integer id) {
        return projetoService.buscarPorId(id);
    }

    @PutMapping("/{idProjeto}/funcionarios/{idFuncionario}")
    public void vincularFuncionario(@PathVariable Integer idProjeto, @PathVariable Integer idFuncionario) {
        projetoService.vincularFuncionario(idProjeto, idFuncionario);
    }
}
