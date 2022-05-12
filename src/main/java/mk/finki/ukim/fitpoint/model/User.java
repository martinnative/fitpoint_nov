package mk.finki.ukim.fitpoint.model;

import lombok.Data;
import lombok.NoArgsConstructor;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import java.util.List;

@Data
@Entity
@NoArgsConstructor
public class User {
    @Id
    @GeneratedValue
    private Long id;
    private String name;
    private String lastname;
    private String username;
    private String password;

    @OneToMany
    private List<Appointment> appointments;

    public User(Long id, String name, String username, String password, String lastname) {
        this.id = id;
        this.name = name;
        this.username = username;
        this.password = password;
        this.lastname = lastname;
    }
}
