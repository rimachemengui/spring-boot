package tn.spring.springboot.entities;



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
@Table ( name = "Universite")
public class Universite implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="idUniv")
    private long idUniv;
    String nomUniv;
    @OneToMany(cascade = CascadeType.ALL)
    private Set<Departement> Departements;
}
