package mk.finki.ukim.fitpoint.model;

import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.*;
import java.time.LocalDateTime;

@Data
@Entity
@NoArgsConstructor
public class Appointment {
    @Id
    @GeneratedValue
    private Long id;

    @DateTimeFormat
    private LocalDateTime localDateTime;

    private Integer duration;

    @OneToOne
    private User user;

    @OneToOne
    private Gym gym;

    @OneToOne
    private Trainer trainer;

    public Appointment(Long id, LocalDateTime localDateTime, Integer duration, User user) {
        this.id = id;
        this.localDateTime = localDateTime;
        this.duration = duration;
        this.user = user;
    }

    public Appointment(Long id, LocalDateTime localDateTime, Integer duration, User user, Gym gym, Trainer trainer) {
        this.id = id;
        this.localDateTime = localDateTime;
        this.duration = duration;
        this.user = user;
        this.gym = gym;
        this.trainer = trainer;
    }

    public Appointment(LocalDateTime localDateTime, Integer duration, User user, Gym gym, Trainer trainer) {
        this.localDateTime = localDateTime;
        this.duration = duration;
        this.user = user;
        this.gym = gym;
        this.trainer = trainer;
    }
}
