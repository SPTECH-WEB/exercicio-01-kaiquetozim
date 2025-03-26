package com.exemplo.apifaturasvalidacao.controller;

import com.exemplo.apifaturasvalidacao.model.Fatura;
import com.exemplo.apifaturasvalidacao.repository.FaturaRepository;
import com.exemplo.apifaturasvalidacao.service.FaturaService;
import jakarta.validation.Valid;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/faturas")
public class FaturaController {
    private final FaturaRepository faturaRepository;
    private final FaturaService faturaService;

    public FaturaController(FaturaRepository faturaRepository, FaturaService faturaService) {
        this.faturaRepository = faturaRepository;
        this.faturaService = faturaService;
    }
    @PostMapping
    public ResponseEntity<Fatura> create( @Valid @RequestBody Fatura fatura) {
        Fatura fatura1 = faturaService.cadastrarFatura(fatura);
        return ResponseEntity.ok().body(fatura1);
    }

    @GetMapping
    public List<Fatura> listarTudo() {
        return faturaService.listarTodos();
    }
}
