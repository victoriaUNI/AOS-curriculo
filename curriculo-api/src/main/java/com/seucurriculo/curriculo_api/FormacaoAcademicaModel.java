@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class ExperienciaProfissionalModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String instituicaoDeEnsino;
    private String curso;
    private String grau;
    private String descricao;
    private LocalDate dataInicio;
    private LocalDate dataFim;
    private boolean atualmenteCursando;

    @ManyToOne
    @JoinColumn(name = "curriculo_id")
    private Curriculo curriculo;
}
