package net.hamza.gestiondecontractsassurance.Dtos;

import lombok.Data;
import net.hamza.gestiondecontractsassurance.Enums.NiveauSanté;

@Data
public class ContratAssuranceSantéDto extends ContratAssuranceDto{
    private int nombrePersonne;
    private NiveauSanté niveau;
}
