package br.com.aberturaordensservico.dto;

import jakarta.validation.constraints.NotBlank;

public class EncerramentoOrdemServico {
    
    @NotBlank(message = "Informe a solução realizada.")
    private String solucao;

    public EncerramentoOrdemServico() {
    }

    // Getter
    public String getSolucao() {
        return solucao;
    }

    // Setter
    public void setSolucao(String solucao) {
        this.solucao = solucao;
    }
}