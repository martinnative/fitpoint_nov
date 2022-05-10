package mk.finki.ukim.fitpoint.repository;

import mk.finki.ukim.fitpoint.model.Appointment;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AppointmentRepository extends JpaRepository<Appointment, Long> {
}
