package com.seucurriculo.curriculo_api;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class CurriculoService {
    private CurriculoRepository repository;

    public CurriculoModel salvar(CurriculoModel curriculo) {
        return repository.save(curriculo);
    }

    public List<CurriculoModel> listar() {
        return repository.findAll();
    }

    public Optional<CurriculoModel> buscarPorId(Long id) {
        return repository.findById(id);
    }

    public void deletar(Long id) {
        repository.deleteById(id);
    }
}
