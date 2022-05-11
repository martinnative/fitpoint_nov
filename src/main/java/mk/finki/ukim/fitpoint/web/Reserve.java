package mk.finki.ukim.fitpoint.web;
import mk.finki.ukim.fitpoint.Service.GymService;
 import mk.finki.ukim.fitpoint.model.Gym;
 import mk.finki.ukim.fitpoint.model.exceptions.InvalidGymIdException;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDateTime;

@Controller
@RequestMapping("/reserve")
public class Reserve {
    private final GymService gymService;

    public Reserve(GymService gymService) {
        this.gymService = gymService;
    }

    @GetMapping("/{id}")
    public String getReserve(@PathVariable Long id, Model model){
        Gym gym = gymService.findById(id).orElseThrow(InvalidGymIdException::new);
       model.addAttribute("gym",gym);
       model.addAttribute("trainers",gym.getTrainerName());
       return "reserve";
    }
    @PostMapping("/make-appointment/")
    public String makeAppointment (@RequestParam String name,
                                   @RequestParam String lastname,
                                   @RequestParam Long trainer,
                                   @RequestParam LocalDateTime time, Model model){

       return "redirect:/" ;
    }
}
