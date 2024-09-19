package pe.edu.newhorizons.AppBanco.service;

import ch.qos.logback.core.net.server.Client;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;
import pe.edu.newhorizons.AppBanco.dto.ClientesDto;
import pe.edu.newhorizons.AppBanco.model.Clientes;
import pe.edu.newhorizons.AppBanco.repository.ClientesRepository;

import java.util.List;

@Service
public class ClientesService {
    ClientesRepository clientesRepository;
    ModelMapper modelMapper;

    public ClientesService(ClientesRepository clientesRepository, ModelMapper modelMapper) {
        this.clientesRepository = clientesRepository;
        this.modelMapper = modelMapper;
    }


    public List<Clientes> getAllCliente(){
        List<Clientes> clientes = this.clientesRepository.findAll();
        return clientes;
    }

    public ClientesDto saveCliente(ClientesDto cliente){
        Clientes c = clientesRepository.save(this.modelMapper.map(cliente, Clientes.class));
        return this.modelMapper.map(c, ClientesDto.class);
    }
}
