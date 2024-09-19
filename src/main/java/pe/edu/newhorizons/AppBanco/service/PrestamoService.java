package pe.edu.newhorizons.AppBanco.service;

import org.springframework.stereotype.Service;
import pe.edu.newhorizons.AppBanco.dto.PrestamoDto;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Service
public class PrestamoService {

    private ClientesService clienteService;

    public PrestamoService(ClientesService clienteService) {
        this.clienteService = clienteService;
    }

    public List<PrestamoDto> getAllByCliente(Long IdCliente){
        ArrayList<PrestamoDto> listaPrestamo = new ArrayList<PrestamoDto>();
        //TODO: Se cargo los datos de la BD MSQL
        listaPrestamo.add(
                PrestamoDto.builder()
                        .id(1L)
                        .monto(1000.0F)
                        .tasaInteres(0.1F)
                        .fechaInicio(new Date(2020,1,1))
                        .fechaFin(new Date(2026,6,1))
                        .id(IdCliente)
                        .build()
        );

        return listaPrestamo;
    }


}
