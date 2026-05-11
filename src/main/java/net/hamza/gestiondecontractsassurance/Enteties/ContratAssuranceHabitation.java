package net.hamza.gestiondecontractsassurance.Enteties;

import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import net.hamza.gestiondecontractsassurance.Enums.TypeHabitation;

@Entity
@DiscriminatorValue("CAH")
@Data @NoArgsConstructor @AllArgsConstructor
public class ContratAssuranceHabitation extends ContratAssurance {
    private String adresse;
    private Long superficie;

    @Enumerated(EnumType.STRING)
    private TypeHabitation type;

}
