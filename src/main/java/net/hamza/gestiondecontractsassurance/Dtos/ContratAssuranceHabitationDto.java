package net.hamza.gestiondecontractsassurance.Dtos;

import lombok.Data;
import net.hamza.gestiondecontractsassurance.Enums.TypeHabitation;

@Data
public class ContratAssuranceHabitationDto extends ContratAssuranceDto{
    private String adresse;
    private Long superficie;
    private TypeHabitation type;
}
