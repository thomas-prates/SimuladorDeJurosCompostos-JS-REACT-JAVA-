package com.simulador.investimentos.model;

public class DetalhamentoMensal {
    private int mes;
    private double saldo;
    private double rendimento;

    public DetalhamentoMensal(int mes, double saldo, double rendimento) {
        this.mes = mes;
        this.saldo = saldo;
        this.rendimento = rendimento;
    }

    public int getMes() { return mes; }
    public void setMes(int mes) { this.mes = mes; }

    public double getSaldo() { return saldo; }
    public void setSaldo(double saldo) { this.saldo = saldo; }

    public double getRendimento() { return rendimento; }
    public void setRendimento(double rendimento) { this.rendimento = rendimento; }
}
