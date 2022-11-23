package tn.spring.springboot.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import tn.spring.springboot.entities.Equipe;

@Repository
public interface EquipeRepository extends JpaRepository<Equipe,Long> {
}
