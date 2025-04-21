package com.seucurriculo.curriculo_api;

import jakarta.persistence.*;
import lombok.*;
import java.time.LocalDate;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class CertificadoModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nome;
    private String instituicao;
    private LocalDate dataConclusao;
    private String urlCertificado;

    @ManyToOne
    @JoinColumn(name = "curriculo_id")
    private CurriculoModel curriculo;
}
