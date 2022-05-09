package mk.finki.ukim.fitpoint.bootstrap;

import lombok.Getter;
import mk.finki.ukim.fitpoint.model.Gym;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import java.util.ArrayList;
import java.util.List;

@Component
public class DataHolder {
    public static List<Gym> gyms = new ArrayList<>();

    @PostConstruct
    public void init(){
        gyms.add(new Gym(1L,"Synergy","Aerodrom"));
        gyms.add(new Gym(2L,"Magnus","Kisela Voda"));
        gyms.add(new Gym(3L,"Fierce Fitness","Centar"));
        gyms.add(new Gym(4L,"Sky Wellness","Aerodrom"));
        gyms.add(new Gym(5L,"FID","Avtokomanda"));
    }
}
