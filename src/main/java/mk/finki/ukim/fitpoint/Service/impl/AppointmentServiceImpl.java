package mk.finki.ukim.fitpoint.Service.impl;

import mk.finki.ukim.fitpoint.Service.AppointmentService;
import mk.finki.ukim.fitpoint.model.Appointment;
import mk.finki.ukim.fitpoint.model.User;
import mk.finki.ukim.fitpoint.repository.AppointmentRepository;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Optional;

@Service
public class AppointmentServiceImpl implements AppointmentService {
    private final AppointmentRepository appointmentRepository;

    public AppointmentServiceImpl(AppointmentRepository appointmentRepository) {
        this.appointmentRepository = appointmentRepository;
    }

    @Override
    public List<Appointment> findAll() {
        return appointmentRepository.findAll();
    }

    @Override
    public Optional<Appointment> findById(Long id) {
        return appointmentRepository.findById(id);
    }

    @Override
    public Optional<Appointment> findByName(String name) {
        return Optional.empty();
    }

    @Override
    public Appointment save(Appointment appointment) {
        return appointmentRepository.save(appointment);
    }

    @Override
    public Optional<Appointment> edit(Long id, LocalDateTime localDateTime, Integer duration, User use) {
        return Optional.empty();
    }

    @Override
    public void deleteById(Long id) {
        appointmentRepository.deleteById(id);

    }
}
