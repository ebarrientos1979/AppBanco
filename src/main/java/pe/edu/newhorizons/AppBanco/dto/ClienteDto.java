package pe.edu.newhorizons.AppBanco.dto;

import lombok.*;
import java.io.Serializable;
import java.util.Date;

/***
 * ClienteDto
 * Clase que representa un cliente de nuestra capa de negocio
 */
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class ClienteDto implements Serializable {
    private static final long serialVersionUID = 1L;
    private Long id;
    private String nombre;
    private String apellido;
    private String email;
    private String telefono;
    private String direccion;
    private Date fechaNacimiento;
    private Date fechaRegistro;
}
