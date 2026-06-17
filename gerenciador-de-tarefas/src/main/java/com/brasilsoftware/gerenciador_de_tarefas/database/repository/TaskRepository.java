package com.brasilsoftware.gerenciador_de_tarefas.database.repository;

import com.brasilsoftware.gerenciador_de_tarefas.database.model.Task;
import com.brasilsoftware.gerenciador_de_tarefas.database.model.TaskStatus;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

import java.util.List;
import java.util.Optional;

public interface TaskRepository extends JpaRepository<Task, String>, JpaSpecificationExecutor<Task> {
    List<Task> findByUserId(String userId);

    Optional<Task> findByIdAndUserId(String id, String userId);
    long countByUserIdAndStatus(String userId, TaskStatus status);

}
