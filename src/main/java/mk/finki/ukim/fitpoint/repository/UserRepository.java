package mk.finki.ukim.fitpoint.repository;

import mk.finki.ukim.fitpoint.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;
@Repository
public interface UserRepository extends JpaRepository<User,Long> {
    Optional<User> findByName(String name);
    Optional<User> findUserByNameAndLastname(String name, String lastname);

    Optional<User> findByUsername(String username);
}
