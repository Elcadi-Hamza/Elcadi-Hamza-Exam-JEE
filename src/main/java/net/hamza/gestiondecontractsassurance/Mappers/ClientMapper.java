package net.hamza.gestiondecontractsassurance.Mappers;

import net.hamza.gestiondecontractsassurance.Dtos.ClientDto;
import net.hamza.gestiondecontractsassurance.Enteties.Client;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Service;

@Service
public class ClientMapper {
    public ClientDto fromClient (Client client) {
        ClientDto clientDto = new ClientDto();
        BeanUtils.copyProperties(client, clientDto);
        return  clientDto;
    }

    public Client fromClientDto (ClientDto clientDto) {
        Client client = new Client();
        BeanUtils.copyProperties(clientDto, client);
        return client;
    }

}
