package mk.finki.ukim.fitpoint.model.exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(code = HttpStatus.NOT_FOUND)
public class InvalidTrainerException extends RuntimeException{
    public InvalidTrainerException() {
        super(String.format("Trainer with that ID was not found"));
    }
}
