package mk.finki.ukim.fitpoint.web;
import mk.finki.ukim.fitpoint.Service.AppointmentService;
import mk.finki.ukim.fitpoint.Service.GymService;
import mk.finki.ukim.fitpoint.Service.TrainerService;
import mk.finki.ukim.fitpoint.Service.UserService;
import mk.finki.ukim.fitpoint.model.Appointment;
import mk.finki.ukim.fitpoint.model.Gym;
import mk.finki.ukim.fitpoint.model.Trainer;
import mk.finki.ukim.fitpoint.model.User;
import mk.finki.ukim.fitpoint.model.exceptions.InvalidGymIdException;
import mk.finki.ukim.fitpoint.model.exceptions.InvalidTrainerException;
import mk.finki.ukim.fitpoint.model.exceptions.InvalidUserIdException;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDateTime;
import java.util.List;

@Controller
@RequestMapping("/reserve")
public class Reserve {
    private final GymService gymService;
    private final UserService userService;
    private final TrainerService trainerService;
    private final AppointmentService appointmentService;

    public Reserve(GymService gymService, UserService userService, TrainerService trainerService, AppointmentService appointmentService) {
        this.gymService = gymService;
        this.userService = userService;
        this.trainerService = trainerService;
        this.appointmentService = appointmentService;
    }

    @GetMapping("/{id}")
    public String getReserve(@PathVariable Long id, Model model){
        Gym gym = gymService.findById(id).orElseThrow(InvalidGymIdException::new);
       model.addAttribute("gym",gym);
       model.addAttribute("trainers",gym.getTrainerName());
       return "reserve";
    }
    @PostMapping("/make-appointment/{id}")
    public String makeAppointment (@RequestParam String name,
                                   @RequestParam String lastname,
                                   @RequestParam Long trainer,
                                   @RequestParam @DateTimeFormat String time, @PathVariable Long id){

        User user = userService.findUserByNameAndLastname(name,lastname).orElseThrow(InvalidUserIdException::new);
        Trainer trainer1 = trainerService.findById(trainer).orElseThrow(InvalidTrainerException::new);
        List<Appointment>appointments = user.getAppointments();
        for (Appointment appointment : appointments) {
            if (appointment.getLocalDateTime().equals(LocalDateTime.parse(time))){
                if (appointment.getTrainer().equals(trainer1)){
                    return "appointment-exists";
                }
            }
        }
        Gym gym = gymService.findById(id).orElseThrow(InvalidGymIdException::new);
        Appointment appointment = new Appointment(LocalDateTime.parse(time),1,user,gym,trainer1);
        appointmentService.save(appointment);
        return "appointment-created" ;
    }
}
