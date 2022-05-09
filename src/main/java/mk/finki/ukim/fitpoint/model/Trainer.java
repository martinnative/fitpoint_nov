package mk.finki.ukim.fitpoint.model;

import lombok.Data;
import lombok.NoArgsConstructor;
import mk.finki.ukim.fitpoint.model.Gym;

import javax.persistence.*;

@Data
@Entity
@NoArgsConstructor
public class Trainer {
    @Id
    @GeneratedValue
    private Long id;
    private String name;
    private String username;
    private String password;
    private String number;
    @ManyToOne
    private Gym gym;

    public Trainer(Long id, String name, String username, String password, String number, Gym gym) {
        this.id = id;
        this.name = name;
        this.username = username;
        this.password = password;
        this.number = number;
        this.gym = gym;
    }
}
