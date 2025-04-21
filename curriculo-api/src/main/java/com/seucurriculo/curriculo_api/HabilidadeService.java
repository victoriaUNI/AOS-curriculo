package com.seucurriculo.curriculo_api;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class HabilidadeService {
    private HabilidadeRepository repository;

    public HabilidadeModel salvar(HabilidadeModel habilidade) {
        return repository.save(habilidade);
    }

    public List<HabilidadeModel> listar() {
        return repository.findAll();
    }

    public Optional<HabilidadeModel> buscarPorId(Long id) {
        return repository.findById(id);
    }

    public void deletar(Long id) {
        repository.deleteById(id);
    }
}
