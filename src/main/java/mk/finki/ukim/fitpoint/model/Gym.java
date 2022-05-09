package mk.finki.ukim.fitpoint.model;

import lombok.Data;
import lombok.NoArgsConstructor;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Data
@NoArgsConstructor
@Entity
public class Gym {
    @Id
    @GeneratedValue
    private Long id;
    private String name;
    private String location;

    //private Trainer trainerName;

    public Gym(Long id, String name, String location) {
        this.id = id;
        this.name = name;
        this.location = location;
    }
}
