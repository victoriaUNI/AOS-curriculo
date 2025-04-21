@Service
@RequiredArgsConstructor
public class UsuarioService {
    private final UsuarioRepository usuarioRepository;

    public Usuario salvar(UsuarioModel usuario) {
        return usuarioRepository.save(usuario);
    }

    public List<UsuarioModel> listarTodos() {
        return usuarioRepository.findAll();
    }

    public Optional<UsuarioModel> buscarPorId(Long id) {
        return usuarioRepository.findById(id);
    }

    public void deletar(Long id) {
        usuarioRepository.deleteById(id);
    }
}
