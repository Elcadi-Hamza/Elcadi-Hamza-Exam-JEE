package net.hamza.gestiondecontractsassurance.Dtos;

import lombok.Data;

@Data
public class ContractAssuranceAutomobileDto extends ContratAssuranceDto {
    private String imatriculation;
    private String marque;
    private String model;
}
