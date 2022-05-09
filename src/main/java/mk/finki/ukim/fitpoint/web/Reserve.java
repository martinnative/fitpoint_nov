package mk.finki.ukim.fitpoint.web;

import mk.finki.ukim.fitpoint.Service.GymService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/reserve")
public class Reserve {
    private final GymService gymService;

    public Reserve(GymService gymService) {
        this.gymService = gymService;
    }

    @GetMapping("/{id}")
    public String getReserve(@PathVariable Long id, Model model){
       model.addAttribute("gym",gymService.findById(id));
       return "reserve";
    }
    @PostMapping("/make-appointment/")
    public String makeAppointment (){


       return "redirect:/" ;
    }
}
