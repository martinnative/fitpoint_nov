package mk.finki.ukim.fitpoint.model;

import lombok.Data;
import lombok.NoArgsConstructor;
import mk.finki.ukim.fitpoint.model.Trainer;

import javax.persistence.*;
import java.util.List;

@Data
@NoArgsConstructor
@Entity
public class Gym {
    @Id
    @GeneratedValue
    private Long id;
    private String name;
    private String location;
    @ManyToMany(mappedBy = "gyms")
    private List<Trainer> trainerName;

    public Gym(Long id, String name, String location) {
        this.id = id;
        this.name = name;
        this.location = location;
    }
}
