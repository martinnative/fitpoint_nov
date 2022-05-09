package mk.finki.ukim.fitpoint.repository;

import mk.finki.ukim.fitpoint.model.Gym;
import mk.finki.ukim.fitpoint.model.Trainer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.Optional;
@Repository
public interface TrainerRepository extends JpaRepository<Trainer,Long> {

    @Query(value = "select t from Trainer t where t.name = ?1")
    Optional<Trainer> findByName(String name);
}

