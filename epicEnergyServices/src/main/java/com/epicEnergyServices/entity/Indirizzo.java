package com.epicEnergyServices.entity;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "indirizzi")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Indirizzo {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) // Genera automaticamente l'ID
    private Long idIndirizzo;

    private String via;
    private String civico;
    private String cap;

    @ManyToOne
    private Provincia localita;

    @ManyToOne
    private Comune comune;
}
