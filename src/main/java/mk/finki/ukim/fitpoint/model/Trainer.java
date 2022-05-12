package mk.finki.ukim.fitpoint.model;

import lombok.Data;
import lombok.NoArgsConstructor;
import mk.finki.ukim.fitpoint.model.Gym;

import javax.persistence.*;
import java.util.List;

@Data
@Entity
@NoArgsConstructor
public class Trainer {
    @Id
    @GeneratedValue
    private Long id;
    private String name;
    private String lastname;
    private String number;
    @ManyToMany()
    private List<Gym> gyms;

    @OneToOne
    private Appointment appointment;

    public Trainer(Long id, String name, String lastname, String number, List<Gym> gyms) {
        this.id = id;
        this.name = name;
        this.number = number;
        this.gyms = gyms;
        this.lastname = lastname;
    }
}
