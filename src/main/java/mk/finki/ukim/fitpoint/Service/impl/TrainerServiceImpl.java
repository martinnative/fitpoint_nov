package mk.finki.ukim.fitpoint.Service.impl;

import mk.finki.ukim.fitpoint.Service.TrainerService;
import mk.finki.ukim.fitpoint.model.Gym;
import mk.finki.ukim.fitpoint.model.Trainer;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class TrainerServiceImpl implements TrainerService {
    @Override
    public List<Trainer> findAll() {
        return null;
    }

    @Override
    public Optional<Trainer> findById(Long id) {
        return Optional.empty();
    }

    @Override
    public Optional<Trainer> findByName(String name) {
        return Optional.empty();
    }

    @Override
    public Trainer save(Trainer trainer) {
        return null;
    }

    @Override
    public Optional<Trainer> edit(Long id, String name, String username, String password, String number, Gym gym) {
        return Optional.empty();
    }

    @Override
    public void deleteById(Long id) {

    }
}
