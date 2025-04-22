package com.example.ac2.services;


import com.example.ac2.repositories.FuncionarioRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

import com.example.ac2.models.Funcionario;

@Service
public class FuncionarioService {

    @Autowired
    private FuncionarioRepository funcionarioRepository;

    public List<Funcionario> buscarProjetosPorFuncionario(Integer funcionarioId) {
        return funcionarioRepository.findByProjetoId(funcionarioId);
    }
}


