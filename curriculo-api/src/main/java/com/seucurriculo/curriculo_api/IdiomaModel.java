package com.seucurriculo.curriculo_api;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class IdiomaModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String idioma;
    private String nivel;

    @ManyToOne
    @JoinColumn(name = "curriculo_id")
    private CurriculoModel curriculo;
}

