package com.simulador.investimentos.controller;

import com.simulador.investimentos.model.SimulacaoRequest;
import com.simulador.investimentos.dto.SimulacaoResponse;
import com.simulador.investimentos.model.DetalhamentoMensal;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@CrossOrigin(origins = "http://localhost:3000")
@RestController
@RequestMapping("/simulador")
public class SimuladorController {

    @PostMapping("/simular")
    public SimulacaoResponse simular(@RequestBody SimulacaoRequest request) {
        double i = request.getTaxaMensal() / 100;
        double montante = request.getValorInicial();
        List<DetalhamentoMensal> detalhes = new ArrayList<>();

        for (int mes = 1; mes <= request.getTempoMeses(); mes++) {
            double rendimento = montante * i;
            montante += rendimento + request.getAporteMensal();

            detalhes.add(new DetalhamentoMensal(mes, montante, rendimento));
        }

        double valorFinal = montante;
        double valorAportado = request.getAporteMensal() * request.getTempoMeses();
        double valorInvestido = request.getValorInicial() + valorAportado;
        double valorJuros = valorFinal - valorInvestido;
        return new SimulacaoResponse(valorFinal, valorInvestido, valorAportado, valorJuros, detalhes);
    }
}
