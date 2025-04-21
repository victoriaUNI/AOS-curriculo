package com.seucurriculo.curriculo_api;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class UsuarioService {
    private UsuarioRepository repository;

    public UsuarioModel salvar(UsuarioModel usuario) {
        return repository.save(usuario);
    }

    public List<UsuarioModel> listar() {
        return repository.findAll();
    }

    public Optional<UsuarioModel> buscarPorId(Long id) {
        return repository.findById(id);
    }

    public void deletar(Long id) {
        repository.deleteById(id);
    }
}
