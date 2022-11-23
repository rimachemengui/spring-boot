package tn.spring.springboot.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import tn.spring.springboot.entities.Etudiant;
import tn.spring.springboot.services.IEtudiantService;

import java.util.List;

@RestController
@RequestMapping("/etudiant")

public class EtudiantRestController {

    @Autowired
    IEtudiantService etudiantService;




    //http://localhost:8181/esprit/etudiant/affichertout
    @GetMapping("/affichertout")
    List<Etudiant> affichertout(){
        List<Etudiant> l= etudiantService.retrieveAllEtudiant();
        return l;
    }



    @PostMapping("/addetudiant")
        //http://localhost:8181/esprit/etudiant/addetudiant
    //@RequestBody: pour lire les parametres
    Etudiant addEtudiant(@RequestBody Etudiant e){
        return etudiantService.addEtudiant(e);
    }



    @PutMapping("/updateetudiant")
        //http://localhost:8181/esprit/etudiant/updateetudiant
    Etudiant updateEtudiant (@RequestBody Etudiant e){
        etudiantService.updateEtudiant(e);
        return null;
    }


    @DeleteMapping("/removeetudiant/{id_Etudiant}")
        //http://localhost:8181/esprit/etudiant/removeetudiant
    void removeEtudiant( @PathVariable("id_Etudiant") Long idEtudiant){
        etudiantService.removeEtudiant(idEtudiant);
    }


    //http://localhost:8181/esprit/etudiant/assignEtudiantToDepartement
    @PutMapping("/assignEtudiantToDepartement/{id_e}/{id_d}")
    public void assignEtudiantToDepartement (@PathVariable("id_e") Long idEtudiant, @PathVariable("id_d") Long idDepart) {
        etudiantService.assignEtudiantToDepartement(idEtudiant,idDepart);
    }


    @PostMapping("/addAndAssignEtudiantToEquipeAndContract/{idContrat}/{idEquipe}")

    public Etudiant addAndAssignEtudiantToEquipeAndContrat( @RequestBody Etudiant e,@PathVariable("idContrat") Long idContrat,@PathVariable("idEquipe") Long idEquipe)
    {
        return  etudiantService.addAndAssignEtudiantToEquipeAndContrat(e,idContrat,idEquipe);
    }

}
