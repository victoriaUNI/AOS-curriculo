package com.seucurriculo.curriculo_api;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface HabilidadeRepository extends JpaRepository<HabilidadeModel, Long> {
}
