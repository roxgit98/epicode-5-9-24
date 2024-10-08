package davidegiliberti.epicode_5_9_24.repositories;

import davidegiliberti.epicode_5_9_24.entities.Topping;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ToppingRepository extends JpaRepository<Topping, Long> {
}
