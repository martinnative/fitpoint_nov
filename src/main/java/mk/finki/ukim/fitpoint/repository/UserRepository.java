package mk.finki.ukim.fitpoint.repository;

import mk.finki.ukim.fitpoint.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface UserRepository extends JpaRepository<User,Long> {
    Optional<User> findByName(String name);
}
