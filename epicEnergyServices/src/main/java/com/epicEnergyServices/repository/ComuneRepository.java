package com.epicEnergyServices.repository;

import com.epicEnergyServices.entity.Comune;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ComuneRepository extends JpaRepository<Comune, Long> {
}
