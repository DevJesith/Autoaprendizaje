package com.portafolio.taskmanager.dto;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import lombok.*;

// 1. Peticion del cliente

// {TaskRequestDTO.java} se basa en la tabla para enviar una solicitiud.
// El usuario digita los campos proporcionados por el DTO y no por la entidad.
// Debido a que un usuario malintencionado envie campos que no correspondan y intenten forzar los otros campos de la entidad
// En resumen: El usuario digita los campos del DTO y el DTO se los transfiere a la entidad (taskRequestDTO -> Task)

// Entrada de datos con anotaciones
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class TaskRequestDTO {

    // Se puede indicar reglas para que al momento de digitar, tome las validaciones.
    @NotBlank(message = "El titulo no puede estar vacio")
    @Size(max = 100, message = "El titulo no debe superar los 100 caracteres")
    private String title;

    private String description;

    private boolean completed;
}
