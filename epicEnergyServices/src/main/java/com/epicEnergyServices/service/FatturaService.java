package com.epicEnergyServices.service;


import com.epicEnergyServices.entity.Cliente;
import com.epicEnergyServices.entity.Fattura;
import com.epicEnergyServices.repository.ClienteRepository;
import com.epicEnergyServices.repository.FatturaRepository;
import com.epicEnergyServices.request.FatturaRequest;
import com.epicEnergyServices.responses.CreateResponse;
import jakarta.transaction.Transactional;
import jakarta.validation.Valid;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class FatturaService {

    @Autowired
    private FatturaRepository fatturaRepository;

    @Autowired
    private ClienteRepository clienteRepository;

    @Transactional
    public Fattura creaFattura(@Valid FatturaRequest fatturaRequest) {
        Fattura fattura = new Fattura();
        Cliente cliente = clienteRepository.findById(fatturaRequest.getIdCliente())
                .orElseThrow(() -> new RuntimeException("Cliente non trovato"));
        BeanUtils.copyProperties(fatturaRequest, fattura);
        fattura.setIdCliente(cliente);
        fatturaRepository.save(fattura);
        return fattura;
    }


}
