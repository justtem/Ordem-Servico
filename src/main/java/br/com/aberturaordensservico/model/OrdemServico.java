package br.com.aberturaordensservico.model;

import java.time.LocalDateTime;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity 
@Table(name = "ordem_servico")
public class OrdemServico {
    
    @Id 
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    
    private String descricao;

    private String solucao;
    
    private LocalDateTime dataAbertura;

    private LocalDateTime dataEncerramento;

    @ManyToOne 
    @JoinColumn(name = "equipamento_id")
    private Equipamento equipamento;

    // Construtores
    public OrdemServico() {
    }

    public OrdemServico(Long id, String descricao, String solucao, LocalDateTime dataAbertura, LocalDateTime dataEncerramento, Equipamento equipamento) {
        this.id = id;
        this.descricao = descricao;
        this.solucao = solucao;
        this.dataAbertura = dataAbertura;
        this.dataEncerramento = dataEncerramento;
        this.equipamento = equipamento;
    }

    // Getters e Setters
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getSolucao() {
        return solucao;
    }

    public void setSolucao(String solucao) {
        this.solucao = solucao;
    }

    public LocalDateTime getDataAbertura() {
        return dataAbertura;
    }

    public void setDataAbertura(LocalDateTime dataAbertura) {
        this.dataAbertura = dataAbertura;
    }

    public LocalDateTime getDataEncerramento() {
        return dataEncerramento;
    }

    public void setDataEncerramento(LocalDateTime dataEncerramento) {
        this.dataEncerramento = dataEncerramento;
    }

    public Equipamento getEquipamento() {
        return equipamento;
    }

    public void setEquipamento(Equipamento equipamento) {
        this.equipamento = equipamento;
    }

    
}