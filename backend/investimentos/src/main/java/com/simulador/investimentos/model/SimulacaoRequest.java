package com.simulador.investimentos.model;

public class SimulacaoRequest {
    private double valorInicial;
    private double aporteMensal;
    private int tempoMeses;
    private double taxaMensal;

    // Getters e Setters
    public double getValorInicial() { return valorInicial; }
    public void setValorInicial(double valorInicial) { this.valorInicial = valorInicial; }

    public double getAporteMensal() { return aporteMensal; }
    public void setAporteMensal(double aporteMensal) { this.aporteMensal = aporteMensal; }

    public int getTempoMeses() { return tempoMeses; }
    public void setTempoMeses(int tempoMeses) { this.tempoMeses = tempoMeses; }

    public double getTaxaMensal() { return taxaMensal; }
    public void setTaxaMensal(double taxaMensal) { this.taxaMensal = taxaMensal; }
}
