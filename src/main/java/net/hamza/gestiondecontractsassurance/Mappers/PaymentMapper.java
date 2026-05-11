package net.hamza.gestiondecontractsassurance.Mappers;

import net.hamza.gestiondecontractsassurance.Dtos.PaiementDto;
import net.hamza.gestiondecontractsassurance.Enteties.Paiement;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Service;

@Service
public class PaymentMapper {
    public Paiement fromPaiementDto (PaiementDto paiementDto) {
        Paiement paiement = new Paiement();
        BeanUtils.copyProperties(paiementDto, paiement);
        return paiement;
    }

    public PaiementDto fromPaiement (Paiement paiement) {
        PaiementDto paiementDto = new PaiementDto();
        BeanUtils.copyProperties(paiement, paiementDto);
        return paiementDto;
    }
}
