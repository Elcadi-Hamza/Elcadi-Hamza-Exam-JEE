package net.hamza.gestiondecontractsassurance;

import net.hamza.gestiondecontractsassurance.Dtos.ClientDto;
import net.hamza.gestiondecontractsassurance.Mappers.ClientMapper;
import net.hamza.gestiondecontractsassurance.Repositories.ClientRepository;
import net.hamza.gestiondecontractsassurance.Repositories.ContratAssuranceRepository;
import net.hamza.gestiondecontractsassurance.Repositories.PaimentRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.stream.Stream;

@SpringBootApplication
public class GestionDeContractsAssuranceApplication {

    public static void main(String[] args) {
        SpringApplication.run(GestionDeContractsAssuranceApplication.class, args);

    }

    @Bean
    CommandLineRunner start(
            ClientRepository clientReository,
            ContratAssuranceRepository contratAssuranceRepository,
            PaimentRepository paimentRepository) {
        return args -> {
            ClientMapper clientMapper = new ClientMapper();
            Stream.of("name1", "name2", "name3").forEach(name -> {
                ClientDto clientDto = new ClientDto();
                clientDto.setNom(name);
                clientDto.setEmail(name + "@gmail.com");
                clientReository.save(clientMapper.fromClientDto(clientDto));
            });

        };

    }

}
