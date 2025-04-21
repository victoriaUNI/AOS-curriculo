package com.seucurriculo.curriculo_api;

import jakarta.persistence.*;
import lombok.*;
import java.time.LocalDate;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class ExperienciaProfissionalModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String empresa;
    private String cargo;
    private String descricao;
    private LocalDate dataInicio;
    private LocalDate dataFim;
    private boolean atualmenteTrabalhando;

    @ManyToOne
    @JoinColumn(name = "curriculo_id")
    private CurriculoModel curriculo;
}
