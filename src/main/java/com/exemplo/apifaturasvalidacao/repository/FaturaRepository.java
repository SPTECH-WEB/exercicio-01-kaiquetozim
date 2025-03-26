package com.exemplo.apifaturasvalidacao.repository;

import com.exemplo.apifaturasvalidacao.model.Fatura;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FaturaRepository extends JpaRepository<Fatura, Long> {

}
