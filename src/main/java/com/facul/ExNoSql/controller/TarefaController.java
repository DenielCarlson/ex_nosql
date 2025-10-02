package com.facul.ExNoSql.controller;

import com.facul.ExNoSql.model.Tarefa;
import com.facul.ExNoSql.service.TarefaService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/tarefas")
public class TarefaController {

    private final TarefaService service;

    public TarefaController(TarefaService service) {
        this.service = service;
    }

    @PostMapping
    public ResponseEntity<Tarefa> criar(@RequestBody Tarefa tarefa) {
        return ResponseEntity.ok(service.criarTarefa(tarefa));
    }

    @GetMapping
    public ResponseEntity<List<Tarefa>> listarTodas() {
        return ResponseEntity.ok(service.listarTodas());
    }

    @GetMapping("/{id}")
    public ResponseEntity<Tarefa> buscarPorId(@PathVariable String id) {
        return service.buscarPorId(id)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }

    @PutMapping("/{id}")
    public ResponseEntity<Tarefa> atualizar(@PathVariable String id, @RequestBody Tarefa novaTarefa) {
        return ResponseEntity.ok(service.atualizarTarefa(id, novaTarefa));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deletar(@PathVariable String id) {
        service.deletarTarefa(id);
        return ResponseEntity.noContent().build();
    }
}

