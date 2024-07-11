package com.freeMarker.Cadastro.repository;

import com.freeMarker.Cadastro.entity.Pessoa;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PessoaRepository extends JpaRepository<Pessoa, Long> {
}
