package repositories;

import entities.Deduccion;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DeduccionRepository extends JpaRepository<Deduccion, String> {

}
