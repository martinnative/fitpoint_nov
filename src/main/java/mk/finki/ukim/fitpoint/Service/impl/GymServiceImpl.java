package mk.finki.ukim.fitpoint.Service.impl;

import mk.finki.ukim.fitpoint.Service.GymService;
import mk.finki.ukim.fitpoint.model.Gym;
import mk.finki.ukim.fitpoint.model.exceptions.InvalidGymIdException;
import mk.finki.ukim.fitpoint.repository.GymRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class GymServiceImpl implements GymService {
    private final GymRepository gymRepository;

    public GymServiceImpl(GymRepository gymRepository) {
        this.gymRepository = gymRepository;
    }

    @Override
    public List<Gym> findAll() {
        return gymRepository.findAll();
    }

    @Override
    public Optional<Gym> findById(Long id) {
        return gymRepository.findById(id);
    }

    @Override
    public Optional<Gym> findByName(String name) {
        return gymRepository.findByName(name);
    }

    @Override
    public Gym save(Gym gym) {
        return gymRepository.save(gym);
    }

    @Override
    public Optional<Gym> edit(Long id, String name, String location) {
        Gym gym = gymRepository.findById(id).orElseThrow(InvalidGymIdException::new);
        gym.setName(name);
        gym.setLocation(location);
        gymRepository.save(gym);
        return Optional.of(gym);
    }

    @Override
    public void deleteById(Long id) {
        gymRepository.deleteById(id);

    }
}
