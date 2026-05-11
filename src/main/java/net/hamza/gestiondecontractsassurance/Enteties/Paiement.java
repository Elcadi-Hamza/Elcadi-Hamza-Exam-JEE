package net.hamza.gestiondecontractsassurance.Enteties;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import net.hamza.gestiondecontractsassurance.Enums.TypePaiment;

import java.util.Date;

@Entity

@Data @NoArgsConstructor @AllArgsConstructor
public class Paiement {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private Date date;
    private Long montant;

    @Enumerated(EnumType.STRING)
    private TypePaiment type;

    @ManyToOne
    private ContratAssurance contratAssurance;
}
