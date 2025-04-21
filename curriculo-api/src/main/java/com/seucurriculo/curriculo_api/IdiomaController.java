package com.seucurriculo.curriculo_api;

import lombok.RequiredArgsConstructor;
import org.springframework.http.*;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/idiomas")
@RequiredArgsConstructor
public class IdiomaController {
    private IdiomaService service;

    @PostMapping
    public ResponseEntity<IdiomaModel> salvar(@RequestBody IdiomaModel idioma) {
        return ResponseEntity.status(HttpStatus.CREATED).body(service.salvar(idioma));
    }

    @GetMapping
    public List<IdiomaModel> listar() {
        return service.listar();
    }

    @GetMapping("/{id}")
    public ResponseEntity<IdiomaModel> buscarPorId(@PathVariable Long id) {
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
