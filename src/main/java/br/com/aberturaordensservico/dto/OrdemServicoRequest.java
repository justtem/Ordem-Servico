package br.com.aberturaordensservico.dto;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

public class OrdemServicoRequest {
    
    @NotBlank(message = "A descrição da ordem de serviço não pode ser vazia")
    private String descricao;

    @NotNull(message = "O ID do equipamento da ordem de serviço não pode ser nulo")
    private Long equipamentoId;

    // Construtor vazio
    public OrdemServicoRequest() {
    }

    // Construtor com todos os argumentos
    public OrdemServicoRequest(String descricao, Long equipamentoId) {
        this.descricao = descricao;
        this.equipamentoId = equipamentoId;
    }

    // Getters e Setters
    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public Long getEquipamentoId() {
        return equipamentoId;
    }

    public void setEquipamentoId(Long equipamentoId) {
        this.equipamentoId = equipamentoId;
    }
}