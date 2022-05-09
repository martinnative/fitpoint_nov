package mk.finki.ukim.fitpoint.config;

import mk.finki.ukim.fitpoint.Service.GymService;
import mk.finki.ukim.fitpoint.model.Gym;
import org.springframework.stereotype.Component;
import javax.annotation.PostConstruct;


@Component
public class DataHolder {

    private final GymService gymService;
    public DataHolder(GymService gymService) {
        this.gymService = gymService;
    }

    @PostConstruct
    public void init(){
        this.gymService.save(new Gym(2L,"Magnus","Kisela Voda"));
        this.gymService.save(new Gym(3L,"Fierce Fitness","Centar"));
        this.gymService.save(new Gym(4L,"Sky Wellness","Aerodrom"));
        this.gymService.save(new Gym(5L,"Gladiator","Kisela Voda"));
        this.gymService.save(new Gym(6L,"FID","Avtokomanda"));
    }
}
