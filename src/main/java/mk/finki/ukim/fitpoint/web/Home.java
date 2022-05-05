package mk.finki.ukim.fitpoint.web;

import mk.finki.ukim.fitpoint.Service.GymService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/")
public class Home {
    private final GymService gymService;

    public Home(GymService gymService) {
        this.gymService = gymService;
    }

    @GetMapping
    String getHome(Model model){
        model.addAttribute("gyms",gymService.findAll());
        return "home";

    }


}
