package pe.edu.newhorizons.AppBanco.service;

import org.springframework.stereotype.Service;
import pe.edu.newhorizons.AppBanco.dto.ClienteDto;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Service
public class ClienteService {

    public List<ClienteDto> getAllCliente(){
        ArrayList<ClienteDto> listaCliente = new ArrayList<ClienteDto>();
        listaCliente.add(
                ClienteDto.builder()
                        .id(1L)
                        .nombre("Juan")
                        .apellido("Perez")
                        .email("jperez@gmail.com")
                        .telefono("555555")
                        .direccion("Av. Los Pinos 123")
                        .fechaNacimiento(new Date(2000, 1, 1))
                        .fechaRegistro(new Date()).build()
        );
        return listaCliente;
    }
}
