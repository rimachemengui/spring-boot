package tn.spring.springboot.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import tn.spring.springboot.entities.Departement;

@Repository
public interface DepartementRepository extends JpaRepository<Departement,Long> {
}
