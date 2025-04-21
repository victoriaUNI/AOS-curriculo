package com.seucurriculo.curriculo_api;

import jakarta.persistence.*;
import lombok.*;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class CurriculoModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String titulo;
    private String descricao;

    private LocalDate dataCriacao;
    private LocalDate dataAtualizacao;

    @ManyToOne
    @JoinColumn(name = "usuario_id")
    private UsuarioModel usuario;

    @OneToMany(mappedBy = "curriculo", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<ExperienciaProfissionalModel> experiencias = new ArrayList<>();

    @OneToMany(mappedBy = "curriculo", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<FormacaoAcademicaModel> formacoes = new ArrayList<>();

    @OneToMany(mappedBy = "curriculo", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<HabilidadeModel> habilidades = new ArrayList<>();

    @OneToMany(mappedBy = "curriculo", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<IdiomaModel> idiomas = new ArrayList<>();

    @OneToMany(mappedBy = "curriculo", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<CertificadoModel> certificados = new ArrayList<>();
}
