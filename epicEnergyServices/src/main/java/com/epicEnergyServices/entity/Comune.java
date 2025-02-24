package com.epicEnergyServices.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "comuni")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Comune {
    private String codiceProvincia;
    private String progressivoComune;
    private String nomeComune;

    @ManyToOne
    private Provincia provincia;
}
