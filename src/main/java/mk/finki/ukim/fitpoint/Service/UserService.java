package mk.finki.ukim.fitpoint.Service;


import mk.finki.ukim.fitpoint.model.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;

import java.util.List;
import java.util.Optional;

public interface UserService extends UserDetailsService {
    List<User> findAll();

    Optional<User> findById(Long id);

    Optional<User> findByName(String name);

    User save(User user);

    Optional<User> edit(Long id, String name, String username, String password);

    void deleteById(Long id);

    Optional<User> findUserByNameAndLastname(String name, String lastname);

    UserDetails loadUserByUsername(String username) throws UsernameNotFoundException;
}
