package mk.finki.ukim.fitpoint.repository;

import mk.finki.ukim.fitpoint.model.Training;
import mk.finki.ukim.fitpoint.model.TrainingType;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface TrainingRepository extends JpaRepository<Training,Long> {

    Optional<Training> findByType(TrainingType type);
}