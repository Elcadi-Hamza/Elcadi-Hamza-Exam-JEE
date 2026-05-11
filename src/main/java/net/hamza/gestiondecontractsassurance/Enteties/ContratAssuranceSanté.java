package net.hamza.gestiondecontractsassurance.Enteties;

import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import net.hamza.gestiondecontractsassurance.Enums.NiveauSanté;

@Entity
@DiscriminatorValue("CAS")
@Data @NoArgsConstructor @AllArgsConstructor
public class ContratAssuranceSanté extends ContratAssurance{
    private int nombrePersonne;

    @Enumerated(EnumType.STRING)
    private NiveauSanté niveau;
}
