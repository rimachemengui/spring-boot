package tn.spring.springboot.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import tn.spring.springboot.entities.Contrat;

@Repository
public interface ContratRepository extends JpaRepository<Contrat,Long> {
    Contrat findAllByIdContrat(Long c);



}
