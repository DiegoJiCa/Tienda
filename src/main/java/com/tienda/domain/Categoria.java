package com.tienda.domain;

import jakarta.persistence.*;
import java.io.Serializable;
import lombok.Data;

@Data     //getters y setters
@Entity
@Table(name = "categoria")
public class Categoria implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_categoria") //se debe anotar el nombre real de la tabla físicamente
    private Long idCategoria;
    private String descripcion;
    private boolean activo;

    public Categoria() {
    }

    public Categoria(String descripcion, boolean activo) { //no se pone id_categoria porque es un mapeo de una tabla
        this.descripcion = descripcion;
        this.activo = activo;
    }

}
