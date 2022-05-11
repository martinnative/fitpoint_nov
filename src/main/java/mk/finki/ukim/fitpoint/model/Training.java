package mk.finki.ukim.fitpoint.model;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.time.LocalDateTime;
import java.util.List;

@Data
@Entity
@NoArgsConstructor
public class Training {
    @Id
    @GeneratedValue
    private Long id;

    @Enumerated(EnumType.STRING)
    private TrainingType type;

    private LocalDateTime dateTime;
    private int duration;

    @OneToMany(fetch = FetchType.EAGER)
    private List<User> users;

    @ManyToOne(fetch = FetchType.EAGER)
    private Gym gym;

    public Training(Long id, TrainingType type, LocalDateTime dateTime, int duration) {
        this.id = id;
        this.type = type;
        this.dateTime = dateTime;
        this.duration = duration;
    }
}
