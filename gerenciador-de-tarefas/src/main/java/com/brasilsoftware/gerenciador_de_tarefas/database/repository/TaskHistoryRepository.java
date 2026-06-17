package com.brasilsoftware.gerenciador_de_tarefas.database.repository;

import com.brasilsoftware.gerenciador_de_tarefas.database.model.TaskHistory;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface TaskHistoryRepository extends JpaRepository<TaskHistory, String> {
    List<TaskHistory> findByTaskIdOrderByChangedAtDesc(String taskId);
}
