package co.edu.uniquindio.tienda.modelo;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

@Entity
public class Producto {

    @Id
    @GeneratedValue
    private int codigo;

    private String nombre;

    private int unidades;

    private float precio;

    private TipoProducto tipoProducto;

}
