package net.hamza.gestiondecontractsassurance;

import net.hamza.gestiondecontractsassurance.Dtos.ClientDto;
import net.hamza.gestiondecontractsassurance.Dtos.ContratAssuranceHabitationDto;
import net.hamza.gestiondecontractsassurance.Enteties.*;
import net.hamza.gestiondecontractsassurance.Enums.AssuranceStatus;
import net.hamza.gestiondecontractsassurance.Enums.NiveauSanté;
import net.hamza.gestiondecontractsassurance.Enums.TypeHabitation;
import net.hamza.gestiondecontractsassurance.Enums.TypePaiment;
import net.hamza.gestiondecontractsassurance.Mappers.ClientMapper;
import net.hamza.gestiondecontractsassurance.Repositories.ClientRepository;
import net.hamza.gestiondecontractsassurance.Repositories.ContratAssuranceRepository;
import net.hamza.gestiondecontractsassurance.Repositories.PaimentRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.Date;
import java.util.stream.Stream;

@SpringBootApplication
public class GestionDeContractsAssuranceApplication {

    public static void main(String[] args) {
        SpringApplication.run(GestionDeContractsAssuranceApplication.class, args);

    }

    @Bean
    CommandLineRunner start(
            ClientRepository clientRepository,
            ContratAssuranceRepository contratAssuranceRepository,
            PaimentRepository paimentRepository
    ) {
        return args -> {

            ClientMapper clientMapper = new ClientMapper();

            Stream.of("name1", "name2", "name3").forEach(name -> {

                // Save Client
                ClientDto clientDto = new ClientDto();
                clientDto.setNom(name);
                clientDto.setEmail(name + "@gmail.com");

                Client client = clientRepository.save(
                        clientMapper.fromClientDto(clientDto)
                );

                // Contrat Assurance Habitation
                for (int i = 0; i < 3; i++) {

                    ContratAssuranceHabitation cah =
                            new ContratAssuranceHabitation();

                    cah.setDateSouscription(new Date());
                    cah.setDateValidation(new Date());
                    cah.setAdresse("Adresse " + i);
                    cah.setSuperficie(120L + i);
                    cah.setMontant(10000L + i * 1000);
                    cah.setStatus(AssuranceStatus.ENCOURS);
                    cah.setType(TypeHabitation.APPARTEMENT);
                    cah.setClient(client);

                    contratAssuranceRepository.save(cah);
                }

                // Contrat Assurance Automobile
                for (int i = 0; i < 3; i++) {

                    ContratAssuranceAutomobile caa =
                            new ContratAssuranceAutomobile();

                    caa.setDateSouscription(new Date());
                    caa.setDateValidation(new Date());
                    caa.setImatriculation("12345-A-" + i);
                    caa.setMarque("BMW");
                    caa.setModel("X" + i);
                    caa.setMontant(20000L + i * 1000);
                    caa.setStatus(AssuranceStatus.ENCOURS);
                    caa.setClient(client);

                    contratAssuranceRepository.save(caa);
                }

                // Contrat Assurance Santé
                for (int i = 0; i < 3; i++) {

                    ContratAssuranceSanté cas =
                            new ContratAssuranceSanté();

                    cas.setDateSouscription(new Date());
                    cas.setDateValidation(new Date());
                    cas.setNombrePersonne(2 + i);
                    cas.setNiveau(NiveauSanté.PREMIUM);
                    cas.setMontant(15000L + i * 1000);
                    cas.setStatus(AssuranceStatus.ENCOURS);
                    cas.setClient(client);

                    contratAssuranceRepository.save(cas);
                }
            });

            // Paiements
            contratAssuranceRepository.findAll().forEach(contrat -> {

                for (int i = 0; i < 2; i++) {

                    Paiement paiement = new Paiement();

                    paiement.setDate(new Date());
                    paiement.setMontant(5000L + i * 1000);
                    paiement.setType(TypePaiment.MENSUNALITÉ);

                    paiement.setContratAssurance(contrat);

                    paimentRepository.save(paiement);
                }
            });
        };
    }

}
