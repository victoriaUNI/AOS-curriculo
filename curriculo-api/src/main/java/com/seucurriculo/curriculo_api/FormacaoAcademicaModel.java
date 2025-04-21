package com.seucurriculo.curriculo_api;

import jakarta.persistence.*;
import lombok.*;
import java.time.LocalDate;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class FormacaoAcademicaModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String instituicao;
    private String curso;
    private String nivel;
    private LocalDate dataInicio;
    private LocalDate dataFim;

    @ManyToOne
    @JoinColumn(name = "curriculo_id")
    private CurriculoModel curriculo;
}
