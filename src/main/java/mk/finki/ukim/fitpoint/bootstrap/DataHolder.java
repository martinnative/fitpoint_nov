package mk.finki.ukim.fitpoint.bootstrap;

import mk.finki.ukim.fitpoint.Service.GymService;
import mk.finki.ukim.fitpoint.Service.TrainerService;
import mk.finki.ukim.fitpoint.model.Gym;
import mk.finki.ukim.fitpoint.model.Trainer;
import org.springframework.stereotype.Component;
import javax.annotation.PostConstruct;


@Component
public class DataHolder {

    private final GymService gymService;
    private final TrainerService trainerService;

    public DataHolder(GymService gymService, TrainerService trainerService) {
        this.gymService = gymService;
        this.trainerService = trainerService;
    }

    @PostConstruct
    public void init(){
        this.gymService.save(new Gym(2L,"Magnus","Kisela Voda"));
        this.gymService.save(new Gym(3L,"Fierce Fitness","Centar"));
        this.gymService.save(new Gym(4L,"Sky Wellness","Aerodrom"));
        this.gymService.save(new Gym(5L,"Gladiator","Kisela Voda"));
        this.gymService.save(new Gym(6L,"FID","Avtokomanda"));

        Gym gym = new Gym(2L,"Magnus","Kisela Voda");

        this.trainerService.save(new Trainer(1L,"Marko","Markovski","075112113",gym));
    }
}
