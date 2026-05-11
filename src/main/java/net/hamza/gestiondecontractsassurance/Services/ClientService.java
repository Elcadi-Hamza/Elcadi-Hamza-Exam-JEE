package net.hamza.gestiondecontractsassurance.Services;

import jakarta.transaction.Transactional;
import net.hamza.gestiondecontractsassurance.Enteties.Client;
import org.springframework.stereotype.Service;

@Service
@Transactional
public class ClientService {
    public Client getClient(){}
}
