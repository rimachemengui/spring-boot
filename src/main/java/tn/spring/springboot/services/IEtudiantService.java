package tn.spring.springboot.services;

import tn.spring.springboot.entities.Etudiant;

import java.util.List;

public interface IEtudiantService {
    List<Etudiant> retrieveAllEtudiant();
    Etudiant addEtudiant (Etudiant e);
    Etudiant updateEtudiant (Etudiant e);
     void removeEtudiant( Long idEtudiant);
   Etudiant retrieveEtudiant(Long idEtudiant,Etudiant e);

   Etudiant afficherEtudiant(Long idEtudiant);
   void assignEtudiantToDepartement (Long idEtudiant, Long idDepart);
    Etudiant addAndAssignEtudiantToEquipeAndContrat(Etudiant e, Long idContrat, Long idEquipe);


}
