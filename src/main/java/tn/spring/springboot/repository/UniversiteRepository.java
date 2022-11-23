package tn.spring.springboot.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import tn.spring.springboot.entities.Universite;

@Repository
public interface UniversiteRepository extends JpaRepository<Universite,Long> {
}
