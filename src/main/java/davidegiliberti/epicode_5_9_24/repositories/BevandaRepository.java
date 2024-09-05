package davidegiliberti.epicode_5_9_24.repositories;

import davidegiliberti.epicode_5_9_24.entities.Bevanda;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BevandaRepository extends JpaRepository<Bevanda, Long> {
}
