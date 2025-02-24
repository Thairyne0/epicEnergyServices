package com.epicEnergyServices.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "utente")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Utente {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long idUtente;

    private String username;
    private String email;
    private String password;
    private String nome;
    private String cognome;
    private String avatar;
    private String role;
}
