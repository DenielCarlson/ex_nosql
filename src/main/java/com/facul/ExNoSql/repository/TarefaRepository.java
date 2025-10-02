package com.facul.ExNoSql.repository;

import com.facul.ExNoSql.model.Tarefa;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface TarefaRepository extends MongoRepository<Tarefa, String> {
}
