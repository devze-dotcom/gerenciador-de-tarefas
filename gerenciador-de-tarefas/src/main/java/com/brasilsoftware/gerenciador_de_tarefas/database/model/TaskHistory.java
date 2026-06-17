package com.brasilsoftware.gerenciador_de_tarefas.database.model;


import jakarta.persistence.*;
import lombok.*;
import org.springframework.web.service.annotation.GetExchange;

import java.time.LocalDateTime;

@Entity
@Table(name = "task_history")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class TaskHistory {

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private String id;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "task_id", nullable = false)
    private Task task;

    @Column(name = "changed_field", nullable = false, length = 100)
    private String changedField;

    @Column(name = "old_value", columnDefinition = "TEXT")
    private String oldValue;

    @Column(name = "new_value", columnDefinition = "TEXT")
    private String newValue;

    @Column(name = "changed_at", nullable = false, updatable = false)
    private LocalDateTime changedAt;

    @PrePersist
    public void prePersist(){
        this.changedAt = LocalDateTime.now();
    }

}
