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
    public void init(){
        this.gymService.save(new Gym(2L,"Magnus","Kisela Voda"));
        this.gymService.save(new Gym(3L,"Fierce Fitness","Centar"));
        this.gymService.save(new Gym(4L,"Sky Wellness","Aerodrom"));
        this.gymService.save(new Gym(5L,"Gladiator","Kisela Voda"));
        this.gymService.save(new Gym(6L,"FID","Avtokomanda"));

        Gym gym1 = new Gym(2L,"Magnus","Kisela Voda");
        Gym gym2 = new Gym(3L,"Fierce Fitness","Centar");
        Gym gym3 = new Gym(4L,"Sky Wellness","Aerodrom");

        List<Gym> gyms = new ArrayList<>();
        gyms.add(gym1);
        gyms.add(gym2);
        gyms.add(gym3);

        trainerService.save(new Trainer(1L,"Marko","Simonovski","078654123",gyms));
        trainerService.save(new Trainer(2L,"Simon","Petrovski","072478102",gyms));
        trainerService.save(new Trainer(3L,"Petar","Markovski","07509132",gyms));

    }
}
