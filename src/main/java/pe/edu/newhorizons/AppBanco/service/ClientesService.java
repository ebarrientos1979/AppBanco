package pe.edu.newhorizons.AppBanco.service;

import org.springframework.stereotype.Service;
import pe.edu.newhorizons.AppBanco.model.Clientes;
import pe.edu.newhorizons.AppBanco.repository.ClientesRepository;

import java.util.List;

@Service
public class ClientesService {
    ClientesRepository clientesRepository;

    public ClientesService(ClientesRepository clientesRepository){
        this.clientesRepository = clientesRepository;
    }


    public List<Clientes> getAllCliente(){
        List<Clientes> clientes = this.clientesRepository.findAll();
        return clientes;
    }

    public Clientes saveCliente(Clientes cliente){
        System.out.println("**********************************");
        System.out.println("Cliente: " + cliente.toString());
        return this.clientesRepository.save(cliente);
    }
}
