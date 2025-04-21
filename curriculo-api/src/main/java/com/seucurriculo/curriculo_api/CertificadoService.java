package com.seucurriculo.curriculo_api;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class CertificadoService {
    private CertificadoRepository repository;

    public CertificadoModel salvar(CertificadoModel certificado) {
        return repository.save(certificado);
    }

    public List<CertificadoModel> listar() {
        return repository.findAll();
    }

    public Optional<CertificadoModel> buscarPorId(Long id) {
        return repository.findById(id);
    }

    public void deletar(Long id) {
        repository.deleteById(id);
    }
}

