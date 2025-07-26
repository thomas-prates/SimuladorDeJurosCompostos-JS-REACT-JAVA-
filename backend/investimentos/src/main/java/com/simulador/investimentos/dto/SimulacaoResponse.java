package com.simulador.investimentos.dto;

import com.simulador.investimentos.model.DetalhamentoMensal;
import java.util.List;

public class SimulacaoResponse {
    private double valorFinal;
    private List<DetalhamentoMensal> detalhes;
    private double valorInvestido;
    private double valorAportado;
    private double valorJuros;

    public SimulacaoResponse(double valorFinal, double valorInvestido, double valorAportado, double valorJuros, List<DetalhamentoMensal> detalhes) {
        this.valorFinal = valorFinal;
        this.detalhes = detalhes;
        this.valorInvestido = valorInvestido;
        this.valorAportado = valorAportado;
        this.valorJuros = valorJuros;
    }

    public double getValorFinal() { return valorFinal; }
    public void setValorFinal(double valorFinal) { this.valorFinal = valorFinal; }

    public List<DetalhamentoMensal> getDetalhes() { return detalhes; }
    public void setDetalhes(List<DetalhamentoMensal> detalhes) { this.detalhes = detalhes; }

    public double getValorInvestido() { return valorInvestido; }
    public void setValorInvestido(double valorInvestido) { this.valorInvestido = valorInvestido; }

    public double getValorAportado() { return valorAportado; }
    public void setValorAportado(double valorAportado) { this.valorAportado = valorAportado; }

    public double getValorJuros() { return valorJuros; }
    public void setValorJuros(double valorJuros) { this.valorJuros = valorJuros; }

}
