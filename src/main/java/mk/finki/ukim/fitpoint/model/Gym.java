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

    private String description;

    public Gym(String name, String location, Long id, String description) {
        this.name = name;
        this.location = location;
        this.id=id;
        this.description=description;
    }
}
