package com.brasilsoftware.gerenciador_de_tarefas.database.repository;

import com.brasilsoftware.gerenciador_de_tarefas.database.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface UserRepository extends JpaRepository<User, String> {
    Optional<User> findByEmail(String email);

    boolean existsByEmail(String email);

}
