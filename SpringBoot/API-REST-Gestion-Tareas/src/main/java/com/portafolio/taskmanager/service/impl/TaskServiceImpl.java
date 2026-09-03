package com.portafolio.taskmanager.service.impl;

import com.portafolio.taskmanager.dto.TaskRequestDTO;
import com.portafolio.taskmanager.dto.TaskResponseDTO;
import com.portafolio.taskmanager.exception.ResourceNotFoundException;
import com.portafolio.taskmanager.mapper.TaskMapper;
import com.portafolio.taskmanager.model.Task;
import com.portafolio.taskmanager.repository.TaskRepository;
import com.portafolio.taskmanager.service.ITaskService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

// Le indica a Spring que esta clase contiene la logica de negocio y debe registrarse como
// un objeto administrado (Spring bean) en el contenedor de inversion de control (IoC)
@Service
// Genera un constructor que recibe las inyeccciones. Es la forma estandar y recomendada de realizar
// inyeccion de dependencias, ya que las hace inmutables (final) y facilita la creacion de pruebas
// unitarias sin levantar el contenido completo de Spring.
@RequiredArgsConstructor
public class TaskServiceImpl implements ITaskService {

    private final TaskRepository taskRepository;
    private final TaskMapper taskMapper;

    @Override
    public TaskResponseDTO createTask(TaskRequestDTO requestDTO) {
        // Recibe la informacion validada por el cliente y la transforma en una entidad
        Task task = taskMapper.toEntity(requestDTO);
        // Envia la entidad a PostgreSQL, se inserta y retorna la entidad completa procesada por (@PrePersist)
        Task savedTask = taskRepository.save(task);
        // Transforma el resultado final a un DTO de respuesta para no exponer la entidad directamente
        return taskMapper.toDTO(savedTask);
    }

    @Override
    public List<TaskResponseDTO> getAllTask() {
        // Recupera la lista completa de entidades desde la BD
        return taskRepository.findAll().
                // Transforma cada entidad de la lista en DTO usando la referncia del metodo
                        // y junta el resultado en una lista inmutable
                stream().
                map(taskMapper::toDTO).
                toList();
    }

    @Override
    public TaskResponseDTO getTaskById(Long id) {
        // Retorna un objeto Optional
        Task task = taskRepository.findById(id)
                //Si la tarea existe, la extrae, si esta vacia, detiene la ejecucion y lanza un excepcion
                .orElseThrow(
                        () -> new ResourceNotFoundException("Tarea no encontrada con ID: " + id)
                );
        return taskMapper.toDTO(task);
    }

    @Override
    public TaskResponseDTO updateTask(Long id, TaskRequestDTO requestDTO) {
        // Busca la tarea existente en la BD, si no la encuentra, lanza error 404
        Task task = taskRepository.findById(id).orElseThrow(() -> new ResourceNotFoundException("Tarea no encontrada con ID: " + id));

        // Asigna los nuevos valores traidos en el requestDTO mediante los metodos set
        task.setTitle(requestDTO.getTitle());
        task.setDescription(requestDTO.getDescription());
        task.setCompleted(requestDTO.isCompleted());

        // Al pasarle una entidad que ya tiene un id existente, Hibernate comprende que no
        // es una creacion sino una actualizacion, ejecutando una sentencia UPDATE
        Task updateTask = taskRepository.save(task);
        return taskMapper.toDTO(updateTask);
    }

    @Override
    public void deleteTask(Long id) {
        // Verifica primero en la BD la si el registro existe antes de intentar eliminarlo.
        // Si no existe, lanza la exception
        if (!taskRepository.existsById(id)) {
            throw new ResourceNotFoundException("Tarea no encontrada con ID: " + id);
        }
        taskRepository.deleteById(id);
    }
}
