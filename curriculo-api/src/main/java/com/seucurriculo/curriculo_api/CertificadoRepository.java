package com.seucurriculo.curriculo_api;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CertificadoRepository extends JpaRepository<CertificadoModel, Long> {
}
