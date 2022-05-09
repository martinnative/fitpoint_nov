package mk.finki.ukim.fitpoint.Service.impl;


import mk.finki.ukim.fitpoint.Service.UserService;
import mk.finki.ukim.fitpoint.model.User;
import mk.finki.ukim.fitpoint.model.exceptions.InvalidUserIdException;
import mk.finki.ukim.fitpoint.repository.UserRepository;

import java.util.List;
import java.util.Optional;

public class UserServiceImpl implements UserService {
    private final UserRepository userRepository;

    public UserServiceImpl(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    public List<User> findAll() {
        return userRepository.findAll();
    }

    @Override
    public Optional<User> findById(Long id) {
        return userRepository.findById(id);
    }

    @Override
    public Optional<User> findByName(String name) {
        return userRepository.findByName(name);
    }

    @Override
    public User save(User user) {
        return userRepository.save(user);
    }

    @Override
    public Optional<User> edit(Long id, String name, String username, String password) {
        User user = userRepository.findById(id).orElseThrow(InvalidUserIdException::new);
        user.setName(name);
        user.setUsername(username);
        user.setPassword(password);
        userRepository.save(user);
        return Optional.of(user);
    }

    @Override
    public void deleteById(Long id) {
        userRepository.deleteById(id);

    }
}
