package pe.edu.newhorizons.AppBanco.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import pe.edu.newhorizons.AppBanco.model.Clientes;

public interface ClientesRepository extends JpaRepository<Clientes, Long> {
}
