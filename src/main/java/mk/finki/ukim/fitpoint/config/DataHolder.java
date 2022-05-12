package mk.finki.ukim.fitpoint.config;

import mk.finki.ukim.fitpoint.Service.GymService;
import mk.finki.ukim.fitpoint.Service.TrainerService;
import mk.finki.ukim.fitpoint.Service.UserService;
import mk.finki.ukim.fitpoint.model.Gym;
import mk.finki.ukim.fitpoint.model.Trainer;
import mk.finki.ukim.fitpoint.model.User;
import org.springframework.stereotype.Component;
import javax.annotation.PostConstruct;


@Component
public class DataHolder {

    private final GymService gymService;
    private final TrainerService trainerService;
    private final UserService userService;

    public DataHolder(GymService gymService, TrainerService trainerService, UserService userService) {
        this.gymService = gymService;
        this.trainerService = trainerService;
        this.userService = userService;
    }

    @PostConstruct
    public void init() {

        userService.save(new User(1L,"Martin","martin","martin123","Fidanovski"));
        userService.save(new User(2L,"Monika","monika","moni123","Svilanovik"));
        userService.save(new User(3L,"Magdalena","magdalena","megi123","Janevska"));

        this.gymService.save(new Gym(1L, "Magnus", "Kisela Voda",trainerService.findAll()));
        this.gymService.save(new Gym(2L, "Fierce Fitness", "Centar",trainerService.findAll()));
        this.gymService.save(new Gym(3L, "Sky Wellness", "Aerodrom",trainerService.findAll()));
        this.gymService.save(new Gym(4L, "Gladiator", "Kisela Voda",trainerService.findAll()));
        this.gymService.save(new Gym(5L, "FID", "Avtokomanda",trainerService.findAll()));

        trainerService.save(new Trainer(1L, "Marko", "Simonovski", "078654123",gymService.findAll()));
        trainerService.save(new Trainer(2L, "Simon", "Petrovski", "072478102",gymService.findAll()));
        trainerService.save(new Trainer(3L, "Petar", "Markovski", "07509132",gymService.findAll()));

    }
}
