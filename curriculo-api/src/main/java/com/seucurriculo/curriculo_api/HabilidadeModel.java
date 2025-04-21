@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class HabilidadeModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String habilidade;

    @ManyToOne
    @JoinColumn(name = "curriculo_id")
    private Curriculo curriculo;
}
