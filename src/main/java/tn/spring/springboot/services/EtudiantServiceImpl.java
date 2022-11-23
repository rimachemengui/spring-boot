package tn.spring.springboot.services;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tn.spring.springboot.entities.Departement;
import tn.spring.springboot.entities.Etudiant;
import tn.spring.springboot.entities.Contrat;
import tn.spring.springboot.entities.Equipe;
import tn.spring.springboot.repository.DepartementRepository;
import tn.spring.springboot.repository.EtudiantRepository;
import tn.spring.springboot.repository.ContratRepository;
import tn.spring.springboot.repository.EquipeRepository;

import javax.transaction.Transactional;
import java.util.List;
@Service
@Slf4j

public class EtudiantServiceImpl implements IEtudiantService{
    @Autowired
    EtudiantRepository etudiantRepository;
    DepartementRepository departementRepository;
    ContratRepository contratRepository;
    EquipeRepository equipeRepository;

    public List<Etudiant> retrieveAllEtudiant(){
        List<Etudiant> es=etudiantRepository.findAll();

        for (Etudiant e : es) {
            log.info("etudiant : " + e);
        }
        return es;
    }
    @Override
    public Etudiant addEtudiant (Etudiant e){
        etudiantRepository.save(e);
        return e ;
    }
    public Etudiant updateEtudiant (Etudiant e){
        return etudiantRepository.save(e);

    }
     public void removeEtudiant(Long idEtudiant){
        etudiantRepository.deleteById(idEtudiant);
    }
    public Etudiant retrieveEtudiant(Long idEtudiant , Etudiant e){
        etudiantRepository.findById(idEtudiant);
        return e;
    }
    public Etudiant afficherEtudiant (Long idEtudiant){
       return etudiantRepository.findById(idEtudiant).orElse(null);

    }

    @Override
    @Transactional
    public Etudiant addAndAssignEtudiantToEquipeAndContrat(Etudiant e, Long idContrat, Long idEquipe) {
        Contrat contrat = contratRepository.findById(idContrat).orElse(null);
        Equipe equipe = equipeRepository.findById(idEquipe).orElse(null);
        e.getContrat().add(contrat);
        contrat.setEtudiant(e);
        return etudiantRepository.save(e);
        //set si singulier
        //slave (fils howa a9al importance ) eli fih mapped by
    }


    @Override
    public void assignEtudiantToDepartement (Long idEtudiant, Long idDepart) {
        Departement d=departementRepository.findById(Long.valueOf(idDepart)).orElse(null);
        Etudiant e =etudiantRepository.findById(Long.valueOf(idEtudiant)).orElse(null);
        e.setDepartements(d);
        etudiantRepository.save(e);
    }


}
