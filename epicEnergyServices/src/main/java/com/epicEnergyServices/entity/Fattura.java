package com.epicEnergyServices.entity;


import jakarta.persistence.Entity;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "fatture")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Fattura {

    private String data;
    private String importo;
    private String stato;
    private String idFattura;

    @ManyToOne
    private String idCliente;

}
