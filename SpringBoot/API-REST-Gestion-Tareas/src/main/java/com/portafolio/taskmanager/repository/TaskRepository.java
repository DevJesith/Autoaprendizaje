package com.portafolio.taskmanager.repository;

import com.portafolio.taskmanager.model.Task;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

// Gestiona la interaccion con la base de datos sin necesidad de escribir consultas SQL manuales
@Repository
public interface TaskRepository extends JpaRepository<Task, Long> {
    // JpaRepository ya incluye operaciones CRUD basicas (save, findById, findAll, deleteById)
}
