package mk.finki.ukim.fitpoint.Service;

import mk.finki.ukim.fitpoint.model.Training;
import mk.finki.ukim.fitpoint.model.TrainingType;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Optional;

public interface TrainingService {

    List<Training> findAll();

    Optional<Training> findById(Long id);

    Optional<Training> findByType(TrainingType type);

    Training save(Training training);

    Optional<Training> edit(Long id, TrainingType type, LocalDateTime dateTime, int duration);

    void deleteById(Long id);
}
