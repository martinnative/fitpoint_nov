package mk.finki.ukim.fitpoint.model.exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

import java.util.function.Supplier;

@ResponseStatus(code = HttpStatus.NOT_FOUND)
public class InvalidGymIdException extends RuntimeException {
    public InvalidGymIdException() {
        super(String.format("Gym with id: %d is not found"));
    }
}
