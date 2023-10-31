package repositories;


import entities.Suma;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SumaRepository extends JpaRepository<Suma, String> {

}
