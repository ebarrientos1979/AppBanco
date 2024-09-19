package pe.edu.newhorizons.AppBanco.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import pe.edu.newhorizons.AppBanco.dto.ClienteDto;
import pe.edu.newhorizons.AppBanco.model.Clientes;
import pe.edu.newhorizons.AppBanco.service.ClientesService;

import java.util.List;

@RestController
@RequestMapping("/clientes")
public class ClienteController {
    private ClientesService clienteService;

    public ClienteController(ClientesService clienteService) {
        this.clienteService = clienteService;
    }

    @GetMapping("/getAll")
    public ResponseEntity<List<Clientes>> getAllCliente(){
        return ResponseEntity.ok(this.clienteService.getAllCliente());
    }
}
