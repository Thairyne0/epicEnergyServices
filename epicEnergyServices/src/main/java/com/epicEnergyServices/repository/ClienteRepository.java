package com.epicEnergyServices.repository;

import com.epicEnergyServices.entity.Cliente;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ClienteRepository extends JpaRepository<Cliente, Long>{

    Long findIdByPartitaIva(String partitaIva);


}
