package mk.finki.ukim.fitpoint.config;

import mk.finki.ukim.fitpoint.Service.GymService;
import mk.finki.ukim.fitpoint.Service.TrainerService;
import mk.finki.ukim.fitpoint.model.Gym;
import mk.finki.ukim.fitpoint.model.Trainer;
import org.springframework.stereotype.Component;
import javax.annotation.PostConstruct;
import java.util.ArrayList;
import java.util.List;


@Component
public class DataHolder {

    private final GymService gymService;
    private final TrainerService trainerService;
    public DataHolder(GymService gymService, TrainerService trainerService) {
        this.gymService = gymService;
        this.trainerService = trainerService;
    }

    @PostConstruct
    public void init() {


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
