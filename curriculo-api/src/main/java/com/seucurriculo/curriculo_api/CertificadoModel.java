@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class CertificadoModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String instituicao;
    private String cert;
    private LocalDate dataInicio;
    private LocalDate dataFim;
    

    @ManyToOne
    @JoinColumn(name = "curriculo_id")
    private Curriculo curriculo;
}
