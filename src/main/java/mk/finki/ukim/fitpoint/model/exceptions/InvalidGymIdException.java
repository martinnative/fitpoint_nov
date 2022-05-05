package mk.finki.ukim.fitpoint.model.exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(code = HttpStatus.NOT_FOUND)
public class InvalidGymIdException extends RuntimeException{
    public InvalidGymIdException(Long id) {
        super(String.format("Gym with id: %d is not found", id));
    }
}
