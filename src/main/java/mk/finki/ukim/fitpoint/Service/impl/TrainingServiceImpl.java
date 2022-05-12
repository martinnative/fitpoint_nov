package mk.finki.ukim.fitpoint.Service.impl;

import mk.finki.ukim.fitpoint.Service.TrainingService;
import mk.finki.ukim.fitpoint.model.Training;
import mk.finki.ukim.fitpoint.model.TrainingType;
import mk.finki.ukim.fitpoint.model.exceptions.InvalidTrainingException;
import mk.finki.ukim.fitpoint.repository.TrainingRepository;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Optional;
@Service
public class TrainingServiceImpl implements TrainingService {

    private final TrainingRepository trainingRepository;

    public TrainingServiceImpl(TrainingRepository trainingRepository) {
        this.trainingRepository = trainingRepository;
    }

    @Override
    public List<Training> findAll() {
        return trainingRepository.findAll();
    }

    @Override
    public Optional<Training> findById(Long id) {
        return trainingRepository.findById(id);
    }

    @Override
    public Optional<Training> findByType(TrainingType type) {
        return trainingRepository.findByType(type);
    }

    @Override
    public Training save(Training training) {
        return trainingRepository.save(training);
    }

    @Override
    public Optional<Training> edit(Long id, TrainingType type, LocalDateTime dateTime, int duration) {
        Training training = trainingRepository.findById(id).orElseThrow(InvalidTrainingException::new);
        training.setType(type);
        training.setDateTime(dateTime);
        training.setDuration(duration);
        trainingRepository.save(training);
        return Optional.of(training);
    }

    @Override
    public void deleteById(Long id) {
        trainingRepository.deleteById(id);
    }
}

