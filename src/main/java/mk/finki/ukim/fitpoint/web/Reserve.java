package mk.finki.ukim.fitpoint.web;

import mk.finki.ukim.fitpoint.Service.GymService;
import mk.finki.ukim.fitpoint.Service.TrainerService;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDateTime;

@Controller
@RequestMapping("/reserve")
public class Reserve {
    private final GymService gymService;
    private final TrainerService trainerService;

    public Reserve(GymService gymService, TrainerService trainerService) {
        this.gymService = gymService;
        this.trainerService = trainerService;
    }

    @GetMapping("/{id}")
    public String getReserve(@PathVariable Long id, Model model){
       model.addAttribute("gym",gymService.findById(id));
       model.addAttribute("trainers",trainerService.findAll());
       return "reserve";
    }
    @PostMapping("/make-appointment/")
    public String makeAppointment (@RequestParam String name,
                                   @RequestParam String lastname,
                                   @RequestParam Long trainerId,
                                   @RequestParam LocalDateTime time, Model model){

       return "redirect:/" ;
    }
}
