package com.example.ac2.DTO;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Data
@Builder
public class DadosProjetoDTO {
    private Integer id;
    private String descricao;
    private String dataInicio;
    private String dataFim;
    private List<String> funcionarios;
}

