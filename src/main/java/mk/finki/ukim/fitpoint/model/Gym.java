package mk.finki.ukim.fitpoint.model;

import lombok.Data;
import lombok.NoArgsConstructor;
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

    @OneToMany(fetch = FetchType.EAGER)
    private List<Training> trainings;

    @OneToMany
    private List<Appointment> appointments;

    public Gym(Long id, String name, String location, List<Trainer> trainerName) {
        this.id = id;
        this.name = name;
        this.location = location;
        this.trainerName = trainerName;
    }

    public Gym(Long id, String name, String location) {
        this.id = id;
        this.name = name;
        this.location = location;
    }

    public Gym(String name, String location, List<Trainer> trainerName) {
        this.name = name;
        this.location = location;
        this.trainerName = trainerName;
    }
}
