package com.portafolio.taskmanager.dto;

import lombok.*;

import java.time.LocalDateTime;

// 3. Respuesta al cliente

// El backend convierte la entidad Task ya guardada a un taskResponseDTO y se la devuelve al cliente en formato JSON
// La informacion dada son todos los atributos dados de la entidad.

// Salida de datos hacia el cliente
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class TaskResponseDTO {

    private Long id;
    private String title;
    private String description;
    private boolean completed;
    private LocalDateTime createdAt;
}
