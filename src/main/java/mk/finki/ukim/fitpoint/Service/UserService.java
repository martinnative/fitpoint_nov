package mk.finki.ukim.fitpoint.Service;


import mk.finki.ukim.fitpoint.model.User;

import java.util.List;
import java.util.Optional;

public interface UserService {
    List<User> findAll();

    Optional<User> findById(Long id);

    Optional<User> findByName(String name);

    User save(User user);

    Optional<User> edit(Long id, String name, String username, String password);

    void deleteById(Long id);

    Optional<User> findUserByNameAndLastname(String name, String lastname);
}
