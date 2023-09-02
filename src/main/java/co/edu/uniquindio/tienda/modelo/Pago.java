package co.edu.uniquindio.tienda.modelo;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

import java.time.LocalDateTime;

@Entity
public class Pago {

    @Id
    @GeneratedValue
    private int codigo;

    private LocalDateTime fecha;

    private float total;

    private EstadoPago estadoPago;

    private MedioPago medioPago;

}
