package net.hamza.gestiondecontractsassurance.Repositories;

import net.hamza.gestiondecontractsassurance.Enteties.Paiement;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PaimentRepository extends JpaRepository<Paiement,Long> {
}
