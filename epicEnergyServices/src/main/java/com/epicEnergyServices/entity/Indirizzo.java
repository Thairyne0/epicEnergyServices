package com.epicEnergyServices.entity;


import jakarta.persistence.Entity;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "indirizzi")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Indirizzo {
    private String via;
    private String civico;
    private String cap;

    @ManyToOne
    private Provincia localita;

    @ManyToOne
    private Comune comune;
}
