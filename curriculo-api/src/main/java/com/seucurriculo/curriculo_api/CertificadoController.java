package com.seucurriculo.curriculo_api;

import lombok.RequiredArgsConstructor;
import org.springframework.http.*;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/certificados")
@RequiredArgsConstructor
public class CertificadoController {
    private CertificadoService service;

    @PostMapping
    public ResponseEntity<CertificadoModel> salvar(@RequestBody CertificadoModel certificado) {
        return ResponseEntity.status(HttpStatus.CREATED).body(service.salvar(certificado));
    }

    @GetMapping
    public List<CertificadoModel> listar() {
        return service.listar();
    }

    @GetMapping("/{id}")
    public ResponseEntity<CertificadoModel> buscarPorId(@PathVariable Long id) {
        return service.buscarPorId(id)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deletar(@PathVariable Long id) {
        service.deletar(id);
        return ResponseEntity.noContent().build();
    }
}