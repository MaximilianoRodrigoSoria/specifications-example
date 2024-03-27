package ar.com.laboratory.specificationsexample.models.entities;


import jakarta.persistence.*;
import lombok.Data;

import java.io.Serializable;
import java.util.Date;

@Data
@Entity
@Table(name = "productos")
public class Producto implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false, unique = true)
    private String nombre;

    @Column(nullable = false)
    private String categoria;

    @Column
    private String descripcion;

    @Column(nullable = false)
    private boolean isActive;

    @Column(nullable = false)
    private Date createdAt;

    @Column(nullable = false)
    private String createdBy;

    private Date updatedAt;

    private String updatedBy;
}
