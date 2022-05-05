package mk.finki.ukim.fitpoint.Service;

import mk.finki.ukim.fitpoint.model.Gym;

import java.util.List;
import java.util.Optional;

public interface GymService{

    List<Gym> findAll();

    Optional<Gym> findById(Long id);

    Optional<Gym> findByName(String name);

    Gym save(Gym gym);

    Optional<Gym> edit(Long id, String name, String location);

    void deleteById(Long id);
}
