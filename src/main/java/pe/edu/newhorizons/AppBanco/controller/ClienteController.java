package pe.edu.newhorizons.AppBanco.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import pe.edu.newhorizons.AppBanco.dto.ClientesDto;
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

    @PostMapping("/save")
    public ResponseEntity<Clientes> saveCliente(@RequestBody Clientes cliente){
        return ResponseEntity.ok(this.clienteService.saveCliente(cliente));
    }

    
}
