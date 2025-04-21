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

    @ManyToOne
    @JoinColumn(name = "usuario_id")
    private Usuario usuario;

    private LocalDate dataCriacao;
    private LocalDate dataAtualizacao;

    @OneToMany(mappedBy = "curriculo", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<ExperienciaProfissional> experiencias = new ArrayList<>();

    @OneToMany(mappedBy = "curriculo", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<FormacaoAcademica> formacoes = new ArrayList<>();

    @OneToMany(mappedBy = "curriculo", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<Habilidade> habilidades = new ArrayList<>();

    @OneToMany(mappedBy = "curriculo", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<Idioma> idiomas = new ArrayList<>();

    @OneToMany(mappedBy = "curriculo", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<Certificado> certificados = new ArrayList<>();
}
