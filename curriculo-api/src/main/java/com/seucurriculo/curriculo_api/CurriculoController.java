package com.seucurriculo.curriculo_api;

import lombok.RequiredArgsConstructor;
import org.springframework.http.*;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/curriculos")
@RequiredArgsConstructor
public class CurriculoController {
    private CurriculoService service;

    @PostMapping
    public ResponseEntity<CurriculoModel> salvar(@RequestBody CurriculoModel curriculo) {
        return ResponseEntity.status(HttpStatus.CREATED).body(service.salvar(curriculo));
    }

    @GetMapping
    public List<CurriculoModel> listar() {
        return service.listar();
    }

    @GetMapping("/{id}")
    public ResponseEntity<CurriculoModel> buscarPorId(@PathVariable Long id) {
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
