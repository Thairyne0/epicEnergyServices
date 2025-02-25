package com.epicEnergyServices.service;

import com.epicEnergyServices.entity.Cliente;
import com.epicEnergyServices.repository.ClienteRepository;
import com.epicEnergyServices.request.ClienteRequest;
import com.epicEnergyServices.responses.CreateResponse;
import jakarta.transaction.Transactional;
import jakarta.validation.Valid;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ClienteService {

    @Autowired
    private ClienteRepository clienteRepository;

    @Transactional
    public Cliente creaCliente(@Valid ClienteRequest clienteRequest) {

        Cliente cliente = new Cliente();
        BeanUtils.copyProperties(clienteRequest, cliente);
        clienteRepository.save(cliente);
        return cliente;
    }
}
