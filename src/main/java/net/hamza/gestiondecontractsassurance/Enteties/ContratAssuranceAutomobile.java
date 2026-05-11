package net.hamza.gestiondecontractsassurance.Enteties;

import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@DiscriminatorValue("CAA")
@Data @NoArgsConstructor @AllArgsConstructor
public class ContratAssuranceAutomobile extends ContratAssurance{
    private String imatriculation;
    private String marque;
    private String model;

}
