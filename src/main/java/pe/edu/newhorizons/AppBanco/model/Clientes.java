package pe.edu.newhorizons.AppBanco.model;

import jakarta.persistence.*;
import lombok.*;

@Builder
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
@Entity(name="clientes")
@Table(name="clientes")
public class Clientes {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id", nullable = false, updatable = false)
    private Long id;

    @Column(name="nombre", nullable = false, length = 255)
    private String nombre;

    @Column(name="direccion", nullable = false, length = 255)
    private String direccion;

    @Column(name="telefono", nullable = false, length = 50)
    private String telefono;

    @Column(name="email", nullable = false, length = 255)
    private String email;
}
