package tn.spring.springboot.repository;


import org.hibernate.sql.Select;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import tn.spring.springboot.entities.Etudiant;

import java.util.List;
import java.util.Set;

@Repository
public interface EtudiantRepository extends JpaRepository<Etudiant,Long> {


    //List<Etudiant> findAllByNomE(String n);

}