package net.hamza.gestiondecontractsassurance.Dtos;

import lombok.Data;
import net.hamza.gestiondecontractsassurance.Enums.AssuranceStatus;

import java.util.Date;

@Data
public class ContratAssuranceDto {
    private Long id;
    private Date dateSouscription;
    private Date dateValidation;
    private Long montant;
    private AssuranceStatus status;
    private ClientDto clientDto;
}
