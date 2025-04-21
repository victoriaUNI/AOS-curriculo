package com.seucurriculo.curriculo_api;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FormacaoAcademicaRepository extends JpaRepository<FormacaoAcademicaModel, Long> {
}
