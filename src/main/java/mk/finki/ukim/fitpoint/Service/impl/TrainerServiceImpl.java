package mk.finki.ukim.fitpoint.Service.impl;

import mk.finki.ukim.fitpoint.Service.TrainerService;
import mk.finki.ukim.fitpoint.model.Gym;
import mk.finki.ukim.fitpoint.model.Trainer;
import mk.finki.ukim.fitpoint.model.exceptions.InvalidGymIdException;
import mk.finki.ukim.fitpoint.model.exceptions.InvalidTrainerException;
import mk.finki.ukim.fitpoint.repository.TrainerRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class TrainerServiceImpl implements TrainerService {
    private final TrainerRepository trainerRepository;

    public TrainerServiceImpl(TrainerRepository trainerRepository) {
        this.trainerRepository = trainerRepository;
    }

    @Override
    public List<Trainer> findAll() {
        return trainerRepository.findAll();
    }

    @Override
    public Optional<Trainer> findById(Long id) {
        return trainerRepository.findById(id);
    }

    @Override
    public Optional<Trainer> findByName(String name) {
        return trainerRepository.findByName(name);
    }

    @Override
    public Trainer save(Trainer trainer) {
        return trainerRepository.save(trainer);
    }

    @Override
    public Optional<Trainer> edit(Long id, String name, String lastname,String number, Gym gym) {
        Trainer trainer = trainerRepository.findById(id).orElseThrow(InvalidTrainerException::new);
        trainer.setName(name);
        trainer.setLastname(lastname);
        trainer.setNumber(number);
        trainer.setGym(gym);
        trainerRepository.save(trainer);
        return Optional.of(trainer);
    }

    @Override
    public void deleteById(Long id) {
        trainerRepository.deleteById(id);

    }
}
