package com.seucurriculo.curriculo_api;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class FormacaoAcademicaService {
    private FormacaoAcademicaRepository repository;

    public FormacaoAcademicaModel salvar(FormacaoAcademicaModel formacaoAcademica) {
        return repository.save(formacaoAcademica);
    }

    public List<FormacaoAcademicaModel> listar() {
        return repository.findAll();
    }

    public Optional<FormacaoAcademicaModel> buscarPorId(Long id) {
        return repository.findById(id);
    }

    public void deletar(Long id) {
        repository.deleteById(id);
    }
}

