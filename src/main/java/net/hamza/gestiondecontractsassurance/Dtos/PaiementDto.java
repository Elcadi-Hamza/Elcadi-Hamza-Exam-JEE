package net.hamza.gestiondecontractsassurance.Dtos;

import net.hamza.gestiondecontractsassurance.Enteties.ContratAssurance;
import net.hamza.gestiondecontractsassurance.Enums.TypePaiment;

import java.util.Date;

public class PaiementDto {
    private Long id;
    private Date date;
    private Long montant;
    private TypePaiment type;
    private ContratAssuranceDto contratAssuranceDto;
}
