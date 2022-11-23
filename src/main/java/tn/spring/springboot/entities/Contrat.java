package tn.spring.springboot.entities;
import lombok.*;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;
@Entity
@Getter
@Setter
@ToString
@EqualsAndHashCode
@AllArgsConstructor
@NoArgsConstructor
@Table ( name = "Contrat")
public class Contrat  implements Serializable {
    @Id
    @GeneratedValue  (strategy = GenerationType.IDENTITY)
    @Column (name="idContrat")
    private long idContrat;
    Date dateDebutContrat;
    Date dateFinContrat;
    Boolean archive;
    @Enumerated(EnumType.STRING)
    private Specialite specialite;
    @ManyToOne
   Etudiant etudiant;

}



