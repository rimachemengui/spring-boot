package tn.spring.springboot.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import tn.spring.springboot.entities.Departement;
import tn.spring.springboot.services.IDepartementService;



public class DepartementRestController {
    @Autowired
    IDepartementService departementService;
    @PostMapping("/adddepartement")
        //http://localhost:8181/esprit/etudiant/adddepartement
        //@RequestBody: pour lire les parametres
    Departement addDepartement(@RequestBody Departement d){
        return departementService.addDepartement(d);
    }
}
