package mk.finki.ukim.fitpoint.Service;

import mk.finki.ukim.fitpoint.model.Appointment;
import mk.finki.ukim.fitpoint.model.Gym;
import mk.finki.ukim.fitpoint.model.User;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Optional;

public interface AppointmentService {
    List<Appointment> findAll();

    Optional<Appointment> findById(Long id);

    Optional<Appointment> findByName(String name);

    Appointment save(Appointment appointment);

    Optional<Appointment> edit(Long id, LocalDateTime localDateTime, Integer duration, User use);

    void deleteById(Long id);
}
