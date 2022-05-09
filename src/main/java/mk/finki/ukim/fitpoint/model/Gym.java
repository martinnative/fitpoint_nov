package mk.finki.ukim.fitpoint.model;

import lombok.Data;
import lombok.NoArgsConstructor;
import mk.finki.ukim.fitpoint.model.Trainer;

import javax.persistence.*;

@Data
@NoArgsConstructor
@Entity
public class Gym {
    @Id
    @GeneratedValue
    private Long id;
    private String name;
    private String location;

    @ManyToOne
    private Trainer trainerName;

    public Gym(Long id, String name, String location) {
        this.id = id;
        this.name = name;
        this.location = location;
    }
}
