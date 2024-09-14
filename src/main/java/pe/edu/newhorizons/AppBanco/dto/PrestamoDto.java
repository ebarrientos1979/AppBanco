package pe.edu.newhorizons.AppBanco.dto;

import lombok.*;

import java.io.Serializable;
import java.util.Date;

/***
 * PrestamoDto
 * Clase que representa un prestamo de nuestra capa de negocio
 */


@Builder
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
public class PrestamoDto implements Serializable {
    private static final long serialVersionUID = 1L;

    private Long id;
    private String nombre;
    private String apellido;
    private String email;
    private String direccion;
    private Float monto;
    private Float tasaInteres;
    private Date fechaInicio;
    private Date fechaFin;
}
