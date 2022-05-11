package mk.finki.ukim.fitpoint.model.exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(code = HttpStatus.NOT_FOUND)
public class InvalidTrainingException extends RuntimeException{
    public InvalidTrainingException() {
        super(String.format("Training with that ID was not found"));
    }
}
