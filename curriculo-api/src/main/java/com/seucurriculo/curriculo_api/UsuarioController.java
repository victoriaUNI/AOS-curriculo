package com.seucurriculo.curriculo_api;

import lombok.RequiredArgsConstructor;
import org.springframework.http.*;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/usuarios")
@RequiredArgsConstructor
public class UsuarioController {
    private UsuarioService service;

    @PostMapping
    public ResponseEntity<UsuarioModel> salvar(@RequestBody UsuarioModel usuario) {
        return ResponseEntity.status(HttpStatus.CREATED).body(service.salvar(usuario));
    }

    @GetMapping
    public List<UsuarioModel> listar() {
        return service.listar();
    }

    @GetMapping("/{id}")
    public ResponseEntity<UsuarioModel> buscarPorId(@PathVariable Long id) {
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
