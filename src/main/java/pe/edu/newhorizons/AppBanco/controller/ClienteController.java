package pe.edu.newhorizons.AppBanco.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import pe.edu.newhorizons.AppBanco.dto.ClienteDto;
import pe.edu.newhorizons.AppBanco.service.ClienteService;

import java.util.List;

@RestController
@RequestMapping("/clientes")
public class ClienteController {
    private ClienteService clienteService;

    public ClienteController(ClienteService clienteService) {
        this.clienteService = clienteService;
    }

    @GetMapping("/getAll")
    public ResponseEntity<List<ClienteDto>> getAllCliente(){
        return ResponseEntity.ok(this.clienteService.getAllCliente());
    }
}
