package com.epicEnergyServices.entity;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Entity
@Table(name = "clienti")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Cliente {
        @Id
        @GeneratedValue(strategy = GenerationType.SEQUENCE)
        private String idCliente;

        private String ragioneSociale;
        private String partitaIva;
        private String email;
        private LocalDate dataInserimento;
        private LocalDate dataUltimoContatto;
        private String fatturatoAnnuale;
        private String pec;
        private String telefono;
        private String emailContatto;
        private String nomeContatto;
        private String cognomeContatto;
        private String telefonoContatto;
        private String logoAziendale;
}
