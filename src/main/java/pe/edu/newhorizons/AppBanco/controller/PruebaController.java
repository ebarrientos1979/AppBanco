package pe.edu.newhorizons.AppBanco.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/prueba")
public class PruebaController {

    @GetMapping("/saludo")
    public ResponseEntity<String> Saludo(){
        return ResponseEntity.ok("Hola Mundo");
    }

}
