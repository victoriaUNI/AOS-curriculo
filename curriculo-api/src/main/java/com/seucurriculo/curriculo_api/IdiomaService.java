package com.seucurriculo.curriculo_api;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class IdiomaService {
    private IdiomaRepository repository;

    public IdiomaModel salvar(IdiomaModel idioma) {
        return repository.save(idioma);
    }

    public List<IdiomaModel> listar() {
        return repository.findAll();
    }

    public Optional<IdiomaModel> buscarPorId(Long id) {
        return repository.findById(id);
    }

    public void deletar(Long id) {
        repository.deleteById(id);
    }
}

