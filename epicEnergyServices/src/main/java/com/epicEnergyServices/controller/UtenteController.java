package com.epicEnergyServices.controller;

import com.epicEnergyServices.entity.Utente;
import com.epicEnergyServices.repository.UtenteRepository;
import com.epicEnergyServices.request.UtenteRequest;
import com.epicEnergyServices.service.UtenteService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequiredArgsConstructor
@RestController
@RequestMapping("/api/utenti")
@Tag(name = "Utenti", description = "Gestione utenti")
public class UtenteController {

    private final UtenteService utenteService;

    private final UtenteRepository utenteRepository;

    @Operation(summary = "Trova tutti gli utente", description = "Restituisce una lista di utenti")
    @GetMapping
    public List<Utente> getAllUtenti() {
        return utenteRepository.findAll();
    }

    @Operation(summary = "Crea un nuovo utente", description = "Restituisce l'utente creato")
    @PostMapping
    public ResponseEntity<Utente> creaUtente(@RequestBody UtenteRequest utenteRequest) {
        Utente nuovoUtente = utenteService.creaUtente(utenteRequest);
        return ResponseEntity.status(HttpStatus.CREATED).body(nuovoUtente);

    }

}
