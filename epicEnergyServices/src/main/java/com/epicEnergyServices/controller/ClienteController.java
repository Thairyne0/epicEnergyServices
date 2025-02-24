package com.epicEnergyServices.controller;

import com.epicEnergyServices.entity.Cliente;
import com.epicEnergyServices.repository.ClienteRepository;
import com.epicEnergyServices.service.ClienteService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import java.util.List;

@RequiredArgsConstructor
@RestController
@RequestMapping("/api/clienti")
@Tag(name = "Clienti", description = "Gestione clienti")
public class ClienteController {

    private final ClienteService clienteService;

    private final ClienteRepository clienteRepository;

    @Operation(summary = "Trova tutti i clienti", description = "Restituisce una lista di tutti i clienti")
    @GetMapping
    public List<Cliente> getAllClienti() {
        return clienteRepository.findAll();
    }
}


