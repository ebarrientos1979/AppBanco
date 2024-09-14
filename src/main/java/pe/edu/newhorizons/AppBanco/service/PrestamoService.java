package pe.edu.newhorizons.AppBanco.service;

import org.springframework.stereotype.Service;
import pe.edu.newhorizons.AppBanco.dto.ClienteDto;
import pe.edu.newhorizons.AppBanco.dto.PrestamoDto;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Service
public class PrestamoService {

    private ClienteService clienteService;

    public PrestamoService(ClienteService clienteService) {
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

        List<ClienteDto> clienteDto = this.clienteService.getAllCliente();//TODO: Deberiamos llamar al getClienteById

        for (PrestamoDto prestamoDto: listaPrestamo) {
            for (ClienteDto cliente: clienteDto) {
                if(prestamoDto.getId().equals(cliente.getId())){
                    prestamoDto.setNombre(cliente.getNombre());
                    prestamoDto.setApellido(cliente.getApellido());
                    prestamoDto.setEmail(cliente.getEmail());
                    prestamoDto.setDireccion(cliente.getDireccion());
                }
            }
        }

        return listaPrestamo;
    }


}
