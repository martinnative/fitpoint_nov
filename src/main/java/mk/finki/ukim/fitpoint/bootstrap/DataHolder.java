package mk.finki.ukim.fitpoint.bootstrap;

import mk.finki.ukim.fitpoint.Service.GymService;
import mk.finki.ukim.fitpoint.model.Gym;
import mk.finki.ukim.fitpoint.repository.GymRepository;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import java.util.ArrayList;
import java.util.List;

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
        this.gymService.save(new Gym(2L,"Magnus","Kisela Voda"));
        this.gymService.save(new Gym(5L,"FID","Avtokomanda"));
    }
}
