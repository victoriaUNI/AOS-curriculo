package com.seucurriculo.curriculo_api;

import lombok.RequiredArgsConstructor;
import org.springframework.http.*;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/experiencias")
@RequiredArgsConstructor
public class ExperienciaProfissionalController {
    private ExperienciaProfissionalService service;

    @PostMapping
    public ResponseEntity<ExperienciaProfissionalModel> salvar(@RequestBody ExperienciaProfissionalModel experienciaProfissional) {
        return ResponseEntity.status(HttpStatus.CREATED).body(service.salvar(experienciaProfissional));
    }

    @GetMapping
    public List<ExperienciaProfissionalModel> listar() {
        return service.listar();
    }

    @GetMapping("/{id}")
    public ResponseEntity<ExperienciaProfissionalModel> buscarPorId(@PathVariable Long id) {
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