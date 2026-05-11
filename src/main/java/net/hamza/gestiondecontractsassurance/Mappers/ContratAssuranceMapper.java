package net.hamza.gestiondecontractsassurance.Mappers;

import net.hamza.gestiondecontractsassurance.Dtos.ContractAssuranceAutomobileDto;
import net.hamza.gestiondecontractsassurance.Dtos.ContratAssuranceDto;
import net.hamza.gestiondecontractsassurance.Dtos.ContratAssuranceHabitationDto;
import net.hamza.gestiondecontractsassurance.Dtos.ContratAssuranceSantéDto;
import net.hamza.gestiondecontractsassurance.Enteties.ContratAssurance;
import net.hamza.gestiondecontractsassurance.Enteties.ContratAssuranceAutomobile;
import net.hamza.gestiondecontractsassurance.Enteties.ContratAssuranceHabitation;
import net.hamza.gestiondecontractsassurance.Enteties.ContratAssuranceSanté;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Service;

@Service
public class ContratAssuranceMapper {
    public ContratAssuranceDto fromContratAssurance (ContratAssurance contratAssurance) {
        ContratAssuranceDto contratAssuranceDto = new ContratAssuranceDto();
        BeanUtils.copyProperties(contratAssurance, contratAssuranceDto);
        return contratAssuranceDto;
    }

    public ContractAssuranceAutomobileDto fromConratAssuranceAutomobile(ContratAssuranceAutomobile contratAssuranceAutomobile ) {
        ContractAssuranceAutomobileDto contractAssuranceAutomobileDto = new ContractAssuranceAutomobileDto();
        BeanUtils.copyProperties(contratAssuranceAutomobile, contractAssuranceAutomobileDto);
        return contractAssuranceAutomobileDto;
    }

    public ContratAssuranceAutomobile fromConratAssuranceAutomobileDto(ContractAssuranceAutomobileDto contratAssuranceAutomobileDto ) {
        ContratAssuranceAutomobile contractAssuranceAutomobile = new ContratAssuranceAutomobile();
        BeanUtils.copyProperties(contratAssuranceAutomobileDto, contractAssuranceAutomobile);
        return contractAssuranceAutomobile;
    }

    public ContratAssuranceHabitation fromContratAssuranceHabitationDto(ContratAssuranceHabitationDto contratAssuranceHabitationDto ) {
        ContratAssuranceHabitation contratAssuranceHabitation = new ContratAssuranceHabitation();
        BeanUtils.copyProperties(contratAssuranceHabitationDto, contratAssuranceHabitation);
        return contratAssuranceHabitation;
    }

    public ContratAssuranceHabitationDto fromContratAssuranceHabitation(ContratAssuranceHabitation contratAssuranceHabitation ) {
        ContratAssuranceHabitationDto contratAssuranceHabitationDto = new ContratAssuranceHabitationDto();
        BeanUtils.copyProperties(contratAssuranceHabitation, contratAssuranceHabitationDto);
        return contratAssuranceHabitationDto;
    }

    public ContratAssuranceSanté fromContratAssuranceSantéDto(ContratAssuranceSantéDto contratAssuranceSantéDto ) {
        ContratAssuranceSanté contratAssuranceSanté = new ContratAssuranceSanté();
        BeanUtils.copyProperties(contratAssuranceSantéDto, contratAssuranceSanté);
        return contratAssuranceSanté;
    }

    public ContratAssuranceSantéDto fromContratAssuranceSanté(ContratAssuranceSanté contratAssuranceSanté ) {
        ContratAssuranceSantéDto contratAssuranceSantéDto = new ContratAssuranceSantéDto();
        BeanUtils.copyProperties(contratAssuranceSanté, contratAssuranceSantéDto);
        return contratAssuranceSantéDto;
    }


}
