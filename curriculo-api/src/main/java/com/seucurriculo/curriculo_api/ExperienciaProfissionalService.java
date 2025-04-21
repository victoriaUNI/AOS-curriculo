package com.seucurriculo.curriculo_api;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class ExperienciaProfissionalService {
    private ExperienciaProfissionalRepository repository;

    public ExperienciaProfissionalModel salvar(ExperienciaProfissionalModel experienciaProfissional) {
        return repository.save(experienciaProfissional);
    }

    public List<ExperienciaProfissionalModel> listar() {
        return repository.findAll();
    }

    public Optional<ExperienciaProfissionalModel> buscarPorId(Long id) {
        return repository.findById(id);
    }

    public void deletar(Long id) {
        repository.deleteById(id);
    }
}

