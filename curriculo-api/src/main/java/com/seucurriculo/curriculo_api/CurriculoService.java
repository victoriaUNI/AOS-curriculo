@Service
@RequiredArgsConstructor
public class CurriculoService {
    private final CurriculoRepository curriculoRepository;

    public Usuario salvar(CurriculoModel curriculo) {
        return curriculoRepository.save(curriculo);
    }

    public List<CurriculoModel> listarTodos() {
        return curriculoRepository.findAll();
    }

    public Optional<CurriculoModel> buscarPorId(Long id) {
        return curriculoRepository.findById(id);
    }

    public void deletar(Long id) {
        curriculoRepository.deleteById(id);
    }
}
