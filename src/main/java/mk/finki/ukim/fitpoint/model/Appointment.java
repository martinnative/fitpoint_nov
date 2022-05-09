package mk.finki.ukim.fitpoint.model;

import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
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

    public Appointment(Long id, LocalDateTime localDateTime, Integer duration) {
        this.id = id;
        this.localDateTime = localDateTime;
        this.duration = duration;
    }
}
