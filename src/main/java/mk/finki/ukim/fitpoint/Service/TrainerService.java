package mk.finki.ukim.fitpoint.Service;

import mk.finki.ukim.fitpoint.model.Gym;
import mk.finki.ukim.fitpoint.model.Trainer;

import java.util.List;
import java.util.Optional;

public interface TrainerService {
    List<Trainer> findAll();

    Optional<Trainer> findById(Long id);

    Optional<Trainer> findByName(String name);

    Trainer save(Trainer trainer);

    Optional<Trainer> edit(Long id, String name, String lastname, String number, Gym gym);

    void deleteById(Long id);
}
