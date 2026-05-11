package net.hamza.gestiondecontractsassurance.Repositories;

import net.hamza.gestiondecontractsassurance.Enteties.Client;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ClientRepository extends JpaRepository<Client,Long> {
}
