package mk.finki.ukim.fitpoint.repository;

import mk.finki.ukim.fitpoint.model.Gym;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.Optional;
@Repository
public interface GymRepository extends JpaRepository<Gym,Long> {
    @Query(value = "select g from Gym g where g.name = ?1")
    Optional<Gym> findByName(String name);
}
