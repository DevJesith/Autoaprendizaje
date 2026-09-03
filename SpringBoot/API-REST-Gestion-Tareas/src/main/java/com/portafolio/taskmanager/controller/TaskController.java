package com.portafolio.taskmanager.controller;

import com.portafolio.taskmanager.dto.TaskRequestDTO;
import com.portafolio.taskmanager.dto.TaskResponseDTO;
import com.portafolio.taskmanager.service.ITaskService;

import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

// Le indica a Spring que cada valor retornado por cada metodo, no buscara una vista HTML
// sino que se serializara directamente a formato JSON en el cuerpo de la respuesta HTTP
@RestController
// Define la ruta base para todos los endpoints expuestos en esta clase
@RequestMapping("/api/v1/tasks")
// Inyecta la interfaz mediante el constructor
// Al inyectar la interfaz en lugar de la implementacion directa, se cumple el principio de desacoplamiento
@RequiredArgsConstructor
public class TaskController {

    private final ITaskService taskService;

    // Mapea peticiones HTTP POST
    @PostMapping
    // El RequestBody toma el JSON recibido en la peticion y lo convierte en una instancia Java requestDTO.
    // @Valid, punto critico que activa las validaciones declaradas en el DTO (NotBlank, Size).
    // Si el JSON enviado no las cumple, Spring detiene la ejecucion antes de invocar al servicio y genera una excepcion
    public ResponseEntity<TaskResponseDTO> createTask(@Valid @RequestBody TaskRequestDTO requestDTO) {
        TaskResponseDTO createdTask = taskService.createTask(requestDTO);
        return new ResponseEntity<>(createdTask, HttpStatus.CREATED);
    }

    // Mapea peticiones HTTP GET
    @GetMapping
    // Extrae todos los registros de la BD
    public ResponseEntity<List<TaskResponseDTO>> getAllTasks() {
        return ResponseEntity.ok(taskService.getAllTask());
    }

    // Mapea peticiones HTTP GET
    @GetMapping("/{id}")
    // @PathVariable extrae la variable dinamica especificada en la URL y la convierte en Long
    public ResponseEntity<TaskResponseDTO> getTaskById(@PathVariable Long id) {
        //El ok Retorna automaticamente un codigo HTTP 200 envolviendo la lista o DTO correspondiente
        return ResponseEntity.ok(taskService.getTaskById(id));
    }

    // Mapea peticiones HTTP PUT
    @PutMapping("/{id}")
    // Combina el PathVariable (identificar que registro modificar), Valid y RequestBody (validar nueva informacion que reemplazara el registro)
    public ResponseEntity<TaskResponseDTO> updateTask(@PathVariable Long id, @Valid @RequestBody TaskRequestDTO requestDTO) {
        return ResponseEntity.ok(taskService.updateTask(id, requestDTO));
    }

    // Mapea peticiones HTTP DELETE
    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteTask(@PathVariable Long id){
        taskService.deleteTask(id);
        // Devuelve el codigo 204 no content, con un cuerpo vacio, cumpliendo la especificacion REST para operaciones de borrado existente
        return ResponseEntity.noContent().build();
    }

    // ¿Por que ResponseEntity<T>?
    // En lugar de retornar DTO directamente, retornar ResponseEntity<T> da control absoluto sobre:
    // * El cuerpo de la respuesta
    // Los codigos de estado HTTP
    // Los encabezados HTTP




}
