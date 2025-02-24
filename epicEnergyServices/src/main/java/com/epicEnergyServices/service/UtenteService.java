package com.epicEnergyServices.service;

import com.epicEnergyServices.entity.Utente;
import com.epicEnergyServices.repository.UtenteRepository;
import com.epicEnergyServices.request.UtenteRequest;
import com.epicEnergyServices.responses.CreateResponse;
import jakarta.transaction.Transactional;
import jakarta.validation.Valid;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UtenteService {

    @Autowired
    private UtenteRepository utenteRepository;

    @Transactional
    public CreateResponse creaUtente(@Valid UtenteRequest utenteRequest) {
        Utente utente = new Utente();
        BeanUtils.copyProperties(utenteRequest, utente);
        utenteRepository.save(utente);
        return new CreateResponse(utente.getIdUtente());
    }

}
