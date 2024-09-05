package davidegiliberti.epicode_5_9_24.repositories;

import davidegiliberti.epicode_5_9_24.entities.Pizza;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PizzaRepository extends JpaRepository<Pizza, Long> {
    List<Pizza> findByNome(String nome);
}
