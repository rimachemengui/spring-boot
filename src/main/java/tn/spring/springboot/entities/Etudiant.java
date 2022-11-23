package tn.spring.springboot.entities;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.*;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Set;

@Entity
@Getter
@Setter
@ToString
@EqualsAndHashCode
@AllArgsConstructor
@NoArgsConstructor
@Table ( name = "Etudiant")
public class Etudiant implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="idEtudiant")
    private Long idEtudiant;
    String prenomE;
    String nomE;
    @Enumerated(EnumType.STRING)
    private Option option;
    @OneToMany(cascade = CascadeType.ALL, mappedBy="etudiant")
    @JsonIgnore
    private Set<Contrat> contrat;
    @ManyToOne
    @JsonIgnore
    Departement Departements;
    @ManyToMany(mappedBy="etudiant", cascade = CascadeType.ALL)
    @JsonIgnore
    private Set<Equipe> equipe ;



}
