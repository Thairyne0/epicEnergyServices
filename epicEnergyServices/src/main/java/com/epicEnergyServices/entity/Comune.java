package com.epicEnergyServices.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "comuni")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Comune {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) // Genera automaticamente l'ID
    private Long idComune;

    private String codiceProvincia;
    private String progressivoComune;
    private String nomeComune;

    @ManyToOne
    private Provincia provincia;
}
