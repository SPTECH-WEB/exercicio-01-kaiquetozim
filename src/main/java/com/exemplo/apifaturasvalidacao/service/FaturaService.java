package com.exemplo.apifaturasvalidacao.service;

import com.exemplo.apifaturasvalidacao.model.Fatura;
import com.exemplo.apifaturasvalidacao.repository.FaturaRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FaturaService {

    private FaturaRepository faturaRepository;

    public FaturaService(FaturaRepository faturaRepository) {
        this.faturaRepository = faturaRepository;
    }

    public Fatura cadastrarFatura(Fatura fatura) {
        return faturaRepository.save(fatura);
    }

    public List<Fatura> listarTodos(){
        return faturaRepository.findAll();
    }

}
