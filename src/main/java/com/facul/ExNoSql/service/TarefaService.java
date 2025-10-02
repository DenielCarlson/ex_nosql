package com.facul.ExNoSql.service;

import com.facul.ExNoSql.model.Tarefa;
import com.facul.ExNoSql.repository.TarefaRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class TarefaService {

    private final TarefaRepository repository;

    public TarefaService(TarefaRepository repository) {
        this.repository = repository;
    }

    public Tarefa criarTarefa(Tarefa tarefa) {
        return repository.save(tarefa);
    }

    public List<Tarefa> listarTodas() {
        return repository.findAll();
    }

    public Optional<Tarefa> buscarPorId(String id) {
        return repository.findById(id);
    }

    public Tarefa atualizarTarefa(String id, Tarefa novaTarefa) {
        return repository.findById(id).map(tarefa -> {
            tarefa.setTitulo(novaTarefa.getTitulo());
            tarefa.setDescricao(novaTarefa.getDescricao());
            tarefa.setDataCriacao(novaTarefa.getDataCriacao());
            tarefa.setDataConclusao(novaTarefa.getDataConclusao());
            tarefa.setStatus(novaTarefa.getStatus());
            return repository.save(tarefa);
        }).orElseThrow(() -> new RuntimeException("Tarefa não encontrada"));
    }

    public void deletarTarefa(String id) {
        repository.deleteById(id);
    }
}

