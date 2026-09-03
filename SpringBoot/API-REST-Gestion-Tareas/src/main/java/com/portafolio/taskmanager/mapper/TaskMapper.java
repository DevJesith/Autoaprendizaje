package com.portafolio.taskmanager.mapper;

import com.portafolio.taskmanager.dto.TaskRequestDTO;
import com.portafolio.taskmanager.dto.TaskResponseDTO;
import com.portafolio.taskmanager.model.Task;
import org.springframework.stereotype.Component;

//3. Procesamiento Backend
// Con la ayuda del Mapper, transforma el taskRequestDTO.java en una entidad y devuelve la entidad a una TaskResponseDTO
@Component
public class TaskMapper {

    public Task toEntity(TaskRequestDTO dto){
        return Task.builder()
                .title(dto.getTitle())
                .description(dto.getDescription())
                .completed(dto.isCompleted())
                .build();
    }

    public TaskResponseDTO toDTO(Task entity){
        return TaskResponseDTO.builder()
                .id(entity.getId())
                .title(entity.getTitle())
                .description(entity.getDescription())
                .completed(entity.isCompleted())
                .createdAt(entity.getCreatedAt())
                .build();
    }

}
