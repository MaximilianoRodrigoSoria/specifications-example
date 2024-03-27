package ar.com.laboratory.specificationsexample.models.dtos;



import lombok.Data;

import java.io.Serializable;

@Data
public class ProductoDTO implements Serializable {
    private Long id;
    private String nombre;
    private String categoria;
    private String descripcion;
}
