package com.portafolio.taskmanager.service;

import com.portafolio.taskmanager.dto.TaskRequestDTO;
import com.portafolio.taskmanager.dto.TaskResponseDTO;

import java.util.List;

// Esta inferfaz define el contrato de negocio (el que hace el sistema) y la implementacion tecnica (el como lo hace).
// Ayuda al desacoplamiento, ya que el controlar unicamente se comunicara con la interfaz. No le importa como se guardan los datos.
// Nos ayuda a tener mejor flexibilidad y mantenimiento, debido a que si en un futuro queremos implementar otro metodo, facilmente se pondria aqui.
public interface ITaskService {

    // Recibe el RequestDTO que contiene solo los datos validos enviados por el usuario
    // Devuelve el ResponseDTO con los datos ya guardados en la bd
    TaskResponseDTO createTask(TaskRequestDTO requestDTO);

    //No necesita parametros porque consulta todos los registros
    // Devuelve una lista de DTOs transformados para evitar una coleccion limpia al cliente
    List<TaskResponseDTO> getAllTask();

    // Recibe la primary key para buscar la tarea en la BD
    // Devuelve el ResponseDTO con la informacion detallada del registro
    TaskResponseDTO getTaskById(Long id);

    // Requiere el id para localizar que tarea actualizar y el RequestDTO con los nuevos valores a aplicar
    // El ResponseDTO refleja el estado final de la tarea actualizada
    TaskResponseDTO updateTask(Long id, TaskRequestDTO requestDTO);

    // Recibe el id de la tarea a eliminar
    // Es void porque en estandares HTTP, al borrar un recurso con exito, no hay cuerpo de respuesta que enviar (corresponde a un codigo 204 No Content)
    void deleteTask(Long id);
}
