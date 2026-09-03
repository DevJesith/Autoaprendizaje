package com.portafolio.taskmanager.model;

import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDateTime;

@Entity // Marca la clase como un modelo y representa a una tabla de la base de datos
@Table(name = "tasks") // Se declara el nombre de la tabla de datos
@Getter // Genera getter automaticamente gracias al paquete Lombok - Elimina codigo repetitivo y es superior a @Data ya que incluye metodos que provocan fallos de rendimiento en JPA
@Setter // Genera setter automaticamente gracias al paquete Lombok
@NoArgsConstructor // Genera un constructor vacio sin parametros
@AllArgsConstructor // Genera un constructor que recibe todos los atributos de la clase
@Builder // Implementa el patron de diseño Builder - Ayuda la legibilidad al crear objetos en la logica de negocio y facilita para las pruebas unitarias - hace parte de lombok
public class Task {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false, length = 100)
    private String title;

    @Column(columnDefinition = "TEXT")
    private String description;

    @Column(nullable = false)
    private boolean completed;

    @Column(name = "created_at", nullable = false, updatable = false)
    private LocalDateTime createdAt;

    // Este metodo se ejecutara antes de guardar la entidad por primera vez, garantizando que el campo createdAt tenga siempre la fecha/ahora del servidor sin tener que asignarla manualmente
    @PrePersist
    protected void onCreate() {
        this.createdAt = LocalDateTime.now();
    }
}
