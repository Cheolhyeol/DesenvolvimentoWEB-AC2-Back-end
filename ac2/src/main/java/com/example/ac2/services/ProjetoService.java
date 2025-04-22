package com.example.ac2.services;

import com.example.ac2.DTO.DadosProjetoDTO;
import com.example.ac2.DTO.ProjetoDTO;

public interface ProjetoService {
    ProjetoDTO salvar(ProjetoDTO dto);
    DadosProjetoDTO buscarPorId(Integer id);
    void vincularFuncionario(Integer idProjeto, Integer idFuncionario);
}
