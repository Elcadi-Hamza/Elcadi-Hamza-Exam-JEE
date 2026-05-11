package net.hamza.gestiondecontractsassurance.Enteties;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import net.hamza.gestiondecontractsassurance.Enums.AssuranceStatus;

import java.util.Date;
import java.util.List;

@Entity
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn(name = "TYPEASSURANCE", length = 5)
@Data @NoArgsConstructor @AllArgsConstructor
public abstract class ContratAssurance {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private Date dateSouscription;
    private Date dateValidation;
    private Long montant;

    @Enumerated(EnumType.STRING)
    private AssuranceStatus status;

    @ManyToOne
    private Client client;

    @OneToMany(mappedBy = "contratAssurance", fetch = FetchType.LAZY)
    private List<Paiement> paiements;


}
